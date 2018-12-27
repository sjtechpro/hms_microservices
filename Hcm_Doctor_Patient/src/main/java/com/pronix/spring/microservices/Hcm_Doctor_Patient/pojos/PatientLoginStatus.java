package com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.PatientDetailsData;

public class PatientLoginStatus {

	private StatusReport responseStatus;
	private PatientDetailsData patientDetailsData;

	public PatientLoginStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientLoginStatus(StatusReport responseStatus, PatientDetailsData patientDetailsData) {
		super();
		this.responseStatus = responseStatus;
		this.patientDetailsData = patientDetailsData;
	}

	public StatusReport getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(StatusReport responseStatus) {
		this.responseStatus = responseStatus;
	}

	public PatientDetailsData getPatientDetailsData() {
		return patientDetailsData;
	}

	public void setPatientDetailsData(PatientDetailsData patientDetailsData) {
		this.patientDetailsData = patientDetailsData;
	}

}
