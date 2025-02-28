package ma.enset.gestionconsultation.web;

import ma.enset.gestionconsultation.entity.Patient;
import ma.enset.gestionconsultation.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CabinetControler {
    private CabinetService cabinetService;

        public CabinetControler(CabinetService cabinetService) {
            this.cabinetService = cabinetService;
        }

    @GetMapping("/patients")
    public String getPatients(Model model) {
        List<Patient> patients = cabinetService.getAllPatinets();
        model.addAttribute("patients", patients);
        return "patients";
    }

    @GetMapping("/patients/new")
    public String newPatient(Model model) {
        Patient patients = new Patient();
        model.addAttribute("patients", patients);
        return "addPatient";
    }

    @PostMapping("/patients")
    public String addPatient(@ModelAttribute Patient patient) {
        cabinetService.addPatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/patients/edit/{id}")
    public String editPatient(@PathVariable("id") long id, Model model) {
        Patient patient = cabinetService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "editPatient";
    }

    @PostMapping("/patients/update/{id}")
    public String updatePatient(@PathVariable("id") long id, @ModelAttribute Patient patient) {
        patient.setIdpatient(id);
        cabinetService.updatePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable("id") long id) {
        cabinetService.deletePatientById(id);
        return "redirect:/patients";
    }
}
