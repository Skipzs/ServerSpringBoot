package com.user_manager.management.rest_controllers;
import com.user_manager.management.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeleteUserController {
    @Autowired
    private UserServices userServices;


    @DeleteMapping("/angajati/deleteAngajat/{nume}/{prenume}")
    public void deleteUser(@PathVariable String nume, @PathVariable String prenume) {
        String username = constructUsername(nume, prenume);
        if(!userServices.getStatus(username).equals("manager")) {
            userServices.deleteUser(username);
        }

    }


    private String constructUsername(String firstname, String lastname) {
        // Customize this method based on your username construction logic
        return lastname.toLowerCase() + "." + firstname.toLowerCase();
    }

}
