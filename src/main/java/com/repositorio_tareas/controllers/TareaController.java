package com.repositorio_tareas.controllers;

import com.repositorio_tareas.entity.Tarea;
import com.repositorio_tareas.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tareas")
public class TareaController {
    @Autowired
    private TareaService service;
    @GetMapping
    public List<Tarea> ListarTareas(){
        return service.ListarTareas();
    }
    @GetMapping("/{id}")
    public Object obtenerPorId(@PathVariable int id){
        return service.obtenerPorId(id);
    }
    @DeleteMapping("/{id}")
    public void EliminarTarea(@PathVariable Integer id){
        service.EliminarTarea(id);
    }
    @PostMapping
    public Tarea guardarTarea( @RequestBody Tarea tarea){
        return service.guardar(tarea);
    }
    @PutMapping("/{id}")
    public Object actualizarTarea(@RequestBody Tarea tarea,@PathVariable int id){
        return service.actualizar(tarea, id );
    }

}
