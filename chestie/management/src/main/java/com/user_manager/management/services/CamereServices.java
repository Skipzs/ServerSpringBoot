package com.user_manager.management.services;

import com.user_manager.management.models.Camere;
import com.user_manager.management.models.User;
import com.user_manager.management.repository.CamereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CamereServices {

    @Autowired
    CamereRepository camereRepository;

/*    public int registerCamereServiceMethod(String username,String nume, String prenume, String email, String password, String status){
        return camereRepository.registerNewUser(username,nume,prenume,email,password,status);
    }*/

    public List<Integer> checkIdServiceMethod(int id){
        return camereRepository.checkId(id);
    }

    public String checkStatusById(int id){
        return camereRepository.checkStatusById(id);
    }

    public String checkObsById(int id){
        return camereRepository.checkObsById(id);
    }

    public List<Camere> getCamere(){
        List<Camere> camere = new ArrayList<>();
        Streamable.of(camereRepository.findAll()).forEach(camere::add);
        return camere;
    }


    public void changeCameraServiceMethod(int id, String obs, String status) {
        int rowsCamereAffected = camereRepository.changeCameraById(obs, status, id);

        if (rowsCamereAffected > 0) {
            System.out.println("Succes");
        } else {
            System.out.println("Fail");
        }
    }
}
