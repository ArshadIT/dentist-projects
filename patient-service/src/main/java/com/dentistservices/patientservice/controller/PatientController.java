package com.dentistservices.patientservice.controller;

import com.dentistservices.patientservice.entity.Patient;
import com.dentistservices.patientservice.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@Slf4j
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/")
    public Patient savePatient(@RequestBody Patient patient) {
        log.info("Inside savePatient method of paientcontroller!");
        return patientService.saveDepartment(patient);
    }
@GetMapping("/paitent/{patientId}")
    public Patient findPatientById(Long patientId){
        log.info("Inside findPatientbyid method of paientcontroller!");
return patientService.findByPatientId(patientId);
    }


}
