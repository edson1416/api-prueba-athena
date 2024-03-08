package com.edsonsarmiento.apiprueba.controllers;

import com.edsonsarmiento.apiprueba.dto.AsignacionesDto;
import com.edsonsarmiento.apiprueba.services.AsignacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prueba")
public class AsignacionesController {

    @Autowired
    private AsignacionesService service;

    @PostMapping("asignacion")
    public ResponseEntity<?> createAsignacion(@RequestBody AsignacionesDto asignacionesDto){
        try {
            service.asignacionActivo(asignacionesDto);
            return new ResponseEntity<>("Activo Asignado", HttpStatus.CREATED);
        }catch (DataAccessException accessException){
            return new ResponseEntity<>(accessException.getMessage(),HttpStatus.METHOD_NOT_ALLOWED);
        }
    }

    @DeleteMapping("asigna/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        try{
            if (service.existAsig(id)) {
                service.deleteAsigna(id);
                return new ResponseEntity<>("Asignacion Eliminada",HttpStatus.OK);
            }else {
                return new ResponseEntity<>("La Asignacion no existe", HttpStatus.NOT_FOUND);
            }

        }catch (DataAccessException accessException){
            return new ResponseEntity<>(accessException.getMessage(),HttpStatus.METHOD_NOT_ALLOWED);
        }
    }
}
