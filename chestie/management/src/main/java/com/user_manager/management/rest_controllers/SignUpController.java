package com.user_manager.management.rest_controllers;

import com.user_manager.management.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SignUpController {

    @Autowired
    UserServices userService;

    @PostMapping("/angajati/register")


    public ResponseEntity registerNewUser(@RequestParam("nume")String nume,
                                          @RequestParam("prenume")String prenume,
                                          @RequestParam("email")String email,
                                          @RequestParam("password")String password,
                                          @RequestParam("status")String status){
        if(nume.isEmpty() || prenume.isEmpty() || email.isEmpty() || password.isEmpty() || status.isEmpty()){
            return new ResponseEntity<>("Te rog completeaza toate campurile!", HttpStatus.BAD_REQUEST);
        }
        int result = userService.registerNewUserServiceMethod(nume.toLowerCase()+"."+prenume.toLowerCase(),nume,prenume,email,password,status);

        if(result !=1){
            return new ResponseEntity<>("Eroare", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Succes", HttpStatus.OK);
    }
}
