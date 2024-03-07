package com.edsonsarmiento.apiprueba.services;

import com.edsonsarmiento.apiprueba.dto.ActivosFijosDto;
import com.edsonsarmiento.apiprueba.entitys.ActivosFijos;
import com.edsonsarmiento.apiprueba.mappers.ActivosFijosMapper;
import com.edsonsarmiento.apiprueba.repositories.ActivosFijosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ActivosFijosService {

    @Autowired
    ActivosFijosRepository repository;

    @GetMapping("losactivos")
    public List<ActivosFijosDto> getAllActivosf(){
        List<ActivosFijos> activosf = (List<ActivosFijos>) repository.findAll();
        return activosf.stream().map(ActivosFijosMapper.mapper::entityToDto).toList();
    }

    public void createActivoFijo(ActivosFijosDto activosFijosDto){
        ActivosFijos activosFijos = ActivosFijosMapper.mapper.dtoToEntity(activosFijosDto);
        repository.save(activosFijos);
    }

    public ActivosFijosDto buscarId(Integer id){
        return ActivosFijosMapper.mapper.entityToDto(repository.findById(id).orElse(null));
    }
}
