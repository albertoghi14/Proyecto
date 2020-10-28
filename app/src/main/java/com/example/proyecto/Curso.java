package com.example.proyecto;

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

    public String getDescripcionCurso() {
        return descripcionCurso;
    }
}
