package com.pronix.spring.microservices.Hcm_Doctor_Patient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class DoctorProfile {

	/**
	 * 
	 */
	/* private static final long serialVersionUID = -4030923516422622608L; */

	@Id
	private String userId;

	@NotNull
	@Column(nullable = false)
	private String fullName;

	@NotNull
	@Column(nullable = false)
	private String hospitalId;

	@NotNull
	@Column(nullable = false)
	private String specialization;

	@NotNull
	@Column(nullable = false)
	private String exp;

	@NotNull
	@Column(nullable = false)
	private String qualification;

	@NotNull
	@Column(nullable = false)
	private String timings;

	@NotNull
	@Column(nullable = false)
	private String consultationFee;

	@NotNull
	@Column(nullable = false)
	private int oplimit;

	public DoctorProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorProfile(Object object) {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorProfile(String userId, @NotNull String fullName, @NotNull String hospitalId,
			@NotNull String specialization, @NotNull String exp, @NotNull String qualification, @NotNull String timings,
			@NotNull String consultationFee, @NotNull int oplimit) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.hospitalId = hospitalId;
		this.specialization = specialization;
		this.exp = exp;
		this.qualification = qualification;
		this.timings = timings;
		this.consultationFee = consultationFee;
		this.oplimit = oplimit;
	}

	public DoctorProfile(String userId, @NotNull String fullName, @NotNull String hospitalId,
			@NotNull String specialization, @NotNull String exp, @NotNull String qualification, @NotNull String timings,
			@NotNull String consultationFee) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.hospitalId = hospitalId;
		this.specialization = specialization;
		this.exp = exp;
		this.qualification = qualification;
		this.timings = timings;
		this.consultationFee = consultationFee;
	}

	public DoctorProfile(@NotNull String fullName, @NotNull String hospitalId, @NotNull String specialization,
			@NotNull String exp, @NotNull String qualification, @NotNull String timings,
			@NotNull String consultationFee) {
		super();
		this.fullName = fullName;
		this.hospitalId = hospitalId;
		this.specialization = specialization;
		this.exp = exp;
		this.qualification = qualification;
		this.timings = timings;
		this.consultationFee = consultationFee;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(String consultationFee) {
		this.consultationFee = consultationFee;
	}

	public int getOplimit() {
		return oplimit;
	}

	public void setOplimit(int oplimit) {
		this.oplimit = oplimit;
	}

}
