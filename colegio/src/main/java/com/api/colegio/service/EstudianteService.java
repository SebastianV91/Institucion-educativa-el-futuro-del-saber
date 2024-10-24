package com.api.colegio.service;

import com.api.colegio.model.Estudiante;

public interface EstudianteService {

    Estudiante newStudent(Estudiante newStudent);

    Iterable<Estudiante> getAllStudents();

    Estudiante modifyStudent(Estudiante estudiante);

    Boolean deleteStudent(Long idEstudiante);

}
