package com.pharma.pharmacyApp.pharma.web;

import com.pharma.pharmacyApp.pharma.model.System_user;
import com.pharma.pharmacyApp.pharma.service.SystemuserService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class UserWebController {

    @Autowired
    private SystemuserService systemuserService;

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }


    @GetMapping("/showusers")
    public String getALlUsers(Model model){
        model.addAttribute("system_user", systemuserService.getAllUsers());
        return "viewuser";
    }

    @GetMapping("/showadduser")
    public String showAddUserForm(System_user system_user){
        return "addUser";
    }

    @PostMapping("/addnewuser")
    public String addNewUser(@Valid System_user system_user, BindingResult result){
        if (result.hasErrors()){
            return "addUser";
        }
        systemuserService.saveSystemuser(system_user);
        return "redirect:/showusers";
    }


    @GetMapping("/viewedituserform/{id}")
    public String viewEditUserForm(@PathVariable ("id") Integer id, Model model){
        model.addAttribute("system_user", systemuserService.getById(id));
        return "updateuser";
    }

    @PostMapping("/updatesystemuser/{id}")
    public String updateSystemUser(@PathVariable ("id") Integer id, @Valid System_user system_user, BindingResult result, Model model){
        if (result.hasErrors()){
            system_user.setSysid(id);
            model.addAttribute("system_user", system_user);
            return "updateuser";
        }
        Optional<System_user> system_user1 = systemuserService.updateSystemUser(id, system_user);
        return "redirect:/showusers";
    }



    @GetMapping("/deleteuser/{id}")
    public String deleteSystemUser(@PathVariable ("id") Integer id, Model model){
        systemuserService.deleteSystemUser(id);
        return  "redirect:/showusers";
    }


}




