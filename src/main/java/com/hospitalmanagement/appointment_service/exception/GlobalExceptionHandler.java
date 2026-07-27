package com.hospitalmanagement.appointment_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(AppointmentNotFoundException.class)
	public ResponseEntity<String> handleAppointmentNotFoundException(AppointmentNotFoundException e) {
		
		return new ResponseEntity<>(
				e.getMessage(),
				HttpStatus.NOT_FOUND);
	}

}
