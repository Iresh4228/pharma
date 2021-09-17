package com.pharma.pharmacyApp.pharma.service;


import com.pharma.pharmacyApp.pharma.model.Pharm_stock;
import com.pharma.pharmacyApp.pharma.repository.Pharmastockrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PharStockImpl implements PharmStockService{

    @Autowired
    private Pharmastockrepository pharmastockrepository;


    @Override
    public void saveStocks(Pharm_stock pharm_stock) {pharmastockrepository.save(pharm_stock);}

    @Override
    public List<Pharm_stock> getAllUsers() {
        List<Pharm_stock> pharm_stockList = new ArrayList<>();
        pharmastockrepository.findAll().forEach(pharm_stockList::add);
        return pharm_stockList;
    }

    @Override
    public void updateStocks(Integer id, Pharm_stock pharm_stock) {
        pharm_stock.setPharmstk_id(id);
        pharmastockrepository.save(pharm_stock);
    }

    @Override
    public void deleteStocks(Integer id) {
        pharmastockrepository.deleteById(id);
    }


}
