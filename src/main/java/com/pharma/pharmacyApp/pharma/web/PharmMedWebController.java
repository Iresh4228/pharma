package com.pharma.pharmacyApp.pharma.web;

import com.pharma.pharmacyApp.pharma.model.Pharm_med;
import com.pharma.pharmacyApp.pharma.service.PharmMedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class PharmMedWebController {

    @Autowired
    private PharmMedService pharmMedService;


    @GetMapping("/showmeds")
    public String getAllMeds(Model model){
        model.addAttribute("pharm_med", pharmMedService.getAllMeds());
        return "viewmeds";
    }

    @GetMapping("/showaddmeds")
    public String showAddMeds(Pharm_med pharm_med){
        return "addMeds";
    }

    @PostMapping("/addnewmeds")
    public String addNewMeds(@Valid Pharm_med pharm_med, BindingResult result){
        if (result.hasErrors()){
            return "addMeds";
        }
        pharmMedService.addPharmed(pharm_med);
        return "redirect:/showmeds";
    }

    @GetMapping("/vieweditmedform/{id}")
    public String viewEditMeds(@PathVariable("id") Integer id, Model model){
        model.addAttribute("pharm_med", pharmMedService.getById(id));
        return "updatemeds";
    }

    @PostMapping("/updatepharmeds/{id}")
    public String updatePharMeds(@PathVariable ("id") Integer id, @Valid Pharm_med pharm_med, BindingResult result, Model model){
        if (result.hasErrors()){
            pharm_med.setIdpharmed(id);
            model.addAttribute("pharm_med", pharm_med);
            return "updatemeds";
        }
        Optional<Pharm_med> pharm_med1 = pharmMedService.updatePharMeds(id, pharm_med);
        return "redirect:/showmeds";
    }

    @GetMapping("/deletemeds/{id}")
    public String deletePharMeds(@PathVariable ("id") Integer id, Model model){
        pharmMedService.deleteMeds(id);
        return "redirect:/showmeds";
    }
}
