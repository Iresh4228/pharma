package com.pharma.pharmacyApp.pharma.control;

import com.pharma.pharmacyApp.pharma.model.Pharm_med;
import com.pharma.pharmacyApp.pharma.service.PharmMedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmMedController {
    @Autowired
    private PharmMedService pharmMedService;

    @RequestMapping(method = RequestMethod.POST,value = "/addpharmmed")
    public void addPharmmed(@RequestBody Pharm_med pharm_med){pharmMedService.addPharmed(pharm_med);}

    @RequestMapping("/getAllMeds")
    public List<Pharm_med> getAllMeds(){return pharmMedService.getAllMeds();}

    @RequestMapping(method = RequestMethod.PUT,value = "/updateMeds/{id}")
    public void updateMeds(@PathVariable Integer id, @RequestBody Pharm_med pharm_med){
        pharmMedService.updatePharMeds(id, pharm_med);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteMeds/{id}")
    public void deleteMeds(@PathVariable Integer id){
        pharmMedService.deleteMeds(id);
    }
}
