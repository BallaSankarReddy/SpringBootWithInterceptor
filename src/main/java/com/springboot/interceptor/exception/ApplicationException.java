package com.springboot.interceptor.exception;

public class ApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6976005763516459426L;
	private String errorMessage;

	public ApplicationException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public ApplicationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
