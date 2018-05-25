package cn.gyyx.elves.cron.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CronController {

    private static final Logger LOG = LoggerFactory.getLogger(CronController.class);

    @RequestMapping(value = "/createCron" )
    public String createCron() {
        System.out.println("createCron ...");
        return "1731838AEFF5D6E0";
    }

    @RequestMapping(value = "/startCron")
    public String startCron() {
        System.out.println("startCron ...");
        return "1731838AEFF5D6E0";
    }

    @RequestMapping(value = "/stopCron")
    public String stopCron() {
        System.out.println("stopCron ...");
        return "1731838AEFF5D6E0";
    }

    @RequestMapping(value = "/deleteCron")
    public String deleteCron() {
        System.out.println("deleteCron ...");
        return "1731838AEFF5D6E0";
    }

    @RequestMapping(value = "/cronList")
    public String cronList() {
        System.out.println("cronList ...");
        return "1731838AEFF5D6E0";
    }

    @RequestMapping(value = "/cronDetail")
    public String cronDetail() {
        System.out.println("cronDetail ...");
        return "1731838AEFF5D6E0";
    }

    @RequestMapping(value = "/cronResult")
    public String cronResult() {
        System.out.println("cronResult ...");
        return "1731838AEFF5D6E0";
    }


}
