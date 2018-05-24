package cn.gyyx.elves.cron.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CronController {

    @RequestMapping(value = "/createCron" ,method = RequestMethod.POST)
    public String createCron(){
        System.out.println("createCron ...");
        return "1731838AEFF5D6E0";
    }
}
