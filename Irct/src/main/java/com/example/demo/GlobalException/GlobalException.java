package com.example.demo.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.CustomException.IrctException;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(exception = IrctException.class)
	public ResponseEntity handalTrsinException(IrctException ie)
	{
		return new ResponseEntity(ie.getExMassage(),ie.getHttpStatus());
	}
	
	public ResponseEntity handalAllException(Exception e)
	{
		return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
