package com.pronix.spring.microservices.Hcm_Doctor_Patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorDetailsData;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorProfile;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.DoctorLoginStatus;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.StatusReport;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.services.DoctorServices;

@RestController
@RequestMapping("/hms/doctor")
public class DoctorController {
	
	@Autowired
	DoctorServices doctorServices;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public DoctorLoginStatus login(@RequestBody DoctorDetailsData loginCredentials){
		return doctorServices.loginUser(loginCredentials);
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public StatusReport doctorSignup(@RequestBody DoctorDetailsData registrationDetails) {
		return doctorServices.registerDoctor(registrationDetails);
	}
	
	@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
	public StatusReport DoctorProfileUpdate(@RequestBody DoctorProfile updateProfileCredentials) {
		return doctorServices.updateDoctorProfile(updateProfileCredentials);
	}
	
	@RequestMapping(value = "/totaloplimit", method = RequestMethod.POST)
	public  DoctorProfile  totalopLimit(@RequestParam ("doctorid")String doctorid) {
		System.out.println("doctoriddoctorid="+doctorid);
		return doctorServices.totalopList(doctorid);
	}
	
	
	
	/*@RequestMapping("/viewProfile/{id}")
	public DoctorProfile viewProfile(@PathVariable("id") String id){
		return doctorServices.viewProfile(id);
	}*/
}
