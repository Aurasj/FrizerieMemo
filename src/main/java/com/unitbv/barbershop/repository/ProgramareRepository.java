package com.unitbv.barbershop.repository;

import com.unitbv.barbershop.model.Programare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramareRepository extends JpaRepository<Programare, Long> {
}
