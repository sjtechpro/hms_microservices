package com.pronix.spring.microservices.Hcm_Doctor_Patient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "doctor_details_data")
public class DoctorDetailsData {
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

	public DoctorDetailsData() {
		super();
		// TODO Auto-generated constructor stub
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

	public DoctorDetailsData(String userId, @NotNull String fullName, @NotNull String emailId, @NotNull String mobile,
			@NotNull String password) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.emailId = emailId;
		this.mobile = mobile;
		this.password = password;
	}

}
