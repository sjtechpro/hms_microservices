package com.pronix.spring.microservices.Hcm_Search_Book_Appointments.model;

 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class DoctorAppointments {
	
	

	@Id
	private String appointmentId;
	
	@NotNull
	@Column(nullable = false)
	private String patientId;
	
	@NotNull
	@Column(nullable = false)
	private String doctorId;
	
	@NotNull
	@Column(nullable = false)
	private String hospitalId;
	
	@NotNull
	@Column(nullable = false)
	private Date date;
	
	private String appointmentStatus;

	private String dischargeDate;
	
	private String modeOfJoining;
	
	private String patientAcceptance;

	public DoctorAppointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorAppointments(String appointmentId, @NotNull String patientId, @NotNull String doctorId,
			@NotNull String hospitalId, @NotNull Date date, String appointmentStatus, String dischargeDate,
			String modeOfJoining, String patientAcceptance) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.hospitalId = hospitalId;
		this.date = date;
		this.appointmentStatus = appointmentStatus;
		this.dischargeDate = dischargeDate;
		this.modeOfJoining = modeOfJoining;
		this.patientAcceptance = patientAcceptance;
	}
	
	public DoctorAppointments(String appointmentId, @NotNull String patientId, @NotNull String doctorId,
			@NotNull String hospitalId, @NotNull Date date, String appointmentStatus) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.hospitalId = hospitalId;
		this.date = date;
		this.appointmentStatus = appointmentStatus;
	}

	 

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public String getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(String dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getModeOfJoining() {
		return modeOfJoining;
	}

	public void setModeOfJoining(String modeOfJoining) {
		this.modeOfJoining = modeOfJoining;
	}

	public String getPatientAcceptance() {
		return patientAcceptance;
	}

	public void setPatientAcceptance(String patientAcceptance) {
		this.patientAcceptance = patientAcceptance;
	}

	
}
