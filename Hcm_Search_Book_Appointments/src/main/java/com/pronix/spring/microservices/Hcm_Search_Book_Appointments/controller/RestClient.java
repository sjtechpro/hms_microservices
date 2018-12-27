package com.pronix.spring.microservices.Hcm_Search_Book_Appointments.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos.DoctorProfile;

@Component
@FeignClient("DoctorPatient")
public interface RestClient {
	
	@RequestMapping(value="/hms/patient/doctorLookup/{specialization}", method=RequestMethod.GET)
	  List<DoctorProfile> doctorList (@PathVariable("specialization") String specialization);
	 
	@RequestMapping(value = "/hms/doctor/totaloplimit", method = RequestMethod.POST)
	 DoctorProfile totalopLimit(@RequestParam("doctorid")String doctorid);  
		 
	 
}
