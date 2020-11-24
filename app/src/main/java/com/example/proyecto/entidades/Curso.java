package com.example.proyecto.entidades;

public class Curso {
    private String siglasCurso;
    private String descripcionCurso;

    public Curso() {
    }

    public Curso(String siglasCurso, String descripcionCurso) {
        this.siglasCurso = siglasCurso;
        this.descripcionCurso = descripcionCurso;
    }

    public String getSiglasCurso() {
        return siglasCurso;
    }

    public void setSiglasCurso(String siglasCurso) {
        this.siglasCurso = siglasCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }
}
