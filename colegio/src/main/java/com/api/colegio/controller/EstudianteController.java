package com.api.colegio.controller;

import com.api.colegio.model.Estudiante;
import com.api.colegio.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin(origins="http://localhost:4200")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping
    public Estudiante save(@RequestBody Estudiante estudiante){
        return estudianteService.save(estudiante);
    }

    @GetMapping
    public List<Estudiante> findAll(){
        return estudianteService.findAll();
    }

    @GetMapping("/{id}")
    public Estudiante findById(@PathVariable Integer id){
        return estudianteService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        estudianteService.deleteById(id);
    }

    @PutMapping
    public Estudiante updateStudent(@RequestBody Estudiante estudiante){
        return estudianteService.update(estudiante);
    }

}
