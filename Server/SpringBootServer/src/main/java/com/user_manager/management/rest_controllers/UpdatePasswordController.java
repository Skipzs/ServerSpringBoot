package com.user_manager.management.rest_controllers;

import com.user_manager.management.models.ChangePass;
import com.user_manager.management.models.Login;
import com.user_manager.management.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UpdatePasswordController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/angajati/change-password")
    public ResponseEntity<String> changePassword(@RequestBody ChangePass request) {
        String username = request.getUsername();
        String oldPassword = request.getOldPassword();
        String newPassword = request.getNewPassword();

        userServices.changePasswordServiceMethod(username, oldPassword, newPassword);

        // Return a success message
        return ResponseEntity.ok("Succes");
    }
}
