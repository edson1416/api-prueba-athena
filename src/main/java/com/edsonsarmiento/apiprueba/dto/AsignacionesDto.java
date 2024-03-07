package com.edsonsarmiento.apiprueba.dto;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;

public class AsignacionesDto {

    private int idAsignaciones;
    private int personasId;
    private int activosFijosId;

    public AsignacionesDto() {
    }

    public int getIdAsignaciones() {
        return idAsignaciones;
    }

    public void setIdAsignaciones(int idAsignaciones) {
        this.idAsignaciones = idAsignaciones;
    }

    public int getPersonasId() {
        return personasId;
    }

    public void setPersonasId(int personasId) {
        this.personasId = personasId;
    }

    public int getActivosFijosId() {
        return activosFijosId;
    }

    public void setActivosFijosId(int activosFijosId) {
        this.activosFijosId = activosFijosId;
    }

    @Override
    public String toString() {
        return "AsignacionesDto{" +
                "idAsignaciones=" + idAsignaciones +
                ", personasId=" + personasId +
                ", activosFijosId=" + activosFijosId +
                '}';
    }

    public AsignacionesDto(int idAsignaciones, int personasId, int activosFijosId) {
        this.idAsignaciones = idAsignaciones;
        this.personasId = personasId;
        this.activosFijosId = activosFijosId;
    }
}
