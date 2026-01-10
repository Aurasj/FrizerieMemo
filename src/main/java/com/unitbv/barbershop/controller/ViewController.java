package com.unitbv.barbershop.controller;

import com.unitbv.barbershop.service.ServiciuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private final ServiciuService serviciuService;

    @Autowired
    public ViewController(ServiciuService serviciuService) {
        this.serviciuService = serviciuService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("servicii", serviciuService.getAllServicii());
        return "index";
    }
}
