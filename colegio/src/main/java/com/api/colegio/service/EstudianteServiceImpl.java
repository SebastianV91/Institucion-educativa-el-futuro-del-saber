package com.api.colegio.service;

import com.api.colegio.model.Estudiante;
import com.api.colegio.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService  {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findById(Integer id) {
        return estudianteRepository.findById(id).get();
    }

    @Override
    public Estudiante update(Estudiante estudiante) {
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
            return this.save(estudianteEncontrado.get());
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        estudianteRepository.deleteById(id);
    }

}
