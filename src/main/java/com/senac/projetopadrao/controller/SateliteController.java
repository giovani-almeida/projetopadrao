package com.senac.projetopadrao.controller;

import com.senac.projetopadrao.model.Satelite;
import com.senac.projetopadrao.model.Usuario;
import com.senac.projetopadrao.repositorys.SateliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
@Controller
@RequestMapping("/satelites")
public class SateliteController {
    @Autowired
    SateliteRepository sateliteRepository;

    @GetMapping("/")
    public ModelAndView listarSatelites() {
        ModelAndView mv = new ModelAndView("satelites");

        ArrayList<Usuario> satelites = new ArrayList<>();

        satelites = (ArrayList<Usuario>) sateliteRepository.findAll();
        mv.addObject("satelites", satelites);
        return mv;
    }


    //https://riptutorial.com/thymeleaf/example/29269/form-submission
    @GetMapping("/add")
    public String addSatelitePage(Model model) {
        model.addAttribute("sateliteForm", new Satelite());

        return "satelites_add";
    }

    @PostMapping("/add")
    public String addSatelite(@ModelAttribute("sateliteForm") Satelite satelite) {

        sateliteRepository.save(satelite);

        return "redirect:/satelites/";
    }
}