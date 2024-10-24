package com.api.colegio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String tipoDocumento;

    @Column
    private String numeroIdentidad;

    @Column
    private String nombres;

    @Column
    private String apellidos;

    @Column
    private Date fechaNacimiento;

    @Column
    private int edad;

    @Column
    private int grado;

    @Column
    private String email;

    @Column
    private String telefonoFijo;

    @Column
    private String celular;

}
