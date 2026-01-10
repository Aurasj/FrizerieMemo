package com.unitbv.barbershop.service;

import com.unitbv.barbershop.model.Serviciu;
import com.unitbv.barbershop.repository.ServiciuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciuService {

    private final ServiciuRepository serviciuRepository;

    @Autowired
    public ServiciuService(ServiciuRepository serviciuRepository) {
        this.serviciuRepository = serviciuRepository;
    }

    public Serviciu saveServiciu(Serviciu serviciu) {
        return serviciuRepository.save(serviciu);
    }

    public List<Serviciu> getAllServicii() {
        return serviciuRepository.findAll();
    }

    public Optional<Serviciu> getServiciuById(Long id) {
        return serviciuRepository.findById(id);
    }

    public void deleteServiciu(Long id) {
        serviciuRepository.deleteById(id);
    }
}
