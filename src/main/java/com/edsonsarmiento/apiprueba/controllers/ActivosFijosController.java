package com.edsonsarmiento.apiprueba.controllers;

import com.edsonsarmiento.apiprueba.dto.ActivosFijosDto;
import com.edsonsarmiento.apiprueba.services.ActivosFijosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prueba")
public class ActivosFijosController {

    @Autowired
    private ActivosFijosService service;

    @GetMapping("activosf")
    public ResponseEntity<?> getALl(){
        try{
            List<ActivosFijosDto> response = service.getAllActivosf();
            if (!response.isEmpty()){
                return new ResponseEntity<>(response, HttpStatus.OK);
            }else {
                return new ResponseEntity<>("No hay registros", HttpStatus.OK);
            }
        }catch (DataAccessException accessException){
            return new ResponseEntity<>(accessException.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("activof")
    public ResponseEntity<?> create(@RequestBody ActivosFijosDto activosFijosDto){
        try{
            service.createActivoFijo(activosFijosDto);
            return new ResponseEntity<>("Registro ingresado", HttpStatus.CREATED);
        }catch (DataAccessException accessException){
            return new ResponseEntity<>(accessException.getMessage(),HttpStatus.METHOD_NOT_ALLOWED);
        }
    }

    @GetMapping("activof/{idactivo}")
    public ResponseEntity<?> showById(@PathVariable Integer idactivo){
        try{
            ActivosFijosDto activosFijosDto = service.buscarId(idactivo);
            if (activosFijosDto != null) {
                return new ResponseEntity<>(activosFijosDto,HttpStatus.OK);
            }else {
                return new ResponseEntity<>("El registro no existe",HttpStatus.OK);
            }
        }catch (DataAccessException accessException){
            return new ResponseEntity<>(accessException.getMessage(),HttpStatus.METHOD_NOT_ALLOWED);
        }
    }
}
