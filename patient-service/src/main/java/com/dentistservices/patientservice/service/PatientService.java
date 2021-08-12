package com.dentistservices.patientservice.service;

import com.dentistservices.patientservice.entity.Patient;
import com.dentistservices.patientservice.reposiory.PatientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient saveDepartment(Patient patient) {
        log.info("inside savepatient of patient services");
        return patientRepository.save(patient);
    }


    public Patient findByPatientId(Long patientId) {

        return patientRepository.findByPatientId(patientId);
    }
}
