package com.gestion.filmotheque.controller;

import com.gestion.filmotheque.service.IServiceFilm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/film/")
@AllArgsConstructor
public class FilmController {

    IServiceFilm iServiceFilm;

    @GetMapping("all")
    public String all(Model model){
        model.addAttribute("films", iServiceFilm.findAllFilms());
        return "affiche";
    }
}
