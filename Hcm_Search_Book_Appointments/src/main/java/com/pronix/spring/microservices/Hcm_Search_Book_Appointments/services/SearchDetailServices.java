package com.pronix.spring.microservices.Hcm_Search_Book_Appointments.services;

 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.controller.RestClient;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.model.DoctorAppointments;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos.DoctorProfile;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos.NextAppointment;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos.StatusReport;
import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.repository.DoctorAppointmentsRepository;


@Service
public class SearchDetailServices {
	
	@Autowired
	 DoctorAppointmentsRepository doctorAppointmentsRepository;
	@Autowired
	RestClient restClient;

	public StatusReport bookAppointment(NextAppointment nextAppointment) {
		System.out.println("doctorid"+nextAppointment.getDoctorId());
		String date = nextAppointment.getDate();
		Date date2 = null;
		try {
			date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 String doctorid=nextAppointment.getDoctorId();
		 DoctorProfile oplist=restClient.totalopLimit(doctorid);
		  
		int opList=oplist.getOplist();
		System.out.println("oplist size"+oplist);
		 
		List<DoctorAppointments> totalAppointment=doctorAppointmentsRepository.findAllByDoctorId(nextAppointment.getDoctorId(),nextAppointment.getDate());
		System.out.println("totalAppointment size="+ totalAppointment);
		if(totalAppointment.size() < opList) {
			long count = doctorAppointmentsRepository.count();
			String formatted = String.format("%08d", count+1);
			doctorAppointmentsRepository.save(new DoctorAppointments("DAB"+formatted,
					nextAppointment.getPatientId(),nextAppointment.getDoctorId(),nextAppointment.getHospitalId(), date2, "open"));
			return new StatusReport("success",000,"Appointment booked Successfully");
		}else {
			return new StatusReport("failure",003,"op completed already");
		}
		
		
	}

	public List<DoctorProfile> patientAppointments(String id) {
		 
		return null;
	}

}