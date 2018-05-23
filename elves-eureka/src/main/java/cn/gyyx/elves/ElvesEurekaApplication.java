package cn.gyyx.elves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class ElvesEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElvesEurekaApplication.class, args);
	}

}
