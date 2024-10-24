package com.api.colegio.controller;

import com.api.colegio.model.Estudiante;
import com.api.colegio.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
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

    @PostMapping("/{id}")
    public Boolean deletePersona(@RequestParam Long idEstudiante){
        return this.estudianteService.deleteStudent(idEstudiante);
    }

}