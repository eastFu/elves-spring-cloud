package cn.gyyx.elves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ElvesGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElvesGatewayApplication.class, args);
    }

}
