package cn.gyyx.elves.util;

import cn.gyyx.elves.config.PropertyLoader;
import cn.gyyx.elves.enums.Errorcode;
import cn.gyyx.elves.thrift.AgentService;
import cn.gyyx.elves.thrift.Instruct;
import cn.gyyx.elves.thrift.Reinstruct;
import com.alibaba.fastjson.JSON;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SendThriftJobUtil {

    private static final Logger LOG = LoggerFactory.getLogger(SendThriftJobUtil.class);

    public static List<Reinstruct> sendDataAsync(String ip, List<Instruct> insList){
        TSocket transport=null;
        List<Reinstruct> resultList=null;
        try {
            transport = new TSocket(ip, PropertyLoader.THRIFT_AGENT_PORT);
            transport.setTimeout(PropertyLoader.THRIFT_OUT_TIME);
            TProtocol protocol = new TBinaryProtocol(transport);
            AgentService.Client client = new AgentService.Client(protocol);
            transport.open();
            resultList=client.instructionInvokeAsync(insList);
            LOG.info("异步指令转发到agent,返回结果："+resultList);
            return resultList;
        } catch (Exception e) {
            LOG.error("sync send data to agent error : "+ ExceptionUtil.getStackTraceAsString(e));
            return null;
        } finally {
            if(null!=transport){
                transport.close();
            }
        }
    }

    public static String sendDataSync(String ip,int timeout,Instruct ins){
        TSocket transport=null;
        Reinstruct back=null;
        try {
            transport = new TSocket(ip,PropertyLoader.THRIFT_AGENT_PORT);
            transport.setConnectTimeout(PropertyLoader.THRIFT_OUT_TIME);
            transport.setSocketTimeout(timeout);
            TProtocol protocol = new TBinaryProtocol(transport);
            AgentService.Client client = new AgentService.Client(protocol);
            long start= System.currentTimeMillis();
            System.out.println(DateUtils.date2String(new Date(start),"yyyy-MM-dd HH:mm:ss sss"));
            transport.open();
            System.out.println("open:"+DateUtils.date2String(new Date(start),"yyyy-MM-dd HH:mm:ss sss"));
            back=client.instructionInvokeSync(ins);
            long end= System.currentTimeMillis();
            System.out.println("cost:"+(end-start));
            Map<String,Object> response=new HashMap<String,Object>();
            if(back!=null){
                Map<String,Object> data=new HashMap<String,Object>();
                data.put("id",ins.getId());
                data.put("worker_flag",back.getFlag());
                data.put("worker_message",  back.getResult()==null?"":back.getResult());
                data.put("worker_costtime", back.getCosttime());

                response.put("flag","true");
                response.put("error","");
                response.put("result",data);
            }else{
                response.put("flag","false");
                response.put("error", Errorcode.ERR410_1.getValue());
            }
            return JSON.toJSONString(response);
        } catch (Exception e) {
            LOG.error("sync send data to agent error : "+ExceptionUtil.getStackTraceAsString(e));
            return null;
        } finally {
            if(null!=transport){
                transport.close();
            }
        }
    }

    public static void main(String[] args) {
        Map<String,String> s =new HashMap<>();
        s.put("cmd","ZGF0ZQ==");
        System.out.println(JSON.toJSONString(s));
        Instruct ins=new Instruct(SecurityUtil.getUniqueKey(), "10.12.53.58", "rt", "np", "test", "say", JSON.toJSONString(s), 5000, "");
        long start= System.currentTimeMillis();
        System.out.println(start);
        for(int i=0;i<50;i++){
            new Thread(){
                @Override
                public void run() {
                    sendDataSync("10.12.53.58",5000,ins);
                }
            }.start();
        }
        long end= System.currentTimeMillis();
        System.out.println("cost:"+(end-start));
    }

}
