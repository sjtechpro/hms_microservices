package com.pronix.spring.microservices.Hcm_Doctor_Patient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.PatientDetailsData;
 
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.PatientLoginStatus;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos.StatusReport;
import com.pronix.spring.microservices.Hcm_Doctor_Patient.repository.PatientDetailsRepository;

@Service
public class PatientDetailsService {
	@Autowired
	PatientDetailsRepository patientDetailsRepository;

	private List<PatientDetailsData> currentDBUserList;

	public StatusReport registerUser(PatientDetailsData registrationDetails) {
		currentDBUserList = checkMobileNumberOfPatient(registrationDetails.getMobile());
		if (currentDBUserList.size() == 0) {
			long count = patientDetailsRepository.count();
			String formatted = String.format("%08d", count + 1);
			patientDetailsRepository.save(new PatientDetailsData("PT" + formatted, registrationDetails.getFullName(),
					registrationDetails.getEmailId(), registrationDetails.getMobile(),
					registrationDetails.getPassword(), registrationDetails.getGender(), registrationDetails.getAge(),
					registrationDetails.getBloodGroup(), registrationDetails.getAddress()));
			return new StatusReport("success", 000, "registered successfully");
		} else {
			return new StatusReport("failed", 001, "Mobile Number already registered");
		}

	}

	private List<PatientDetailsData> checkMobileNumberOfPatient(String mobile) {

		return patientDetailsRepository.findUserByMobile(mobile);
	}

	public PatientLoginStatus loginUser(PatientDetailsData loginCredentials) {
		 
		PatientLoginStatus patientLoginStatus = null;
		currentDBUserList = checkMobileNumberOfPatient(loginCredentials.getMobile());
		if(currentDBUserList.size() > 0) {
			for(PatientDetailsData PatientDetailsData : currentDBUserList) {
				if(PatientDetailsData.getPassword().equals(loginCredentials.getPassword())) {
					patientLoginStatus = new PatientLoginStatus(new StatusReport("success",0000,""),PatientDetailsData);
				}else {
					patientLoginStatus = new PatientLoginStatus(new StatusReport("failed",0003,"Wrong Password"),null);
				}
				break;
			}
		}else {
			patientLoginStatus = new PatientLoginStatus(new StatusReport("failed",002,"Mobile Number Not Registered"),null);
		}
		return patientLoginStatus;
	}

	/*public PatientDetailsData viewProfile(PatientDetailsData viewProfileCredentials) {
		 
		return patientDetailsRepository.findOne(viewProfileCredentials.getUserId());
	}*/

	public StatusReport updateProfile(PatientDetailsData updateProfileCredentials) {
		try {
			patientDetailsRepository.save(updateProfileCredentials);
			return new StatusReport("success",000,"Profile Updated Successfully");
		}catch(Exception e) {
			return new StatusReport("failed",000,"ConstraintViolationException");
		}
	}

}
