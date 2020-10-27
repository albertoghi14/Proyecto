package com.example.proyecto;

public class Alumno {

    private int foto;
    private String nombre;
    private String edad;
    private String email;
    private String direccion;
    private String domicilio;
    private String telefono;

    public Alumno() {
    }

    public Alumno(int foto, String nombre, String edad, String email, String direccion, String domicilio, String telefono) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }
}
