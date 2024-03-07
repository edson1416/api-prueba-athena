package com.edsonsarmiento.apiprueba.entitys;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tipo_activo", schema = "activo_fijo", catalog = "")
public class TipoActivo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipo_activo")
    private int idTipoActivo;
    @Basic
    @Column(name = "nombre")
    private String nombre;

    public int getIdTipoActivo() {
        return idTipoActivo;
    }

    public void setIdTipoActivo(int idTipoActivo) {
        this.idTipoActivo = idTipoActivo;
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
        TipoActivo that = (TipoActivo) o;
        return idTipoActivo == that.idTipoActivo && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoActivo, nombre);
    }
}
