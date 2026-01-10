package com.unitbv.barbershop.controller;

import com.unitbv.barbershop.model.Utilizator;
import com.unitbv.barbershop.service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilizatori")
public class UtilizatorController {

    private final UtilizatorService utilizatorService;

    @Autowired
    public UtilizatorController(UtilizatorService utilizatorService) {
        this.utilizatorService = utilizatorService;
    }

    @PostMapping
    public ResponseEntity<Utilizator> createUtilizator(@RequestBody Utilizator utilizator) {
        return ResponseEntity.ok(utilizatorService.registerUtilizator(utilizator));
    }

    @GetMapping
    public ResponseEntity<List<Utilizator>> getAllUtilizatori() {
        return ResponseEntity.ok(utilizatorService.getAllUtilizatori());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Utilizator> getUtilizatorById(@PathVariable Long id) {
        return utilizatorService.getUtilizatorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
