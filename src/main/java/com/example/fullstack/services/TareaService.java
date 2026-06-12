package com.example.fullstack.services;

import com.example.fullstack.models.Tarea;
import com.example.fullstack.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {
    private final TareaRepository repository;

    public TareaService(TareaRepository repository){
        this.repository = repository;
    }

    public List<Tarea> getTareas(){
        return repository.findAll();
    }

    public Tarea crearTarea(Tarea tarea){
        return repository.save(tarea);
    }

    public Optional<Tarea> actualizarTarea(
            Long id,
            Tarea nuevaTarea){
        return repository.findById(id)
                .map(tarea -> {
                    tarea.setTitulo(
                            nuevaTarea.getTitulo()
                    );
                    return repository.save(tarea);
                });
    }

    public boolean eliminarTarea(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
