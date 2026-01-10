package com.unitbv.barbershop.service;

import com.unitbv.barbershop.model.Utilizator;
import com.unitbv.barbershop.repository.UtilizatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilizatorService {

    private final UtilizatorRepository utilizatorRepository;

    @Autowired
    public UtilizatorService(UtilizatorRepository utilizatorRepository) {
        this.utilizatorRepository = utilizatorRepository;
    }

    public Utilizator registerUtilizator(Utilizator utilizator) {

        return utilizatorRepository.save(utilizator);
    }

    public List<Utilizator> getAllUtilizatori() {
        return utilizatorRepository.findAll();
    }

    public Optional<Utilizator> getUtilizatorById(Long id) {
        return utilizatorRepository.findById(id);
    }
}
