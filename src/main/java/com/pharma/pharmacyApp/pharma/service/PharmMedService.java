package com.pharma.pharmacyApp.pharma.service;

import com.pharma.pharmacyApp.pharma.model.Pharm_med;
import com.pharma.pharmacyApp.pharma.model.System_user;

import java.util.List;
import java.util.Optional;

public interface PharmMedService {
    void addPharmed(Pharm_med pharm_med);

    List<Pharm_med> getAllMeds();

    public Optional<Pharm_med> updatePharMeds(Integer id, Pharm_med pharm_med);

    void deleteMeds(Integer id);

    public Pharm_med getById(Integer id);
}
