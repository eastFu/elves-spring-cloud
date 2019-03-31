package cn.gyyx.elves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ElvesServiceRtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElvesServiceRtApplication.class, args);
    }

}
