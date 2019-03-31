package cn.gyyx.elves.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

    private final static Logger LOG = LoggerFactory.getLogger(TestService.class);

    @RequestMapping("/test")
    public String sayHello(){
        return "hello , i am elves service rt!";
    }

}
