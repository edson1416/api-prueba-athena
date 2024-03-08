package com.edsonsarmiento.apiprueba.services;

import com.edsonsarmiento.apiprueba.dto.AsignacionesDto;
import com.edsonsarmiento.apiprueba.repositories.AsignacionesRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignacionesService {

    @Autowired
    AsignacionesRepository repository;

    @Autowired
    private EntityManager entityManager;

    public void deleteAsigna(int id){
        repository.findById(id).ifPresent(asignaciones -> repository.delete(asignaciones));
    }

    public boolean existAsig(Integer id){return repository.existsById(id);}

    public void asignacionActivo(AsignacionesDto asignacionesDto){
        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("asignarActivof")
                .setParameter("lapersona", asignacionesDto.getPersonasId())
                .setParameter("elactivo", asignacionesDto.getActivosFijosId());

        storedProcedureQuery.execute();
    }
}
