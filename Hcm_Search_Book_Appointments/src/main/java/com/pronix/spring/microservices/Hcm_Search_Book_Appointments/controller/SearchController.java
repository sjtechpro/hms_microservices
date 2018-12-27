package com.pronix.spring.microservices.Hcm_Search_Book_Appointments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos.DoctorProfile;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos.NextAppointment;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos.StatusReport;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.services.SearchDetailServices;
@RestController
@RequestMapping("/hms/search")
public class SearchController {
	@Autowired
	RestClient restClient;
	@Autowired
	SearchDetailServices searchDetailServices;
	
	@RequestMapping(value="doctorlookup/{specialization}", method=RequestMethod.GET)
	public List<DoctorProfile> getDoctors(@PathVariable("specialization") String specialization){
		
		return restClient.doctorList(specialization);
		
	}
	
	@RequestMapping( value = "/bookAppointment",method = RequestMethod.POST)
	public StatusReport bookAppointment(@RequestBody NextAppointment doctorAppointments){
		return searchDetailServices.bookAppointment(doctorAppointments);
	}
	
	@RequestMapping("/myAppointments/{id}")
	public List<DoctorProfile> myAppointments(@PathVariable("id") String id){
		return searchDetailServices.patientAppointments(id);
	}

}
