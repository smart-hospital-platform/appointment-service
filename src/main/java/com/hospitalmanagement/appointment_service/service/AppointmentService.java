package com.hospitalmanagement.appointment_service.service;

import java.util.List;

import com.hospitalmanagement.appointment_service.dto.AppointmentDTO;

public interface AppointmentService {
	
	AppointmentDTO createAppointment(AppointmentDTO appointmentDTO);
	List<AppointmentDTO> getAllAppointments();
	AppointmentDTO getAppointmentById(String appointmentId);

}
