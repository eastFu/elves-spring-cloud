package cn.gyyx.elves.service;

import cn.gyyx.elves.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class TestService {

    private final static Logger LOG = LoggerFactory.getLogger(TestService.class);

    @Value("${foo}")
    String foo;

    @RequestMapping("/test")
    public String sayHello(HttpServletRequest request){
        String say = DateUtils.currentTimestamp2String("yyyy-MM-dd HH:mm:ss SSS")+": hello "+request.getRemoteAddr()+", i am elves service rt!"+foo;
//        System.out.println(say);
        return say;
    }

}
