package com.user_manager.management.rest_controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserControler {

    @GetMapping("/test")
    public String testEndpoint(){ return "Test end point is working";}



}
