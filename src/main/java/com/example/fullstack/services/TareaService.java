package com.example.fullstack.services;

import com.example.fullstack.models.Tarea;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {
    private List<Tarea> tareas;
    private Long siguienteId = 3L;

    public TareaService(){
        tareas = List.of(
                new Tarea("tarea1", 1, true),
                new Tarea("tarea2", 2, true),
                new Tarea("tarea3", 3, false)
        );
    }
    public List<Tarea> getTareas() {
        return tareas;
    }
    public Tarea crearTarea(Tarea tarea){
        tarea.setId(siguienteId++);
        tareas.add(tarea);
        return tarea;
    }

    public Optional<Tarea> actualizarTarea(Long id, Tarea nuevaTarea){
        return tareas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(tarea -> {
                    tarea.setTitulo(nuevaTarea.getTitulo());
                    return tarea;
                });
    }

    public boolean eliminarTarea(Long id){
        return tareas.removeIf(
                tarea -> tarea.getId().equals(id)
        );
    }
}
