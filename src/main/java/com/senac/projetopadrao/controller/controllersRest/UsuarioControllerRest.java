package com.senac.projetopadrao.controller.controllersRest;

import com.senac.projetopadrao.model.Usuario;
import com.senac.projetopadrao.repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/usuarios")
public class UsuarioControllerRest {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/add")
    public String addUsuario(){

        Usuario usuario = new Usuario();
        usuario.setNome("Giovani");
        usuarioRepository.save(usuario);

        return "usuario adicionado";
    }

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation;
    import java.lang.reflect.Array;
    import java.util.ArrayList;
    import java.util.List;

    @RestController
    @RequestMapping("/usuarios")
    public class UsuarioControllerRest {

    }
        @Autowired
        UsuarioRepository usuarioRepository;

        @GetMapping("/listar")
        public ArrayList<Usuario> listar(){
            ArrayList<Usuario> usuarios = new ArrayList<>();
            usuarios = (ArrayList<Usuario>) usuarioRepository.findAll();
            return usuarios;
        }

        @PostMapping({"/add", "/addRest"})
        public String addUsuario(){

            Usuario usuario = new Usuario();
            usuario.setNome("john");
            usuario.setDataDeNascimento("08/10/2001");
            usuario.setEstadoCivil(true);
            usuarioRepository.save(usuario);
            return "usuario adicionado";
        }
        @PutMapping("/editar")
        public String editarUsuario(){
            return "usuario editado";
        }
    }
