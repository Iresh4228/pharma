package com.pharma.pharmacyApp.pharma.control;

import com.pharma.pharmacyApp.pharma.model.Pharm_stock;
import com.pharma.pharmacyApp.pharma.service.PharmStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PharmStockController {

    @Autowired
    private PharmStockService pharmStockService;

    @RequestMapping(method = RequestMethod.POST, value = "/addstock")
    public void saveStocks(@RequestBody Pharm_stock pharm_stock) {
        pharmStockService.saveStocks(pharm_stock);
    }

    @RequestMapping("/getAllStocks")
    public List<Pharm_stock> getAllStocks(){return pharmStockService.getAllUsers();}

    @RequestMapping(method = RequestMethod.PUT,value = "/updatestocks/{id}")
    public void updateStocks(@PathVariable Integer id, @RequestBody Pharm_stock pharm_stock){
        pharmStockService.updateStocks(id, pharm_stock);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteStocks/{id}")
    public void deleteStocks(@PathVariable Integer id){
        pharmStockService.deleteStocks(id);
    }

}
