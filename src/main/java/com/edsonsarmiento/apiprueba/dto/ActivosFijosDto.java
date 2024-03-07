package com.edsonsarmiento.apiprueba.dto;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;

public class ActivosFijosDto {

    public ActivosFijosDto() {
    }

    private int idActivoFijo;

    private String codigo;

    private int tipoActivoId;

    private String descripcion;

    public int getIdActivoFijo() {
        return idActivoFijo;
    }

    public void setIdActivoFijo(int idActivoFijo) {
        this.idActivoFijo = idActivoFijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTipoActivoId() {
        return tipoActivoId;
    }

    public void setTipoActivoId(int tipoActivoId) {
        this.tipoActivoId = tipoActivoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ActivosFijosDto{" +
                "idActivoFijo=" + idActivoFijo +
                ", codigo='" + codigo + '\'' +
                ", tipoActivoId=" + tipoActivoId +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public ActivosFijosDto(int idActivoFijo, String codigo, int tipoActivoId, String descripcion) {
        this.idActivoFijo = idActivoFijo;
        this.codigo = codigo;
        this.tipoActivoId = tipoActivoId;
        this.descripcion = descripcion;
    }
}
