package com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos;

public class NextAppointment {

	private String doctorId;
	private String hospitalId;
	private String patientId;
	private String date;

	public NextAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NextAppointment(String doctorId, String hospitalId, String patientId, String date) {
		super();
		this.doctorId = doctorId;
		this.hospitalId = hospitalId;
		this.patientId = patientId;
		this.date = date;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
