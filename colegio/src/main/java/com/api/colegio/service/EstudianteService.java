package com.api.colegio.service;

import com.api.colegio.model.Estudiante;

import java.util.List;

public interface EstudianteService {

    Estudiante save(Estudiante estudiante);

    List<Estudiante> findAll();

    Estudiante findById(Integer id);

    Estudiante update(Estudiante estudiante);

    void deleteById(Integer id);

}
