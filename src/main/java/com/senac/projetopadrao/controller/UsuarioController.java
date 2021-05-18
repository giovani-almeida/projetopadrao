package com.senac.projetopadrao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Usuarios")
public class UsuarioControllerRest {

    @GetMapping("/listar")
    public String listarUsuarios() {

        System.out.println("USUARIOS");

        return "usuarios";
    }

    @PostMapping("/add")
    public void addUsuario() {
        System.out.println("O usuario foi adicionado");
    }


}
