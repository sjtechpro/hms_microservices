package com.pronix.spring.microservices.Hcm_Search_Book_Appointments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pronix.spring.microservices.Hcm_Search_Book_Appointments.model.DoctorAppointments;

 
@Repository
public interface DoctorAppointmentsRepository extends JpaRepository<DoctorAppointments, String>{

	final String doctorCount = "SELECT * FROM doctor_appointments WHERE  doctor_id =?1 and date=?2";
	
	@Query(value=doctorCount, nativeQuery = true)
	List<DoctorAppointments> findAllByDoctorId(String doctorId, String date);

 

}
