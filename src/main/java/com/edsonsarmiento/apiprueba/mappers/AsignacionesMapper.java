package com.edsonsarmiento.apiprueba.mappers;

import com.edsonsarmiento.apiprueba.dto.AsignacionesDto;
import com.edsonsarmiento.apiprueba.entitys.Asignaciones;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AsignacionesMapper {

    AsignacionesMapper mapper = Mappers.getMapper(AsignacionesMapper.class);

    @Mappings({
            @Mapping(source = "idAsignaciones", target = "idAsignaciones"),
            @Mapping(source = "personasId", target = "personasId"),
            @Mapping(source = "activosFijosId", target = "activosFijosId"),
    })
    AsignacionesDto entityToDto (Asignaciones asignaciones);

    Asignaciones dtoToEntity (AsignacionesDto asignacionesDto);
}
