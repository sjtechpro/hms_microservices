package com.pronix.spring.microservices.Hcm_Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HcmEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmEurekaApplication.class, args);
	}

}

