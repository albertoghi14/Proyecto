package com.example.proyecto.entidades;

public class Usuario {

    private Integer idUsuario;
    private String nombreUsuario;
    private String apellidosUsuario;
    private String sexo;
    private String fechaNacimiento;
    private String nacionalidad;
    private String localidad;
    private String telefonoUsuario;
    private String usernameUsuario;
    private String emailUsuario;
    private String passwordUsuario;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombreUsuario, String apellidosUsuario, String sexo, String fechaNacimiento, String nacionalidad, String localidad, String telefonoUsuario, String usernameUsuario, String emailUsuario, String passwordUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.localidad = localidad;
        this.telefonoUsuario = telefonoUsuario;
        this.usernameUsuario = usernameUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public Usuario(String nombreUsuario, String apellidosUsuario, String sexo, String fechaNacimiento, String nacionalidad, String localidad, String telefonoUsuario, String usernameUsuario, String emailUsuario, String passwordUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.localidad = localidad;
        this.telefonoUsuario = telefonoUsuario;
        this.usernameUsuario = usernameUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
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

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getUsernameUsuario() {
        return usernameUsuario;
    }

    public void setUsernameUsuario(String usernameUsuario) {
        this.usernameUsuario = usernameUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }
}
