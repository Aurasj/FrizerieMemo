package com.unitbv.barbershop.config;

import com.unitbv.barbershop.model.Rol;
import com.unitbv.barbershop.model.Serviciu;
import com.unitbv.barbershop.model.Utilizator;
import com.unitbv.barbershop.repository.ServiciuRepository;
import com.unitbv.barbershop.repository.UtilizatorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ServiciuRepository serviciuRepository, UtilizatorRepository utilizatorRepository) {
        return args -> {

            if (serviciuRepository.count() == 0) {
                Serviciu s1 = new Serviciu();
                s1.setNume("Tuns");
                s1.setDurataMinute(30);
                s1.setPret(50.0);
                Serviciu s2 = new Serviciu();
                s2.setNume("Barba");
                s2.setDurataMinute(15);
                s2.setPret(30.0);
                Serviciu s3 = new Serviciu();
                s3.setNume("Pachet Complet");
                s3.setDurataMinute(45);
                s3.setPret(70.0);

                serviciuRepository.saveAll(Arrays.asList(s1, s2, s3));
                System.out.println("Initialized Services");
            }

            if (utilizatorRepository.findByEmail("client@test.com").isEmpty()) {
                Utilizator client = new Utilizator();
                client.setNume("Client Test");
                client.setEmail("client@test.com");
                client.setParola("{noop}pass123");
                client.setTelefon("0700123456");
                client.setRol(Rol.CLIENT);

                utilizatorRepository.save(client);
                System.out.println("Initialized Test User: client@test.com / pass123");
            }
        };
    }
}
