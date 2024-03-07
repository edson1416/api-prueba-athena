package com.edsonsarmiento.apiprueba.entitys;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Asignaciones {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_asignaciones")
    private int idAsignaciones;
    @Basic
    @Column(name = "personas_id")
    private int personasId;
    @Basic
    @Column(name = "activos_fijos_id")
    private int activosFijosId;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignaciones that = (Asignaciones) o;
        return idAsignaciones == that.idAsignaciones && personasId == that.personasId && activosFijosId == that.activosFijosId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsignaciones, personasId, activosFijosId);
    }
}
