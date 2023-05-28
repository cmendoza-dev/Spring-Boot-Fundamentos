package com.tecsup.lab10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProductController {

    @GetMapping("/product")

    public String product (Model model) {

        int codigo = 000001;
        String producto = "MacBook";
        String descripcion = "Última generación";
        int precio = 2000;

        model.addAttribute("codigo", codigo);
        model.addAttribute("producto", producto);
        model.addAttribute("descripcion", descripcion);
        model.addAttribute("precio", precio);

        return "product";

    }
    
}
