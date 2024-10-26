package com.api.colegio.controller;

import com.api.colegio.model.Estudiante;
import com.api.colegio.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8084"})
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/nuevo")
    public Estudiante newEstudiante(@RequestBody Estudiante newEstudiante){
        return this.estudianteService.newStudent(newEstudiante);
    }

    @GetMapping("/mostrar")
    public Iterable<Estudiante> getAllStudents(){
        return estudianteService.getAllStudents();
    }

    @PostMapping("/update")
    public Estudiante updateStudent(@RequestBody Estudiante estudiante) {
        return this.estudianteService.modifyStudent(estudiante);
    }

    @PostMapping(value = "/{id}")
    public Boolean deleteEstudiante(@PathVariable(value = "id") Long id){
        return this.estudianteService.deleteStudent(id);
    }

}
