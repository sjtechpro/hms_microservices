package com.pronix.spring.microservices.Hcm_Search_Book_Appointments.pojos;

public class DoctorProfile {

	private String userId;

	private String fullName;

	private String hospitalId;

	private String specialization;

	private String exp;

	private String qualification;

	private String timings;

	private String consultationFee;

	private int oplist;

	public DoctorProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorProfile(String userId, String fullName, String hospitalId, String specialization, String exp,
			String qualification, String timings, String consultationFee, int oplist) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.hospitalId = hospitalId;
		this.specialization = specialization;
		this.exp = exp;
		this.qualification = qualification;
		this.timings = timings;
		this.consultationFee = consultationFee;
		this.oplist = oplist;
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

	public int getOplist() {
		return oplist;
	}

	public void setOplist(int oplist) {
		this.oplist = oplist;
	}

}