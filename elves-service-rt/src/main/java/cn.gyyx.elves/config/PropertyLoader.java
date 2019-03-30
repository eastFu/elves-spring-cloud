package cn.gyyx.elves.config;

import cn.gyyx.elves.util.ExceptionUtil;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName: PropertyLoader
 * @Description: *.property 配置文件加载类
 * @author East.F
 * @date 2016年5月5日 上午11:51:27
 */
public class PropertyLoader {

	private static final Logger LOG= LoggerFactory.getLogger(PropertyLoader.class);
	
	// 属性列表
	private static Properties properties = new Properties();
	
	// 读取资源文件,设置输入流
	private static InputStream is = null;

	//zookeeper.enabled
	public static String ZOOKEEPER_ENABLED;

	//zk host
	public static String ZOOKEEPER_HOST;
	
	//zk out-time
	public static int ZOOKEEPER_OUT_TIME;
	
	//zk node
	public static String ZOOKEEPER_ROOT;
	
	//mq host
	public static String MQ_IP;
	
	//mq port
	public static int MQ_PORT;
	
	//mq user
	public static String MQ_USER;
	
	//mq pwd
	public static String MQ_PASSWORD;
	
	//mq exchange
	public static String MQ_EXCHANGE;
	
	//thrift.scheduler.port
	public static int THRIFT_SCHEDULER_PORT;
	
	//thrift.agent.port
	public static int THRIFT_AGENT_PORT;
	
	//thrift.outTime
	public static int THRIFT_OUT_TIME;

	static {
		try {
			is = PropertiesUtil.class.getResourceAsStream("/config.properties");
			properties.load(is);

    		THRIFT_SCHEDULER_PORT = Integer.parseInt(properties.getProperty("thrift.scheduler.port"));
    		THRIFT_AGENT_PORT = Integer.parseInt(properties.getProperty("thrift.agent.port"));
    		THRIFT_OUT_TIME = Integer.parseInt(properties.getProperty("thrift.outTime"));
    		
		} catch (IOException e) {
			LOG.error(ExceptionUtil.getStackTraceAsString(e));
		}
	}
}
