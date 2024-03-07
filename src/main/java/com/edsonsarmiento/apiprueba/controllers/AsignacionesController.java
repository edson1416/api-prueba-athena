package com.edsonsarmiento.apiprueba.controllers;

import com.edsonsarmiento.apiprueba.services.AsignacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class AsignacionesController {

    @Autowired
    private AsignacionesService service;

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
