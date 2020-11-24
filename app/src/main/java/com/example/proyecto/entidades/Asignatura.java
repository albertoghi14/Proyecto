package com.example.proyecto.entidades;

public class Asignatura {
    private String siglasAsignatura;
    private String descripcionAsignatura;
    private String aulaAsignatura;

    public Asignatura() {
    }

    public Asignatura(String siglasAsignatura, String descripcionAsignatura, String aulaAsignatura) {
        this.siglasAsignatura = siglasAsignatura;
        this.descripcionAsignatura = descripcionAsignatura;
        this.aulaAsignatura = aulaAsignatura;
    }

    public String getSiglasAsignatura() {
        return siglasAsignatura;
    }

    public void setSiglasAsignatura(String siglasAsignatura) {
        this.siglasAsignatura = siglasAsignatura;
    }

    public String getDescripcionAsignatura() {
        return descripcionAsignatura;
    }

    public void setDescripcionAsignatura(String descripcionAsignatura) {
        this.descripcionAsignatura = descripcionAsignatura;
    }

    public String getAulaAsignatura() {
        return aulaAsignatura;
    }

    public void setAulaAsignatura(String aulaAsignatura) {
        this.aulaAsignatura = aulaAsignatura;
    }
}
