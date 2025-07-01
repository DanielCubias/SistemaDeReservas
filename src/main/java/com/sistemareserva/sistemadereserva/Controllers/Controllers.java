package com.sistemareserva.sistemadereserva.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping("/sistemaLogin")

    public String primertemplate() {
        return "sistemaLogin";
    }

}
