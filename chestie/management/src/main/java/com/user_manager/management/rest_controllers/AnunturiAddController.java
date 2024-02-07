package com.user_manager.management.rest_controllers;

import com.user_manager.management.models.Anunturi;
import com.user_manager.management.models.Camere;
import com.user_manager.management.services.AnunturiServices;
import com.user_manager.management.services.CamereServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class AnunturiAddController {

    @Autowired
    private AnunturiServices anunturiServices;

    @PostMapping("/anunturi/add")
    public ResponseEntity addNewAnunt(
                                          @RequestParam("titlu")String titlu,
                                          @RequestParam("mainbody")String mainbody){
        if(titlu.isEmpty() || mainbody.isEmpty()){
            return new ResponseEntity<>("Te rog completeaza toate campurile!", HttpStatus.BAD_REQUEST);
        }
        int result = anunturiServices.addNewAnuntServiceMethod(new Date(),titlu,mainbody);

        if(result !=1){
            return new ResponseEntity<>("Eroare", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Succes", HttpStatus.OK);
    }

    @GetMapping("/anunturi/show")
    public List<Anunturi> getAllAnunturi(){
        return anunturiServices.getAnunturiOrderedByDateAndId();
    }


}

