package com.pronix.spring.microservices.Hcm_Search_Book_Appointments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HcmSearchBookAppointmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmSearchBookAppointmentsApplication.class, args);
	}

}

