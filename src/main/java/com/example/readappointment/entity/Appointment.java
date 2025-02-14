package com.example.readappointment.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID autogenerado
>>>>>>> 00194a5a650956651856a108e26d28805f35d357
    private Long id;

    @Column(name = "patient_id", nullable = false) // ID del paciente
    private Long patientId;

    @Column(name = "doctor_id", nullable = false) // ID del doctor
    private Long doctorId;

<<<<<<< HEAD
    @Column(name = "appointment_date_time", nullable = false)
    private LocalDateTime appointmentDateTime;

    @Column(name = "appointment_date", nullable = false)
    private String appointmentDate;

    @Column(name = "status", nullable = false)
    private String status; // e.g., "PENDING", "COMPLETED"

    // Getters and Setters
=======
    @Column(name = "appointment_date", nullable = false) // Fecha de la cita
    private LocalDate appointmentDate;

    @Column(name = "appointment_time", nullable = false) // Hora de la cita
    private LocalTime appointmentTime;

    @Column(nullable = false) // Estado de la cita
    private String status;

    // Constructor vacío (requerido por JPA)
    public Appointment() {}

    // Constructor con parámetros
    public Appointment(Long patientId, Long doctorId, LocalDate appointmentDate, LocalTime appointmentTime, String status) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    // Getters y Setters
>>>>>>> 00194a5a650956651856a108e26d28805f35d357
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}