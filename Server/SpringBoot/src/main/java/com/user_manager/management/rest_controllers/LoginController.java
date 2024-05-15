package com.user_manager.management.rest_controllers;

import com.user_manager.management.models.Login;
import com.user_manager.management.models.User;
import com.user_manager.management.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @Autowired
    UserServices userServices;

    @PostMapping("/angajati/login")
    public ResponseEntity authenticateUser(@RequestBody Login login) {

        // get username
        List<String> username = userServices.checkUsernameServiceMethod(login.getUsername());

        //Verificarea username-ului
        if (username.isEmpty()) {
            return new ResponseEntity("Utilizatorul nu exista!", HttpStatus.NOT_FOUND);
        }

        // get user pass
        String password = userServices.checkPassByUsernameServiceMethod(login.getUsername());

        //Validarea parolei
        if (!login.getPassword().equals(password)){
            return new ResponseEntity("Numele utilizatorului sau parola sunt gresite", HttpStatus.BAD_REQUEST);
        }

        User user = userServices.getUserDetailsByUsername(login.getUsername());

        return new ResponseEntity(user,HttpStatus.OK);

    }
}
