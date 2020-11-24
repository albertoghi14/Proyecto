package com.example.proyecto.entidades;

import java.util.Date;

public class Profesor {

    private int foto;
    private String dniProfesor;
    private String nombreProfesor;
    private String apellidosProfesor;
    private String sexo;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String localidad;
    private String emailProfesor;
    private String telefono;
    private String asignaturas;


    public Profesor() {
    }

    public Profesor(int foto, String dniProfesor, String nombreProfesor, String apellidosProfesor, String sexo, Date fechaNacimiento, String nacionalidad, String localidad, String emailProfesor, String telefono, String asignaturas) {
        this.foto = foto;
        this.dniProfesor = dniProfesor;
        this.nombreProfesor = nombreProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.localidad = localidad;
        this.emailProfesor = emailProfesor;
        this.telefono = telefono;
        this.asignaturas = asignaturas;
    }

    public Profesor(int foto, String nombreProfesor, String asignaturas, String emailProfesor, String telefono) {
        this.foto = foto;
        this.nombreProfesor = nombreProfesor;
        this.asignaturas = asignaturas;
        this.emailProfesor = emailProfesor;
        this.telefono = telefono;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDniProfesor() {
        return dniProfesor;
    }

    public void setDniProfesor(String dniProfesor) {
        this.dniProfesor = dniProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombre(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidosProfesor() {
        return apellidosProfesor;
    }

    public void setApellidosProfesor(String apellidosProfesor) {
        this.apellidosProfesor = apellidosProfesor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEmailProfesor() {
        return emailProfesor;
    }

    public void setEmailProfesor(String emailProfesor) {
        this.emailProfesor = emailProfesor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }
}
