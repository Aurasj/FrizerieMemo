package com.unitbv.barbershop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "utilizatori")
public class Utilizator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;

    @Column(unique = true, nullable = false)
    private String email;

    private String parola;

    private String telefon;

    @Enumerated(EnumType.STRING)
    private Rol rol;
}
