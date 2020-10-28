package com.example.proyecto;

public class Profesor {

    private int foto;
    private String nombre;
    private String asignaturas;
    private String email;
    private String telefono;

    public Profesor() {
    }

    public Profesor(int foto, String nombre, String asignaturas, String email, String telefono) {
        this.foto = foto;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.email = email;
        this.telefono = telefono;
    }

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}
