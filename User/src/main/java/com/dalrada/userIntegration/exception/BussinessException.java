package com.dalrada.userIntegration.exception;

public class BussinessException extends Exception {

	private String errorCode ;
	private String errorMsg;
	public BussinessException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	
}
