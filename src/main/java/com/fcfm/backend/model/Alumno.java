package com.fcfm.backend.model;

public class Alumno {

    String nombre;
    String apellidoPat;
    String getApellidoMat;
    Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getGetApellidoMat() {
        return getApellidoMat;
    }

    public void setGetApellidoMat(String getApellidoMat) {
        this.getApellidoMat = getApellidoMat;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setFechaNac(String date) {
    }
}
