package com.example.todolist08042024.controller;

import com.example.todolist08042024.Usecase.Opgaveusecase;
import com.example.todolist08042024.model.Opgave;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignments")
public class Opgavecontroller {

    Opgaveusecase opgaveusecase;

    @GetMapping//("/assignments")
    public String showAssigments(Model model) {
        model.addAttribute("opgaver", new Opgave());
        model.addAttribute("nyopgave", new Opgave(0L,""));
        return "assignments";
    }

    @PostMapping//("/assignments")
    public String addAssignments(@ModelAttribute Opgave opgave, Model model) {
        opgaveusecase.addAssignment(opgave);
        return "redirect:/assignments";
    }
}

