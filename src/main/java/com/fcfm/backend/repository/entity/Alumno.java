package com.fcfm.backend.repository.entity;

import jakarta.persistence.*;

import java.sql.Bate;


@Entity
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    @Column(name = "alumno", nullable = false)
    private Long alumnoid;

    @Column(name = "primerNombre")
    private Long primerNombre;

    @Column(name = "segundoNombre")
    private Long segundoNombre;

    @Column(name = "apellidoPat")
    private Long apellidoPat;

    @Column(name = "ApellidoMat")
    private Long ApellidoMat;

    @Column(name = "fechaNac")
    private Long fechaNac;

    @Column(name = "curp")
    private Long curp;

    @Column(name = "email")
    private Long email;


    public Alumno(String primerNombre, String segundoNombre, String apellidoPat, String apellidoMat, Date fechaNac, String curp, String email){
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.fechaNac = fechaNac;
        this.curp = curp;
        this.email = email;
    }

    public Alumno() {
        
    }

    public Long getAlumnoId(){
        return alumnoid;
    }


    public String getPrimerNombre(){ return primerNombre; }

    public void setPrimerNombre(String primerNombre) {this.primerNombre = primerNombre;}

    
}
