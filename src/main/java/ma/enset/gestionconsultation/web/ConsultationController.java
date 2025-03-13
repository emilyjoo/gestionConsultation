package ma.enset.gestionconsultation.web;

import ma.enset.gestionconsultation.entity.Consultation;
import ma.enset.gestionconsultation.entity.Patient;
import ma.enset.gestionconsultation.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/consultations")
public class ConsultationController {
    private final CabinetService cabinetService;

    public ConsultationController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }

    @GetMapping
    public String getConsultations(Model model) {
        List<Consultation> consultations = cabinetService.getAllConsultations();
        model.addAttribute("consultations", consultations);
        return "consultations";
    }

    @GetMapping("/new")
    public String newConsultations(Model model) {
        Consultation consultations = new Consultation();
        List<Patient> patients = cabinetService.getAllPatinets();
        model.addAttribute("consultations", consultations);
        model.addAttribute("patients", patients);
        return "addConsultation";
    }

     @PostMapping
    public String addConsultation(@ModelAttribute Consultation consultation) {
        cabinetService.addConsultation(consultation);
        return "redirect:/consultations";
    }

   @GetMapping("/edit/{id}")
    public String editConsultation(@PathVariable Long id, Model model) {
        Consultation consultation = cabinetService.getConsultationsById(id);
        model.addAttribute("consultation", consultation);
        model.addAttribute("patients", cabinetService.getAllPatinets());
        return "editConsultation";
    }

  @PostMapping("/update/{id}")
    public String updateConsultation(@PathVariable("id") long id, @ModelAttribute Consultation consultation) {
        consultation.setIdconsultation(id);
        cabinetService.updateConsultation(consultation);
        return "redirect:/consultations";
    }

    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable("id") long id) {
        cabinetService.deleteConsultationById(id);
        return "redirect:/consultations";
    }

}