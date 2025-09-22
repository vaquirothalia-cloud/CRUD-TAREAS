package com.repositorio_tareas.repositories;

import com.repositorio_tareas.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepo extends JpaRepository<Tarea, Integer> {

}
