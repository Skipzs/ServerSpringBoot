package com.user_manager.management.rest_controllers;

import com.user_manager.management.models.ShowUser;
import com.user_manager.management.models.User;
import com.user_manager.management.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowUsersController {


    @Autowired
    UserServices userServices;

    @GetMapping("/angajati/show")
    public List<User> getAllUsers(){
        return userServices.getUsers();
    }

}
