package com.pronix.spring.microservices.Hcm_Doctor_Patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
 

@SpringBootApplication
@EnableDiscoveryClient

public class HcmDoctorPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmDoctorPatientApplication.class, args);
	}

}

