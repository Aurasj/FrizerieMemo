package com.unitbv.barbershop.controller;

import com.unitbv.barbershop.model.Serviciu;
import com.unitbv.barbershop.service.ServiciuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicii")
public class ServiciuController {

    private final ServiciuService serviciuService;

    @Autowired
    public ServiciuController(ServiciuService serviciuService) {
        this.serviciuService = serviciuService;
    }

    @PostMapping
    public ResponseEntity<Serviciu> createServiciu(@RequestBody Serviciu serviciu) {
        return ResponseEntity.ok(serviciuService.saveServiciu(serviciu));
    }

    @GetMapping
    public ResponseEntity<List<Serviciu>> getAllServicii() {
        return ResponseEntity.ok(serviciuService.getAllServicii());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServiciu(@PathVariable Long id) {
        serviciuService.deleteServiciu(id);
        return ResponseEntity.ok().build();
    }
}
