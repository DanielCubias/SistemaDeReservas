package com.sistemareserva.sistemadereserva.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping("/index")
    public String mostrarIndex(Model model) {
        model.addAttribute("title", "Inicio");
        model.addAttribute("contenidoFragment", "index :: contenido");
        return "layout";
    }

}
