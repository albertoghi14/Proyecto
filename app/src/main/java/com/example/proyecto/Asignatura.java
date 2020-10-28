package com.example.proyecto;

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

    public String getDescripcionAsignatura() {
        return descripcionAsignatura;
    }

    public String getAulaAsignatura() {
        return aulaAsignatura;
    }
}
