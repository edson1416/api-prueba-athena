package com.edsonsarmiento.apiprueba.entitys;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "historial_asignaciones", schema = "activo_fijo", catalog = "")
public class HistorialAsignaciones {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_historial_asignaciones")
    private int idHistorialAsignaciones;
    @Basic
    @Column(name = "fecha_asignacion")
    private Date fechaAsignacion;
    @Basic
    @Column(name = "personas_id")
    private int personasId;
    @Basic
    @Column(name = "activos_fijos_id")
    private int activosFijosId;

    public int getIdHistorialAsignaciones() {
        return idHistorialAsignaciones;
    }

    public void setIdHistorialAsignaciones(int idHistorialAsignaciones) {
        this.idHistorialAsignaciones = idHistorialAsignaciones;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistorialAsignaciones that = (HistorialAsignaciones) o;
        return idHistorialAsignaciones == that.idHistorialAsignaciones && personasId == that.personasId && activosFijosId == that.activosFijosId && Objects.equals(fechaAsignacion, that.fechaAsignacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHistorialAsignaciones, fechaAsignacion, personasId, activosFijosId);
    }
}
