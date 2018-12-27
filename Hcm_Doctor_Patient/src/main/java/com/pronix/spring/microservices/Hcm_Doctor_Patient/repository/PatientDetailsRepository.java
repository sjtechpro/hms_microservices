package com.pronix.spring.microservices.Hcm_Doctor_Patient.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.PatientDetailsData;

public interface PatientDetailsRepository extends CrudRepository<PatientDetailsData, String>{

	List<PatientDetailsData> findUserByMobile(String mobile);

	/*PatientDetailsData findOne(String userId);*/

}
