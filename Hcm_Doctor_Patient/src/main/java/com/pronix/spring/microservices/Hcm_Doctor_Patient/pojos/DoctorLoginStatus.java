package com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorDetailsData;

public class DoctorLoginStatus {

	private StatusReport responseStatus;
	private DoctorDetailsData doctorDetailsData;

	public DoctorLoginStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorLoginStatus(StatusReport responseStatus, DoctorDetailsData doctorDetailsData) {
		super();
		this.responseStatus = responseStatus;
		this.doctorDetailsData = doctorDetailsData;
	}

	public StatusReport getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(StatusReport responseStatus) {
		this.responseStatus = responseStatus;
	}

	public DoctorDetailsData getDoctorDetailsData() {
		return doctorDetailsData;
	}

	public void setDoctorDetailsData(DoctorDetailsData doctorDetailsData) {
		this.doctorDetailsData = doctorDetailsData;
	}

}
