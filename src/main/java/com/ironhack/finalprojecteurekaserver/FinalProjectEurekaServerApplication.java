package com.ironhack.finalprojecteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FinalProjectEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectEurekaServerApplication.class, args);
	}

}
