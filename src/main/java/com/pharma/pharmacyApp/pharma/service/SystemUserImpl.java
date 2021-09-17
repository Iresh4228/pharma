package com.pharma.pharmacyApp.pharma.service;

import com.pharma.pharmacyApp.pharma.model.System_user;
import com.pharma.pharmacyApp.pharma.repository.Systemuserrepository;
import com.sun.source.tree.OpensTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SystemUserImpl implements SystemuserService{
    @Autowired
    private Systemuserrepository systemuserrepository;


    @Override
    public void saveSystemuser(System_user system_user) {
        systemuserrepository.save(system_user);
    }

    @Override
    public List<System_user> getAllUsers() {
        List<System_user> systemUserList = new ArrayList<>();
        systemuserrepository.findAll().forEach(systemUserList::add);
        return systemUserList;
    }

    @Override
    public System_user getById(Integer id) {
        Optional<System_user> suser = Optional.ofNullable(systemuserrepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id")));
        System_user system_user = suser.get();
        return system_user;
    }

    @Override
    @Transactional
    public Optional<System_user> updateSystemUser(Integer id, System_user system_user) {
      //  system_user.setSysid(id);
        //systemuserrepository.save(system_user);
        return systemuserrepository.findById(id).map(e-> {
            e.setSysuname(system_user.getSysuname());
            e.setUpass(system_user.getUpass());
            e.setUaddress(system_user.getUaddress());
            return e;

        });
    }

    @Override
    public void deleteSystemUser(Integer id) {
        systemuserrepository.deleteById(id);
    }



}




