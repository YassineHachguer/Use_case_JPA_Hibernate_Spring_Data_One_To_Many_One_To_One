package com.example.patient.service;

import com.example.patient.entities.Consultation;
import com.example.patient.entities.Medecin;
import com.example.patient.entities.Patient;
import com.example.patient.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
