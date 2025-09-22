package com.repositorio_tareas.services;

import com.repositorio_tareas.entity.Tarea;
import com.repositorio_tareas.repositories.TareaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    @Autowired
    private TareaRepo tareaRepo;

    public List<Tarea> ListarTareas(){
        return tareaRepo.findAll();
    }
    public void  EliminarTarea(int id){
        tareaRepo.deleteById(id);
    }
    public Tarea guardar(Tarea tarea){
        return tareaRepo.save(tarea);
    }
    public Object actualizar(Tarea tarea, int id){
        Tarea tareabd= tareaRepo.findById(id).orElse(null);
        if(tareabd!=null){
            return tareaRepo.save(tarea);
        }
        return "La tarea con el id especificado no existe.";
    }
    public Object obtenerPorId(int id) {
        Tarea tareabd= tareaRepo.findById(id).orElse(null);
        if (tareabd != null) {
            return tareabd;
        }
        return "La tarea con el id especificado no existe.";
    }
}
