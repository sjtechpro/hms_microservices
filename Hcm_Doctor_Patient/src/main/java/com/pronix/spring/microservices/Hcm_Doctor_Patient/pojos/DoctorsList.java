package com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos;

import com.pronix.spring.microservices.Hcm_Doctor_Patient.model.DoctorProfile;

public class DoctorsList {
	private String doctorName;
	private String doctorMobile;
	private DoctorProfile doctorProfile;
	private String hospitalName;
	private String hospitalAddress;

	public DoctorsList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorsList(String doctorName, String doctorMobile, DoctorProfile doctorProfile, String hospitalName,
			String hospitalAddress) {
		super();
		this.doctorName = doctorName;
		this.doctorMobile = doctorMobile;
		this.doctorProfile = doctorProfile;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
	}

	 

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorMobile() {
		return doctorMobile;
	}

	public void setDoctorMobile(String doctorMobile) {
		this.doctorMobile = doctorMobile;
	}

	public DoctorProfile getDoctorProfile() {
		return doctorProfile;
	}

	public void setDoctorProfile(DoctorProfile doctorProfile) {
		this.doctorProfile = doctorProfile;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

}
