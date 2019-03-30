package cn.gyyx.elves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableEurekaServer
@SpringBootApplication
//@NacosConfigurationProperties(dataId = "example",autoRefreshed = true)
//@EnableDiscoveryClient
public class ElvesSpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElvesSpringCloudApplication.class, args);
    }

}
