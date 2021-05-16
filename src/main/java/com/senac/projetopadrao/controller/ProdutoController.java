package com.senac.projetopadrao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Produto")
public class ProdutoController {

    @GetMapping("/listar")
    public String listarProdutos() {

        System.out.println("PRODUTOS");

        return "produtos";
    }

    @PostMapping("/add")
    public void addProduto() {
        System.out.println("O produto foi adicionado");
    }


}
