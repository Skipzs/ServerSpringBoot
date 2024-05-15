package com.user_manager.management.rest_controllers;

import com.user_manager.management.models.Camere;

import com.user_manager.management.services.CamereServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CamereShowController {

    @Autowired
    CamereServices camereServices;

    @GetMapping("/camere/show")
    public List<Camere> getAllCamere(){
        return camereServices.getCamere();
    }


}
