package com.example.viladevinhouse.controllers;

import com.example.viladevinhouse.security.DTO.HabitantesDTO;
import com.example.viladevinhouse.security.model.Habitante;
import com.example.viladevinhouse.security.service.HabitantesService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class HomeController {

    @PostMapping({"/", "home"})
        public String home() {
        return "home";
    }
    @PostMapping("/login")
       public String login() {
       return "login";
    }

    @PostMapping("/paginaErro")
        public String paginaErro(ModelMap model) {
        model.addAttribute("alerta", "erro");
        model.addAttribute("titulo", "Dados inválidos");
        model.addAttribute("texto", "Login ou senha incorretos, tente novamente");
        model.addAttribute("subtexto", "Acesso permitido apenas para cadastro ativos");
        model.addAttribute("alerta", "erro");

        return "login";
    }

}

