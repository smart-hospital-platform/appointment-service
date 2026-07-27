package com.hospitalmanagement.appointment_service.mapper;

import com.hospitalmanagement.appointment_service.dto.AppointmentDTO;
import com.hospitalmanagement.appointment_service.entity.Appointment;

public class AppointmentMapper {

	// DTO -> Entity
	public static Appointment toEntity(AppointmentDTO appointmentDTO) {

		Appointment appointment = new Appointment();

		appointment.setAppointmentId(appointmentDTO.getAppointmentId());
		appointment.setPatientId(appointmentDTO.getPatientId());
		appointment.setDoctorId(appointmentDTO.getDoctorId());
		appointment.setAppointmentDate(appointmentDTO.getAppointmentDate());
		appointment.setAppointmentTime(appointmentDTO.getAppointmentTime());
		appointment.setReasonForVisit(appointmentDTO.getReasonForVisit());
		appointment.setAppointmentStatus(appointmentDTO.getAppointmentStatus());

		return appointment;
	}

	// Entity -> DTO
	public static AppointmentDTO toDTO(Appointment appointment) {

		AppointmentDTO appointmentDTO = new AppointmentDTO();

		appointmentDTO.setAppointmentId(appointment.getAppointmentId());
		appointmentDTO.setPatientId(appointment.getPatientId());
		appointmentDTO.setDoctorId(appointment.getDoctorId());
		appointmentDTO.setAppointmentDate(appointment.getAppointmentDate());
		appointmentDTO.setAppointmentTime(appointment.getAppointmentTime());
		appointmentDTO.setReasonForVisit(appointment.getReasonForVisit());
		appointmentDTO.setAppointmentStatus(appointment.getAppointmentStatus());

		return appointmentDTO;
	}
}