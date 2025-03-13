package ma.enset.gestionconsultation.service;

import ma.enset.gestionconsultation.entity.Consultation;
import ma.enset.gestionconsultation.entity.Patient;
import ma.enset.gestionconsultation.repository.ConsultationRepository;
import ma.enset.gestionconsultation.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabinetServeImpl implements CabinetService{
    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;

    public CabinetServeImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public List<Patient> getAllPatinets() {
        return patientRepository.findAll();
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public Patient getPatientById(Long id) {
       return patientRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);

    }

    @Override
    public void deletePatientById(Long id) {
       patientRepository.deleteById(id);
    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);

    }


    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public Consultation getConsultationsById(Long id) {
        return consultationRepository.findById(id).orElse(null);
    }

    @Override
    public void updateConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }


    @Override
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);
    }

}
