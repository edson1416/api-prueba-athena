package com.edsonsarmiento.apiprueba.services;

import com.edsonsarmiento.apiprueba.repositories.AsignacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignacionesService {

    @Autowired
    AsignacionesRepository repository;

    public void deleteAsigna(int id){
        repository.findById(id).ifPresent(asignaciones -> repository.delete(asignaciones));
    }

    public boolean existAsig(Integer id){return repository.existsById(id);}
}
