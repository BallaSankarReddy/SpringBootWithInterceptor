package com.springboot.interceptor.exception;

public class InvalidHeaderException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6664748321814488091L;


	public InvalidHeaderException() {
		super();
	}

	public InvalidHeaderException(String errorMessage) {
		super(errorMessage);
	}

}
