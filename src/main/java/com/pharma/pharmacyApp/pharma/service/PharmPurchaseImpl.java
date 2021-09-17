package com.pharma.pharmacyApp.pharma.service;


import com.pharma.pharmacyApp.pharma.model.Pharm_purchase;
import com.pharma.pharmacyApp.pharma.repository.Pharmpurchaserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PharmPurchaseImpl implements PharmPurchaseService{

    @Autowired
    private Pharmpurchaserepository pharmpurchaserepository;

    @Override
    public void savePurchases(Pharm_purchase pharm_purchase) {
        pharmpurchaserepository.save(pharm_purchase);
    }

    @Override
    public List<Pharm_purchase> getAllPurchases() {
        List<Pharm_purchase> allPurchasesList = new ArrayList<>();
        pharmpurchaserepository.findAll().forEach(allPurchasesList::add);
        return allPurchasesList;
    }

    @Override
    public void updatePurchases(Integer id, Pharm_purchase pharm_purchase) {
        pharm_purchase.setIdpurchase(id);
        pharmpurchaserepository.save(pharm_purchase);
    }

    @Override
    public void deletePurchases(Integer id) {
        pharmpurchaserepository.deleteById(id);
    }


}
