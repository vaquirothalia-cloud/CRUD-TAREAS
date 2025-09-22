package com.repositorio_tareas;

import com.repositorio_tareas.entity.Tarea;
import com.repositorio_tareas.enums.Estado;
import com.repositorio_tareas.enums.Prioridad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class RepositorioTareasApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepositorioTareasApplication.class, args);

    }

}
