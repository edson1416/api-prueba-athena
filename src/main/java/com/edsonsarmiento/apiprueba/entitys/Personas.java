package com.edsonsarmiento.apiprueba.entitys;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Personas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_persona")
    private int idPersona;
    @Basic
    @Column(name = "nombres")
    private String nombres;
    @Basic
    @Column(name = "n_carnet")
    private String nCarnet;
    @Basic
    @Column(name = "areas_trabajo_id")
    private int areasTrabajoId;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getnCarnet() {
        return nCarnet;
    }

    public void setnCarnet(String nCarnet) {
        this.nCarnet = nCarnet;
    }

    public int getAreasTrabajoId() {
        return areasTrabajoId;
    }

    public void setAreasTrabajoId(int areasTrabajoId) {
        this.areasTrabajoId = areasTrabajoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return idPersona == personas.idPersona && areasTrabajoId == personas.areasTrabajoId && Objects.equals(nombres, personas.nombres) && Objects.equals(nCarnet, personas.nCarnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombres, nCarnet, areasTrabajoId);
    }
}
