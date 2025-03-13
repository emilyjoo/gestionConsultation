package ma.enset.gestionconsultation.web;

import ma.enset.gestionconsultation.entity.Patient;
import ma.enset.gestionconsultation.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {
    private CabinetService cabinetService;

        public PatientController(CabinetService cabinetService) {
            this.cabinetService = cabinetService;
        }

    @GetMapping
    public String getPatients(Model model) {
        List<Patient> patients = cabinetService.getAllPatinets();
        model.addAttribute("patients", patients);
        return "patients";
    }

    @GetMapping("/new")
    public String newPatient(Model model) {
        Patient patients = new Patient();
        model.addAttribute("patients", patients);
        return "addPatient";
    }

    @PostMapping
    public String addPatient(@ModelAttribute Patient patient) {
        cabinetService.addPatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/edit/{id}")
    public String editPatient(@PathVariable("id") long id, Model model) {
        Patient patient = cabinetService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "editPatient";
    }

    @PostMapping("/update/{id}")
    public String updatePatient(@PathVariable("id") long id, @ModelAttribute Patient patient) {
        patient.setIdpatient(id);
        cabinetService.updatePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") long id) {
        cabinetService.deletePatientById(id);
        return "redirect:/patients";
    }
}
