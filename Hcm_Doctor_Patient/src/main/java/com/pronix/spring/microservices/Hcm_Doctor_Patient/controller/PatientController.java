package com.pronix.spring.microservices.Hcm_Doctor_Patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorProfile;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.PatientDetailsData;
 
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.PatientLoginStatus;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.StatusReport;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.services.DoctorServices;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.services.PatientDetailsService;

@RestController
@RequestMapping("/hms/patient")
public class PatientController {
	
	@Autowired
	PatientDetailsService patientDetailsService;
	@Autowired
	DoctorServices doctorDetailServices;
	
	@RequestMapping( value = "/register",method = RequestMethod.POST)
	public StatusReport registerUser(@RequestBody PatientDetailsData registrationDetails){
		return patientDetailsService.registerUser(registrationDetails);
	}
	
	@RequestMapping( value = "/login", method = RequestMethod.POST)
	public PatientLoginStatus loginUser(@RequestBody PatientDetailsData loginCredentials){
		return patientDetailsService.loginUser(loginCredentials);
	}
	
	/*@RequestMapping(method = RequestMethod.POST, value = "/viewProfile")
	public PatientDetailsData viewProfile(@RequestBody PatientDetailsData viewProfileCredentials){
		return patientDetailsService.viewProfile(viewProfileCredentials);
	}
	*/
	@RequestMapping(method = RequestMethod.POST, value = "/updateProfile")
	public StatusReport updateProfile(@RequestBody PatientDetailsData updateProfileCredentials){
		return patientDetailsService.updateProfile(updateProfileCredentials);
	}
	
	@RequestMapping("/doctorLookup/{specialization}")
	public List<DoctorProfile> doctorList(@PathVariable("specialization") String specialization){
		return doctorDetailServices.doctorList(specialization);
	}
	
 
	
	

}
