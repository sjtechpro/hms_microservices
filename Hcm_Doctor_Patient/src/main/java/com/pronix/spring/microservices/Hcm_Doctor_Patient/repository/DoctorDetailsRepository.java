package com.pronix.spring.microservices.Hcm_Doctor_Patient.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorDetailsData;

@Repository
public interface DoctorDetailsRepository extends CrudRepository<DoctorDetailsData, String>{

	List<DoctorDetailsData> findUserByMobile(String mobile);

}
