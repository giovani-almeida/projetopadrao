package com.senac.projetopadrao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Vendas")
public class VendaController {

    @GetMapping("/listar")
    public String listarVendas() {

        System.out.println("VENDAS");

        return "vendas";
    }

    @PostMapping("/add")
    public void addVenda() {
        System.out.println("A venda foi adicionado");
    }


}
