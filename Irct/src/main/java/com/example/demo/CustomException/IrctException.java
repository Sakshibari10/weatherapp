package com.example.demo.CustomException;

import org.springframework.http.HttpStatus;

public class IrctException extends RuntimeException {

	
	private String exMassage;
	
	private HttpStatus httpStatus;
	

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}


	public String getExMassage() {
		return exMassage;
	}

	public IrctException(String exMassage,HttpStatus httpStatus) {
		
		this.exMassage = exMassage;
		this.httpStatus = httpStatus; 
	}

	
	
	
	
}
