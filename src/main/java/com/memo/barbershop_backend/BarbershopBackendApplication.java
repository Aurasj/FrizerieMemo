package com.memo.barbershop_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.context.annotation.ComponentScan({ "com.memo.barbershop_backend", "com.unitbv.barbershop" })
@org.springframework.boot.autoconfigure.domain.EntityScan("com.unitbv.barbershop.model")
@org.springframework.data.jpa.repository.config.EnableJpaRepositories("com.unitbv.barbershop.repository")
public class BarbershopBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbershopBackendApplication.class, args);
	}

}
