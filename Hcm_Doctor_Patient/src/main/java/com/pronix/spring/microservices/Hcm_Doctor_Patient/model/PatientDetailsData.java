package com.pronix.spring.microservices.Hcm_Doctor_Patient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PatientDetailsData {

	@Id
	private String userId;

	@NotNull
	@Column(nullable = false)
	private String fullName;

	@NotNull
	@Column(nullable = false)
	private String emailId;

	@NotNull
	@Column(nullable = false)
	private String mobile;

	@NotNull
	@Column(nullable = false)
	private String password;

	@NotNull
	@Column(nullable = false)
	private String gender;

	@NotNull
	@Column(nullable = false)
	private String age;

	@NotNull
	@Column(nullable = false)
	private String bloodGroup;

	@NotNull
	@Column(nullable = false)
	private String address;

	public PatientDetailsData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDetailsData(String userId, @NotNull String fullName, @NotNull String emailId, @NotNull String mobile,
			@NotNull String password, @NotNull String gender, @NotNull String age, @NotNull String bloodGroup,
			@NotNull String address) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.emailId = emailId;
		this.mobile = mobile;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.address = address;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
