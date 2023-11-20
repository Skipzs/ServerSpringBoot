package com.user_manager.management.services;

import com.user_manager.management.models.ShowUser;
import com.user_manager.management.models.User;
import com.user_manager.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;
    public int registerNewUserServiceMethod(String username,String nume, String prenume, String email, String password, String status){
        return userRepository.registerNewUser(username,nume,prenume,email,password,status);
    }

    //Verifica username-ul
    public List<String> checkUsernameServiceMethod(String username){
        return userRepository.checkUsername(username);
    }

    //Verifica parola username-ului
    public String checkPassByUsernameServiceMethod(String username){
        return userRepository.checkPasswordByUsername(username);
    }
    public List<User> getUsers(){
        List<User> user = new ArrayList<>();
        Streamable.of(userRepository.findAll()).forEach(user::add);
        return user;
    }
    public void deleteUser(String username) {
        userRepository.deleteByUsername(username);
    }


    //Get user details by his username
    public User getUserDetailsByUsername(String username){
        return userRepository.getUserDetailByUsername(username);
    }

   /* public ArrayList<String> getNumeServiceMethod(){
        return userRepository.getNume();
    }

    public ArrayList<String> getPrenumeServiceMethod(){
        return userRepository.getPrenume();
    }

    public ArrayList<String> getStatusServiceMethod(){
        return userRepository.getStatus();
    }*/

}
