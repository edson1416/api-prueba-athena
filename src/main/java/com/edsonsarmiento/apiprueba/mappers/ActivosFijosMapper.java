package com.edsonsarmiento.apiprueba.mappers;

import com.edsonsarmiento.apiprueba.dto.ActivosFijosDto;
import com.edsonsarmiento.apiprueba.entitys.ActivosFijos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActivosFijosMapper {

    ActivosFijosMapper mapper = Mappers.getMapper(ActivosFijosMapper.class);

    @Mappings({
            @Mapping(source = "idActivoFijo", target = "idActivoFijo"),
            @Mapping(source = "codigo", target = "codigo"),
            @Mapping(source = "tipoActivoId", target = "tipoActivoId"),
            @Mapping(source = "descripcion", target = "descripcion")
    })
    ActivosFijosDto entityToDto (ActivosFijos activosFijos);

    @InheritInverseConfiguration
    ActivosFijos dtoToEntity (ActivosFijosDto activosFijosDto);

}
