package ma.enset.gestionconsultation.service;

import ma.enset.gestionconsultation.entity.Consultation;
import ma.enset.gestionconsultation.entity.Patient;

import java.util.List;

public interface CabinetService {
    void addPatient(Patient patient);
    List<Patient> getAllPatinets();
    void updatePatient(Patient patient);
    Patient getPatientById(Long id);
    void deletePatient(Patient patient);
    void deletePatientById(Long id);

    void AddConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    void updateConsulation(Consultation patient);
    void deleteConsultation(Consultation patient);
}
