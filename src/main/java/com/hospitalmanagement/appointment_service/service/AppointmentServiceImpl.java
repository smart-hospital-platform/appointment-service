package com.hospitalmanagement.appointment_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospitalmanagement.appointment_service.dto.AppointmentDTO;
import com.hospitalmanagement.appointment_service.entity.Appointment;
import com.hospitalmanagement.appointment_service.exception.AppointmentNotFoundException;
import com.hospitalmanagement.appointment_service.mapper.AppointmentMapper;
import com.hospitalmanagement.appointment_service.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	private final AppointmentRepository appointmentRepository;
	
	public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {

		this.appointmentRepository = appointmentRepository;
	}

	@Override
	public AppointmentDTO createAppointment(AppointmentDTO appointmentDTO) {
		
		Appointment appointment = AppointmentMapper.toEntity(appointmentDTO);
		
		Appointment savedAppointment = appointmentRepository.save(appointment);
		
		return AppointmentMapper.toDTO(savedAppointment);
	}

	@Override
	public List<AppointmentDTO> getAllAppointments() {
		
		List<Appointment> appointment = appointmentRepository.findAll();
		
		return appointment.stream()
				.map(AppointmentMapper::toDTO)
				.toList();
	}

	@Override
	public AppointmentDTO getAppointmentById(String appointmentId) {
		
		Appointment appointment = appointmentRepository.findById(appointmentId)
				.orElseThrow(() -> new AppointmentNotFoundException(
						"Appointment with ID : {} not found" + appointmentId));
		
		return AppointmentMapper.toDTO(appointment);
	}

}
