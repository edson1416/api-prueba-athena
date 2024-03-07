package com.edsonsarmiento.apiprueba.entitys;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "areas_trabajo", schema = "activo_fijo", catalog = "")
public class AreasTrabajo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_areas_trabajo")
    private int idAreasTrabajo;
    @Basic
    @Column(name = "nombre")
    private String nombre;

    public int getIdAreasTrabajo() {
        return idAreasTrabajo;
    }

    public void setIdAreasTrabajo(int idAreasTrabajo) {
        this.idAreasTrabajo = idAreasTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreasTrabajo that = (AreasTrabajo) o;
        return idAreasTrabajo == that.idAreasTrabajo && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAreasTrabajo, nombre);
    }
}
