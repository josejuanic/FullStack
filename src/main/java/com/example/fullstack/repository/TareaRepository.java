package com.example.fullstack.repository;

import com.example.fullstack.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long>{

}
