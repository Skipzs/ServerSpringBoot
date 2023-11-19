package com.user_manager.management.rest_controllers;
import com.user_manager.management.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeleteUserController {
    @Autowired
    private UserServices userServices;


}
