package com.example.readappointment.service;

import com.example.readappointment.entity.Appointment;
import com.example.readappointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // Obtener todas las citas
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // Obtener citas por ID de paciente
    public List<Appointment> getAppointmentsByPatientId(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }

    // Obtener citas por ID de doctor
    public List<Appointment> getAppointmentsByDoctorId(Long doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }
}