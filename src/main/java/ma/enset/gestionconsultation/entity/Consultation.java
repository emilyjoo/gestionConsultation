package ma.enset.gestionconsultation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idconsultation;
    private Date date;
    private String discription;
    @ManyToOne
    @JoinColumn(name = "idpatient")
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public long getIdconsultation() {
        return idconsultation;
    }

    public void setIdconsultation(long idconsultation) {
        this.idconsultation = idconsultation;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
