package com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos;

public class DoctorProfilePojo {

	private String userId;

	private String fullName;

	private String hospitalId;

	private String hospitalName;

	private String hospitalAddress;

	private String specialization;

	private String exp;

	private String qualification;

	private String timings;

	private String consultationFee;

	public DoctorProfilePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorProfilePojo(  String fullName, String hospitalId, String hospitalName,
			String hospitalAddress, String specialization, String exp, String qualification, String timings,
			String consultationFee) {
		super();
		 
		this.fullName = fullName;
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.specialization = specialization;
		this.exp = exp;
		this.qualification = qualification;
		this.timings = timings;
		this.consultationFee = consultationFee;
	}

	public DoctorProfilePojo(String fullName2, String hospitalId2, String exp2, String qualification2,
			String consultationFee2, String specialization2, String timings2) {
		super();
		this.fullName = fullName2;
		this.hospitalId = hospitalId2;
		this.specialization = specialization2;
		this.exp = exp2;
		this.qualification = qualification2;
		this.timings = timings2;
		this.consultationFee = consultationFee2;
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

}
