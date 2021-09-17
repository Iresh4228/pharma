package com.pharma.pharmacyApp.pharma.control;

import com.pharma.pharmacyApp.pharma.model.Pharm_purchase;
import com.pharma.pharmacyApp.pharma.service.PharmPurchaseService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmPurchaseController {

    @Autowired
    private PharmPurchaseService pharmPurchaseService;

    @RequestMapping(method = RequestMethod.POST,value = "/savepurchases")
    public void savePurchases(@RequestBody Pharm_purchase pharm_purchase){pharmPurchaseService.savePurchases(pharm_purchase);}

    @RequestMapping("/getAllPurchases")
    public List<Pharm_purchase> getAllPurchases(){return pharmPurchaseService.getAllPurchases();}

    @RequestMapping(method = RequestMethod.PUT,value = "/updatepurchases/{id}")
    public void updatePurchases(@PathVariable Integer id, @RequestBody Pharm_purchase pharm_purchase){
        pharmPurchaseService.updatePurchases(id,pharm_purchase);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deletepurchases/{id}")
    public void deletePurchases(@PathVariable Integer id){
        pharmPurchaseService.deletePurchases(id);
    }
}
