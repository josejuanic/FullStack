package com.example.fullstack.controllers;

import com.example.fullstack.models.Tarea;
import com.example.fullstack.services.TareaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService=tareaService;
    }

    @GetMapping("/tareas")
    public List<Tarea> getTareas(){
        return tareaService.getTareas();
    }

    @PostMapping("/tareas")
    public ResponseEntity<Tarea> crearTarea(
            @RequestBody Tarea tarea){
        Tarea creada = tareaService.crearTarea(tarea);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/tareas/{id}")
    public ResponseEntity<Tarea> actualizarTarea(
            @PathVariable Long id,
            @RequestBody Tarea tarea){

        return tareaService.actualizarTarea(id,tarea)
                .map(actualizada -> ResponseEntity.ok(actualizada)
                )
                .orElse(
                        ResponseEntity.notFound().build()
                );
    }

    @DeleteMapping("/tareas/{id}")
    public ResponseEntity<Void> eliminarTarea(
            @PathVariable Long id){

        boolean eliminada = tareaService.eliminarTarea(id);

        if (eliminada) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
