package com.hospitalmanagement.appointment_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.appointment_service.dto.AppointmentDTO;
import com.hospitalmanagement.appointment_service.service.AppointmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	private final AppointmentService appointmentService;
	
	public AppointmentController( AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}
	
	@PostMapping
	public ResponseEntity<AppointmentDTO> createAppointment(
			@Valid
			@RequestBody
			AppointmentDTO appointmentDTO) {
		
		AppointmentDTO appointment = appointmentService.createAppointment(appointmentDTO);
		
		return new ResponseEntity<>(
				appointment,
				HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllAppointments")
	public ResponseEntity<List<AppointmentDTO>> getAllAppointments() {
		
		List<AppointmentDTO> appointment = appointmentService.getAllAppointments();
		
		return ResponseEntity.ok(appointment);
	
	}
	
	
	@GetMapping("/{appointmentId}")
	public ResponseEntity<AppointmentDTO> getAppointById(
			@PathVariable
			String appointmentId) {
		
		AppointmentDTO appointmentDTO = appointmentService.getAppointmentById(appointmentId);
		
		return ResponseEntity.ok(appointmentDTO);
		
	}
	

}
