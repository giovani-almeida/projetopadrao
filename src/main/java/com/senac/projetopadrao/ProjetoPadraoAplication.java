package com.senac.projetopadrao;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjetoPadraoAplication {

    public static void main(String[] args) {

        SpringBootApplication.run(ProjetoPadraoAplication.class, args);

    }

}
