package cn.gyyx.elves.service;

import cn.gyyx.elves.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestService {

    private final static Logger LOG = LoggerFactory.getLogger(TestService.class);

    @RequestMapping("/test")
    public String sayHello(HttpServletRequest request){
        String say = DateUtils.currentTimestamp2String("yyyy-MM-dd HH:mm:ss SSS")+": hello "+request.getRemoteAddr()+", i am elves service rt!";
//        System.out.println(say);
        return say;
    }

}
