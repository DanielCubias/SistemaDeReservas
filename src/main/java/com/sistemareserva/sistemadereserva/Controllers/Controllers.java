package com.sistemareserva.sistemadereserva.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping("/index")
    public String mostrarIndex(Model model) {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}