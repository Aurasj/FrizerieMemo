package com.unitbv.barbershop.controller;

import com.unitbv.barbershop.model.Programare;
import com.unitbv.barbershop.service.ProgramareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programari")
public class ProgramareController {

    private final ProgramareService programareService;

    @Autowired
    public ProgramareController(ProgramareService programareService) {
        this.programareService = programareService;
    }

    @PostMapping
    public ResponseEntity<Programare> createProgramare(@RequestBody Programare programare) {
        return ResponseEntity.ok(programareService.createProgramare(programare));
    }

    @GetMapping
    public ResponseEntity<List<Programare>> getAllProgramari() {
        return ResponseEntity.ok(programareService.getAllProgramari());
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Void> updateStatus(@PathVariable Long id, @RequestBody String status) {
        programareService.updateStatus(id, status);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProgramare(@PathVariable Long id) {
        programareService.deleteProgramare(id);
        return ResponseEntity.ok().build();
    }
}
