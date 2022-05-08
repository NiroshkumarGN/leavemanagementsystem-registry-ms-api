package com.leavemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class LeavemanagementsystemRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeavemanagementsystemRegistryMsApiApplication.class, args);
	}

}
