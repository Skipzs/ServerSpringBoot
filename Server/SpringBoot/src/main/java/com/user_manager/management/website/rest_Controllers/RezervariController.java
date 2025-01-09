package com.user_manager.management.website.rest_Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RezervariController {

@GetMapping("/rezervari")
public String rezervari(Model model){
    return "rezervari";
}

}
