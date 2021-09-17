package com.pharma.pharmacyApp.pharma.service;

import com.pharma.pharmacyApp.pharma.model.Pharm_purchase;

import java.util.List;

public interface PharmPurchaseService {
    void savePurchases(Pharm_purchase pharm_purchase);

    List<Pharm_purchase> getAllPurchases();

    void updatePurchases(Integer id, Pharm_purchase pharm_purchase);

    void deletePurchases(Integer id);
}
