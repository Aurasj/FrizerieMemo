package com.unitbv.barbershop.repository;

import com.unitbv.barbershop.model.Serviciu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciuRepository extends JpaRepository<Serviciu, Long> {
}
