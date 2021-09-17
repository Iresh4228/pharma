package com.pharma.pharmacyApp.pharma.service;

import com.pharma.pharmacyApp.pharma.model.System_user;

import java.util.List;
import java.util.Optional;

public interface SystemuserService {
    void saveSystemuser(System_user system_user);

    List<System_user> getAllUsers();
    public System_user getById(Integer id);

    public Optional<System_user> updateSystemUser(Integer id, System_user system_user);

    void deleteSystemUser(Integer id);
}
