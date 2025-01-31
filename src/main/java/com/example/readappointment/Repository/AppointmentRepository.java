package com.example.readappointment.Repository;

import com.example.readappointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    // Buscar citas por ID de paciente
    List<Appointment> findByPatientId(Long patientId);

    // Buscar citas por ID de doctor
    List<Appointment> findByDoctorId(Long doctorId);
}
