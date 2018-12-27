package com.pronix.spring.microservices.Hcm_Doctor_Patient.pojos;

public class StatusReport {

	private String status;
	private int errorCode;
	private String errorDescription;

	public StatusReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusReport(String status, int errorCode, String errorDescription) {
		super();
		this.status = status;
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
