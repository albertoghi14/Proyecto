package com.example.proyecto.utilidades;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;

public class Constantes {
    //Constante Base de Datos
    public static final String BASE_DATOS= "Proyecto.db";

    //Constantes campo tabla Usuario
    public static final String TABLA_USUARIO = "Usuario";
    public static final String CAMPO_ID_USUARIO = "idUsuario";
    public static final String CAMPO_NOMBRE_USUARIO = "nombreUsuario";
    public static final String CAMPO_APELLIDOS_USUARIO = "apellidosUsuario";
    public static final String CAMPO_SEXO = "sexo";
    public static final String CAMPO_FECHA_NACIMIENTO = "fechaNacimiento";
    public static final String CAMPO_NACIONALIDAD = "nacionalidad";
    public static final String CAMPO_LOCALIDAD = "localidad";
    public static final String CAMPO_TELEFONO_USUARIO = "telefonoUsuario";
    public static final String CAMPO_USERNAME_USUARIO = "usernameUsuario";
    public static final String CAMPO_EMAIL_USUARIO = "emailUsuario";
    public static final String CAMPO_PASSWORD = "passwordUsuario";

    public static final String CREAR_TABLA_USUARIO = "CREATE TABLE " + TABLA_USUARIO + " (" + CAMPO_ID_USUARIO +
            " INTEGER PRIMARY KEY AUTOINCREMENT, " + CAMPO_NOMBRE_USUARIO + " TEXT, " + CAMPO_APELLIDOS_USUARIO + " TEXT, " + CAMPO_SEXO + " TEXT, "
            + CAMPO_FECHA_NACIMIENTO + " TEXT, " + CAMPO_NACIONALIDAD + " TEXT, " + CAMPO_LOCALIDAD + " TEXT, " + CAMPO_TELEFONO_USUARIO +
            " TEXT, " + CAMPO_USERNAME_USUARIO + " TEXT, " + CAMPO_EMAIL_USUARIO + " TEXT, " + CAMPO_PASSWORD + " TEXT); ";

    public static final String INSERT_DATA = "INSERT INTO " + TABLA_USUARIO + " VALUES(1, 'Alberto', 'Gonzalez Hierro', 'Hombre', " +
            "'16/07/2000', 'Espana', 'Colindres', '606885762', 'albertogh14', 'alberto@gmail.com', '12345');";


    //Constantes campos tabla Curso
    public static final String TABLA_CURSO = "Curso";
    public static final String CAMPO_SIGLAS_CURSO = "siglasCurso";
    public static final String CAMPO_DESCRIPCION_CURSO = "descripcionCurso";

    public static final String CREAR_TABLA_CURSO = "CREATE TABLE " + TABLA_CURSO + " (" + CAMPO_SIGLAS_CURSO +
            " TEXT, " + CAMPO_DESCRIPCION_CURSO + " TEXT);";


    //Constantes campos tabla Asignatura
    public static final String TABLA_ASIGNATURA = "Asignatura";
    public static final String CAMPO_SIGLAS_ASIGNATURA = "siglasAsignatura";
    public static final String CAMPO_DESCRIPCION_ASIGNATURA = "descripcionAsignatura";
    public static final String CAMPO_AULA_ASIGNATURA = "aulaAsignatura";

    public static final String CREAR_TABLA_ASIGNATURA = "CREATE TABLE " + TABLA_ASIGNATURA + " (" + CAMPO_SIGLAS_ASIGNATURA +
            " TEXT, " + CAMPO_DESCRIPCION_ASIGNATURA + " TEXT, " + CAMPO_AULA_ASIGNATURA + " TEXT);";


    //Constantes campos tabla Alumno
    public static final String TABLA_ALUMNO = "Alumno";
    public static final String CAMPO_DNI = "dni";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_APELLIDOS = "apellidos";
    public static final String CAMPO_EDAD = "edad";
    public static final String CAMPO_EMAIL = "email";
    public static final String CAMPO_DIRECCION = "direccion";
    public static final String CAMPO_DOMICILIO = "domicilio";
    public static final String CAMPO_TELEFONO_ALUMNO = "telefonoAlumno";

    public static final String CREAR_TABLA_ALUMNO = "CREATE TABLE " + TABLA_ALUMNO + " (" + CAMPO_DNI + " TEXT, " +
            CAMPO_NOMBRE + " TEXT, " + CAMPO_APELLIDOS + " TEXT, " + CAMPO_EDAD + " TEXT, " + CAMPO_EMAIL + " TEXT, " +
            CAMPO_DIRECCION + " TEXT, " + CAMPO_DOMICILIO + " TEXT, " + CAMPO_TELEFONO_ALUMNO + " TEXT);";



    //Constantes campos tabla Profesor
    public static final String TABLA_PROFESOR = "Profesor";
    public static final String CAMPO_DNI_PROFESOR = "dniProfesor";
    public static final String CAMPO_NOMBRE_PROFESOR = "nombreProfesor";
    public static final String CAMPO_APELLIDOS_PROFESOR = "apellidosProfesor";
    public static final String CAMPO_EMAIL_PROFESOR = "emailProfesor";
    public static final String CAMPO_TELEFONO = "telefono";

    public static final String CREAR_TABLA_PROFESOR = "CREATE TABLE " + TABLA_PROFESOR + " (" + CAMPO_DNI_PROFESOR +
            " TEXT, " + CAMPO_NOMBRE_PROFESOR + " TEXT, " + CAMPO_APELLIDOS_PROFESOR + " TEXT, " + CAMPO_EMAIL_PROFESOR +
            " TEXT, " + CAMPO_TELEFONO + " TEXT);";
}
