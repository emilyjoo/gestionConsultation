package ma.enset.gestionconsultation.service;

import ma.enset.gestionconsultation.entity.Consultation;
import ma.enset.gestionconsultation.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface CabinetService {
    void addPatient(Patient patient);
    List<Patient> getAllPatinets();
    void updatePatient(Patient patient);
    Patient getPatientById(Long id);
    void deletePatient(Patient patient);
    void deletePatientById(Long id);

    void addConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    Consultation getConsultationsById(Long id);
    void updateConsultation(Consultation patient);
    void deleteConsultationById(Long id);
}
