package com.fcfm.backend.utils;

import com.fcfm.backend.repository.entity.Alumno;

public class AlumnoMapper {

public static com.fcfm.backend.model.Alumno alumnoEntityToAlumnoModel (Alumno alumno){
    com.fcfm.backend.model.Alumno model = new com.fcfm.backend.model.Alumno();
    model.setPrimerNombre(alumno.getPrimerNombre());
    model.setSegundoNombre(alumno.getSegundoNombre());
    model.setApellidoPat(alumno.getApellidoPat());
    model.setApellidoMat(alumno.getApellidoMat());
    model.setFechaNac(alumno.getFechaNac().toString());
    model.setCurp(alumno.getCurp());
    model.setEmail(alumno.getEmail());
    return model;
  }
}
