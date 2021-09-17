package com.pharma.pharmacyApp.pharma.service;

import com.pharma.pharmacyApp.pharma.model.Pharm_stock;
import com.pharma.pharmacyApp.pharma.repository.Pharmastockrepository;

import java.util.List;

public interface PharmStockService {

    void saveStocks(Pharm_stock pharm_stock);

    List<Pharm_stock> getAllUsers();

    void updateStocks(Integer id, Pharm_stock pharm_stock);

    void deleteStocks(Integer id);
}
