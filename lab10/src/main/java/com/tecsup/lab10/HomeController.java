package com.tecsup.lab10;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RequestMapping("/homecontroller")

public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        String name = "Carlos";
        String last_name = "Mendoza Solis";
        int age = 19;
        String address = "Ubr. Buenos Aires Sur";
        String email = "carlos.mendoza.s@tecsup.edu.pe";

        model.addAttribute("name", name);
        model.addAttribute("last_name", last_name);
        model.addAttribute("age", age);
        model.addAttribute("address", address);
        model.addAttribute("email", email);

        return "home";
    }

}
