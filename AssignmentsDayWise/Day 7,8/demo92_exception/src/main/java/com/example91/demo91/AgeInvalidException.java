package com.example91.demo91;

public class AgeInvalidException extends RuntimeException{
	
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public AgeInvalidException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

}
