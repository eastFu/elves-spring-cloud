package cn.gyyx.elves.service;

import cn.gyyx.elves.config.PropertyLoader;
import cn.gyyx.elves.thrift.Instruct;
import cn.gyyx.elves.util.SecurityUtil;
import cn.gyyx.elves.util.SendThriftJobUtil;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RtJobService {

    private final static Logger LOG = LoggerFactory.getLogger(RtJobService.class);

    @RequestMapping("/v3/say")
    public String sayHello(){
        return "hello";
    }


    @RequestMapping("/api/v2/rt/exec")
    public String execRt(HttpServletRequest request, HttpServletResponse response){
        Map<String, String[]> params=request.getParameterMap();
        String ip = request.getParameter("ip")==null?"": request.getParameter("ip").toString().trim();
        String mode = request.getParameter("mode")==null?"NP":request.getParameter("mode").toString().trim();
        String app = request.getParameter("app")==null?"":request.getParameter("app").toString().trim();
        String func = request.getParameter("func")==null?"":request.getParameter("func").toString().trim();

        String param = request.getParameter("param")==null?"":request.getParameter("param").toString().trim();
        String timeout = request.getParameter("timeout")==null?"":request.getParameter("timeout").toString().trim();
        String proxy = request.getParameter("proxy")==null?"":request.getParameter("proxy").toString().trim();
//        if(StringUtils.isBlank(ip)||StringUtils.isBlank(app)||StringUtils.isBlank(func)){
//            return null;
//        }
//
//        if(!"NP".equalsIgnoreCase(mode)&&!"P".equalsIgnoreCase(mode)){
//            return null;
//        }
//        if(!ip.equals("")){
//            return "success";
//        }

        //默认90s
        int outTime = 90;
        if(StringUtils.isNotBlank(timeout)){
            outTime = Integer.parseInt(timeout);
        }

//        Instruct ins=new Instruct(SecurityUtil.getUniqueKey(), ip, "rt", mode, app, func, param, outTime, proxy);
        Map<String,String> s =new HashMap<>();
        s.put("cmd","ZGF0ZQ==");
//        Instruct ins=new Instruct(SecurityUtil.getUniqueKey(), ip, "rt", "np", "test", "say", JSON.toJSONString(s), 5000, "python|app-worker.py");
        Instruct ins=new Instruct(SecurityUtil.getUniqueKey(), ip, "rt", "np", "bumblebee", "excute", JSON.toJSONString(s), 5000, "python|app-worker.py");
        String result= SendThriftJobUtil.sendDataSync(ip,outTime*1000+ PropertyLoader.THRIFT_OUT_TIME, ins);

        return result;
    }

}
