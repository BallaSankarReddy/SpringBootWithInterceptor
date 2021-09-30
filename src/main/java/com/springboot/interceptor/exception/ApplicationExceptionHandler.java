package com.springboot.interceptor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class ApplicationExceptionHandler  extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(ApplicationException.class)
	public  ResponseEntity<Object> handleCustomException(ApplicationException appExcep, WebRequest request){
		
		if(appExcep instanceof InvalidHeaderException) {
			return  new ResponseEntity<>(appExcep.getErrorMessage(), HttpStatus.BAD_REQUEST);
			
		}
		
		return null;
	}
	
	

}
