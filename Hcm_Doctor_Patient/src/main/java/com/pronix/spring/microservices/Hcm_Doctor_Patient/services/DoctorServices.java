package com.pronix.spring.microservices.Hcm_Doctor_Patient.services;

import java.util.ArrayList;
import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorDetailsData;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorProfile;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.DoctorLoginStatus;
 
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.StatusReport;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.repository.DoctorDetailsRepository;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.repository.DoctorProfileRepository;

@Service
public class DoctorServices {
	@Autowired
	DoctorDetailsRepository doctorDetailsRepository;

	@Autowired
	DoctorProfileRepository doctorProfileRepository;

	private List<DoctorDetailsData> currentDBUserList;

	public StatusReport registerDoctor(DoctorDetailsData registrationDetails) {
		currentDBUserList = checkMobileNumberOfDoctor(registrationDetails.getMobile());
		if (currentDBUserList.size() == 0) {
			long count = doctorDetailsRepository.count();
			String formatted = String.format("%08d", count + 1);
			doctorDetailsRepository.save(new DoctorDetailsData("DR" + formatted, registrationDetails.getFullName(),
					registrationDetails.getEmailId(), registrationDetails.getMobile(),
					registrationDetails.getPassword()));
			return new StatusReport("success", 000, "registered successfully");
		} else {
			return new StatusReport("failed", 001, "Mobile Number already registered");
		}

	}

	private List<DoctorDetailsData> checkMobileNumberOfDoctor(String mobile) {

		return doctorDetailsRepository.findUserByMobile(mobile);
	}

	public StatusReport updateDoctorProfile(DoctorProfile updateProfileCredentials) {
		doctorProfileRepository.save(updateProfileCredentials);
		return new StatusReport("success", 000, "Profile Updated Successfully");
	}

	public DoctorLoginStatus loginUser(DoctorDetailsData loginCredentials) {
		DoctorLoginStatus doctorloginStatus = null;
		currentDBUserList = checkMobileNumberOfDoctor(loginCredentials.getMobile());
		if (currentDBUserList.size() > 0) {
			for (DoctorDetailsData doctorDetailsData : currentDBUserList) {
				if (doctorDetailsData.getPassword().equals(loginCredentials.getPassword())) {
					doctorloginStatus = new DoctorLoginStatus(new StatusReport("success", 0000, ""), doctorDetailsData);
				} else {
					doctorloginStatus = new DoctorLoginStatus(new StatusReport("failed", 0003, "Wrong Password"), null);
				}
				break;
			}
		} else {
			doctorloginStatus = new DoctorLoginStatus(new StatusReport("failed", 0002, "Mobile Number Not Registered"),
					null);
		}
		return doctorloginStatus;
	}

	public List<DoctorProfile> doctorList(String specialization) {
		System.out.println("specialization = "+specialization);
		DoctorProfile docprof = null;
		List<DoctorProfile> doctorProfList=new ArrayList<>();
		List<DoctorProfile> doctorProfileList = doctorProfileRepository.searchDoctors(specialization);
		System.out.println("size"+doctorProfileList.size());
		for (DoctorProfile doctorList : doctorProfileList) {
			
			docprof = new DoctorProfile(doctorList.getFullName(), doctorList.getHospitalId(), doctorList.getExp(),
					doctorList.getQualification(), doctorList.getConsultationFee(), doctorList.getSpecialization(),
					doctorList.getTimings());
			doctorProfList.add(docprof);
		}
		return doctorProfList;
	}

	public  DoctorProfile  totalopList(String doctorid) {
		return doctorProfileRepository.findallBydoctorid(doctorid);
		 
	}

	/*
	 * public DoctorProfile viewProfile(String id) { DoctorProfile doctorProfile =
	 * doctorProfileRepository.findOne(id); if(doctorProfile != null) { //
	 * HospitalsList hospitalsList =
	 * hospitalsListDAO.findOne(doctorProfile.getHospitalId()); return new
	 * DoctorProfile (doctorProfile.getUserId(),doctorProfile.getFullName(),
	 * doctorProfile.getHospitalId(),
	 * doctorProfile.getSpecialization(),doctorProfile.getExp(),doctorProfile.
	 * getQualification(),
	 * doctorProfile.getTimings(),doctorProfile.getConsultationFee()); }else {
	 * return new DoctorProfile(null); }
	 * 
	 * }
	 */
}
