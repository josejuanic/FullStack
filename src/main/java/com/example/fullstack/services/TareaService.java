package com.example.fullstack.services;

import com.example.fullstack.models.Tarea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    private List<Tarea> tareas;
    public TareaService(){
        tareas = List.of(new Tarea("tarea1", 1, true
        ), new Tarea("tarea2", 2, true), new Tarea("tarea3", 3, false));
    }
    public List<Tarea> getTareas() {
        return tareas;
    }

}
