package com.example.fullstack.controllers;

import com.example.fullstack.models.Tarea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TareaController {
    @GetMapping("/tareas")
    public List<Tarea> getTareas() {
        return List.of(new Tarea("tarea1", 1, true
        ), new Tarea("tarea2", 2, true), new Tarea("tarea3", 3, false));
    }
}
