package com.example.ssm.exception;

public class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4502095523989616028L;
	
	/**
	 * 异常信息
	 */
	private String message;
	
	public CustomException(String message) {
	
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
