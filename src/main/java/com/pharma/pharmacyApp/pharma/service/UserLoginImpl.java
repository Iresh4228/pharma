package com.pharma.pharmacyApp.pharma.service;

import com.pharma.pharmacyApp.pharma.control.UserLoginController;
import com.pharma.pharmacyApp.pharma.model.User_login;
import com.pharma.pharmacyApp.pharma.repository.Userloginrepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserLoginImpl implements UserLoginService{

    @Autowired
    private Userloginrepository userloginrepository;




    @Override
    public List<User_login> getLogUsers() {
        List<User_login> userLoginList = new ArrayList<>();
        userloginrepository.findAll().forEach(userLoginList::add);
        return userLoginList;
    }

    @Override
    public Optional<User_login> updateLogUser(Integer id, User_login user_login) {
        return userloginrepository.findById(id).map(e->{
            e.setLoguname(user_login.getLoguname());
            e.setLogpass(user_login.getLogpass());
            return e;
        });
    }

    @Override
    public void deleteLogUser(Integer id) {

    }

    @Override
    public void saveUserLogin(User_login user_login) {
        userloginrepository.save(user_login);
    }

}
