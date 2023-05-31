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
        int codigo = 00013;
        String last_name = "Mendoza Solis";
        String name = "Carlos";
        int dni = 62228372;
        String ocupacion = "Software Development";
        String sueldo = "1056";

        model.addAttribute("codigo", codigo);
        model.addAttribute("last_name", last_name);
        model.addAttribute("name", name);
        model.addAttribute("dni", dni);
        model.addAttribute("ocupacion", ocupacion);
        model.addAttribute("sueldo", sueldo);

        return "home";
    }

}
