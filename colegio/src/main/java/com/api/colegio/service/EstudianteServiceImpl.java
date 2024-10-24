package com.api.colegio.service;

import com.api.colegio.model.Estudiante;
import com.api.colegio.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Estudiante newStudent(Estudiante newStudent) {
        return estudianteRepository.save(newStudent);
    }

    @Override
    public Iterable<Estudiante> getAllStudents() {
        return this.estudianteRepository.findAll();
    }

    @Override
    public Estudiante modifyStudent(Estudiante estudiante) {
        Optional<Estudiante> estudianteEncontrado = this.estudianteRepository.findById(estudiante.getId());
        if(estudianteEncontrado.get() != null){
            estudianteEncontrado.get().setTipoDocumento(estudiante.getTipoDocumento());
            estudianteEncontrado.get().setNumeroIdentidad(estudiante.getNumeroIdentidad());
            estudianteEncontrado.get().setNombres(estudiante.getNombres());
            estudianteEncontrado.get().setApellidos(estudiante.getApellidos());
            estudianteEncontrado.get().setFechaNacimiento(estudiante.getFechaNacimiento());
            estudianteEncontrado.get().setEdad(estudiante.getEdad());
            estudianteEncontrado.get().setGrado(estudiante.getGrado());
            estudianteEncontrado.get().setEmail(estudiante.getEmail());
            estudianteEncontrado.get().setTelefonoFijo(estudiante.getTelefonoFijo());
            estudianteEncontrado.get().setCelular(estudiante.getCelular());
            return this.newStudent(estudianteEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteStudent(Long idEstudiante) {
        this.estudianteRepository.deleteById(idEstudiante);
        return true;
    }

}
