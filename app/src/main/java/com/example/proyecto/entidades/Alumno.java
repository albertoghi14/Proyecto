package com.example.proyecto.entidades;

public class Alumno {

    private int foto;
    private String dni;
    private String nombre;
    private String apellidos;
    private String edad;
    private String email;
    private String direccion;
    private String domicilio;
    private String telefonoAlumno;

    public Alumno() {
    }

    public Alumno(int foto, String dni, String nombre, String apellidos, String edad, String email, String direccion, String domicilio, String telefonoAlumno) {
        this.foto = foto;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.domicilio = domicilio;
        this.telefonoAlumno = telefonoAlumno;
    }

    public Alumno(int foto, String nombre, String edad, String email, String direccion, String domicilio, String telefonoAlumno) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.domicilio = domicilio;
        this.telefonoAlumno = telefonoAlumno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefonoAlumno() {
        return telefonoAlumno;
    }

    public void setTelefonoAlumno(String telefonoAlumno) {
        this.telefonoAlumno = telefonoAlumno;
    }
}
