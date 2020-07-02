package com.ironhack.eurekaserverminiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMiniprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMiniprojectApplication.class, args);
	}

}
