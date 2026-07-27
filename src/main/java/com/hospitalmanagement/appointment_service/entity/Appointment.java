package com.hospitalmanagement.appointment_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

	@Id
	private String appointmentId;

	private String patientId;

	private String doctorId;

	private LocalDate appointmentDate;

	private LocalTime appointmentTime;

	private String reasonForVisit;

	private String appointmentStatus;
}
