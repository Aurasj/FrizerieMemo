package com.unitbv.barbershop.service;

import com.unitbv.barbershop.model.Programare;
import com.unitbv.barbershop.repository.ProgramareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramareService {

    private final ProgramareRepository programareRepository;

    @Autowired
    public ProgramareService(ProgramareRepository programareRepository) {
        this.programareRepository = programareRepository;
    }

    public Programare createProgramare(Programare programare) {
        return programareRepository.save(programare);
    }

    public List<Programare> getAllProgramari() {
        return programareRepository.findAll();
    }

    public Optional<Programare> getProgramareById(Long id) {
        return programareRepository.findById(id);
    }

    public void updateStatus(Long id, String newStatus) {
        programareRepository.findById(id).ifPresent(programare -> {
            programare.setStatus(newStatus);
            programareRepository.save(programare);
        });
    }

    public void deleteProgramare(Long id) {
        programareRepository.deleteById(id);
    }
}
