package com.unitbv.barbershop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "programari")
public class Programare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataOra;

    private String status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Utilizator client;

    @ManyToOne
    @JoinColumn(name = "angajat_id")
    private Utilizator angajat;

    @ManyToOne
    @JoinColumn(name = "serviciu_id")
    private Serviciu serviciu;
}
