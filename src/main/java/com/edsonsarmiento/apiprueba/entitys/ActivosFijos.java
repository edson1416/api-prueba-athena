package com.edsonsarmiento.apiprueba.entitys;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "activos_fijos", schema = "activo_fijo", catalog = "")
public class ActivosFijos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_activo_fijo")
    private int idActivoFijo;
    @Basic
    @Column(name = "codigo")
    private String codigo;
    @Basic
    @Column(name = "tipo_activo_id")
    private int tipoActivoId;
    @Basic
    @Column(name = "descripcion")
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivosFijos that = (ActivosFijos) o;
        return idActivoFijo == that.idActivoFijo && tipoActivoId == that.tipoActivoId && Objects.equals(codigo, that.codigo) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idActivoFijo, codigo, tipoActivoId, descripcion);
    }
}
