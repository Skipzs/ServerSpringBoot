package com.user_manager.management.rest_controllers;

import com.user_manager.management.models.ChangeCamera;
import com.user_manager.management.services.CamereServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamereChangeController {


    @Autowired
    private CamereServices camereServices;


    @PostMapping("/camere/change")
    public ResponseEntity<String> changeCamera(@RequestBody ChangeCamera request) {
        try {
            int id = request.getId();
            String obs = request.getObs();
            String status = request.getStatus();

            camereServices.changeCameraServiceMethod(id, obs, status);

            // Return a success message
            return ResponseEntity.ok("Success");
        } catch (Exception e) {
            // Log the exception for further analysis
            // You can also customize the error message based on the exception type
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }


}
