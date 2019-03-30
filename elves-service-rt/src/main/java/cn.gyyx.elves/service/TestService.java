package cn.gyyx.elves.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class TestService {

    private final static Logger LOG = LoggerFactory.getLogger(TestService.class);

    @Value("${name:xiaozhang}")
    private String name;

    @RequestMapping("/test")
    public String sayHello(){
        return name;
    }

}
