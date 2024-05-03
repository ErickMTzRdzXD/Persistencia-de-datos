package com.fcfm.backend.repository;

import com.fcfm.backend.repository.entity.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;

public class AlumnoRepositoryImpi implements AlumnoRepository{

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void insertar(Alumno alumno){ em.persist(alumno);}

    @Override
    public Alumno getAlumnoById(Long id){
    return em.find(Alumno.class, id);
    }
    
}
