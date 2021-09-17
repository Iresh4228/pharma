package com.pharma.pharmacyApp.pharma.service;

import ch.qos.logback.core.read.ListAppender;
import com.pharma.pharmacyApp.pharma.model.Pharm_med;
import com.pharma.pharmacyApp.pharma.repository.Pharmedrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PharmMedImpl implements PharmMedService{

    @Autowired
    private Pharmedrepository pharmedrepository;

    @Override
    public void addPharmed(Pharm_med pharm_med) {pharmedrepository.save(pharm_med);}

    @Override
    public List<Pharm_med> getAllMeds() {
        List<Pharm_med> pharm_medList = new ArrayList<>();
        pharmedrepository.findAll().forEach(pharm_medList::add);
        return pharm_medList;
    }

    @Override
    @Transactional
    public Optional<Pharm_med> updatePharMeds(Integer id, Pharm_med pharm_med) {
        return pharmedrepository.findById(id).map(e->{
            e.setPharmmedname(pharm_med.getPharmmedname());
            e.setPharmmedtype(pharm_med.getPharmmedtype());
            return e;
        });
    }


    @Override
    public void deleteMeds(Integer id) {
        pharmedrepository.deleteById(id);
    }

    @Override
    public Pharm_med getById(Integer id) {
        Optional<Pharm_med> pmed = Optional.ofNullable(pharmedrepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid med Id")));
        Pharm_med pharm_med = pmed.get();
        return pharm_med;
    }

}
