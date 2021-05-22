package com.senac.projetopadrao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjetoPadraoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjetoPadraoApplication.class, args);

    }

}
