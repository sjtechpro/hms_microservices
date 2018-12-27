package com.pronix.spring.microservices.Hcm_Doctor_Patient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorProfile;

 

public interface DoctorProfileRepository extends JpaRepository<DoctorProfile, String>{

	
	final String search = "SELECT * FROM  doctor_profile WHERE  specialization =?1 ";
//	List<DoctorProfilePojo> findDoctorBySpecialization(String specialization);
	
	@Query(value = search, nativeQuery = true)
	List<DoctorProfile> searchDoctors(String specialization);

    final String doctorCount = "SELECT * FROM doctor_profile WHERE  user_id=?1";
	
	@Query(value=doctorCount, nativeQuery = true)
	DoctorProfile  findallBydoctorid(String doctorid);

	 

	 

	 

}
