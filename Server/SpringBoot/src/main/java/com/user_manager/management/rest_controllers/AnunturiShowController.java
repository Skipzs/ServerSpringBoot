package com.user_manager.management.rest_controllers;

import com.user_manager.management.models.Anunturi;
import com.user_manager.management.services.AnunturiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnunturiShowController {

    @Autowired
    AnunturiServices anunturiServices;

    @PostMapping("/anunturi/show")
    public List<Anunturi> getAllAnunturi(){
        return anunturiServices.getAnunturiOrderedByDateAndId();
    }

}
