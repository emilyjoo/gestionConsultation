package ma.enset.gestionconsultation;

import ma.enset.gestionconsultation.entity.Consultation;
import ma.enset.gestionconsultation.entity.Patient;
import ma.enset.gestionconsultation.repository.ConsultationRepository;
import ma.enset.gestionconsultation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class GestionConsultationApplication implements CommandLineRunner {
   PatientRepository patientRepository;
   ConsultationRepository consultationRepository;

    public GestionConsultationApplication(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(GestionConsultationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    /*
        Patient patient = new Patient();
        patient.setNom("kim");
        patient.setPrenom("John");
        patient.setEmail("kim@gmail.com");
        patient.setTel("123456789");



        patient.setNom("Bahi");
        patient.setPrenom("Bahi");
        patient.setEmail("bahi@gmail.com");
        patient.setTel("6666666");
        patientRepository.save(patient);

        Patient patient = patientRepository.findById(2L).get();
        Consultation consultation = new Consultation();
        consultation.setDate(Date.valueOf(LocalDate.of(2034, Month.AUGUST,26)));
        consultation.setDiscription("Consultation 1");
        consultation.setPatient(patient);

        consultationRepository.save(consultation);*/
    }
}
