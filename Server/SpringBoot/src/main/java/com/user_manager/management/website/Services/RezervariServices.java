package com.user_manager.management.website.Services;

import com.user_manager.management.website.Repository.RezervariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class RezervariServices {

    @Autowired
    RezervariRepository rezervariRepository;

    public int addNewRezervareServiceMethod(String nume, String prenume, int cnp, int telefon, String email, Date data){
        return rezervariRepository.addNewRezervare(nume,prenume,cnp,telefon,email,data);
    }

}
