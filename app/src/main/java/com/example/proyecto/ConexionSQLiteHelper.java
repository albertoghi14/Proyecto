package com.example.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;



import static com.example.proyecto.utilidades.Constantes.BASE_DATOS;
import static com.example.proyecto.utilidades.Constantes.CREAR_TABLA_ALUMNO;
import static com.example.proyecto.utilidades.Constantes.CREAR_TABLA_ASIGNATURA;
import static com.example.proyecto.utilidades.Constantes.CREAR_TABLA_CURSO;
import static com.example.proyecto.utilidades.Constantes.CREAR_TABLA_PROFESOR;
import static com.example.proyecto.utilidades.Constantes.CREAR_TABLA_USUARIO;
import static com.example.proyecto.utilidades.Constantes.INSERT_DATA;
import static com.example.proyecto.utilidades.Constantes.TABLA_ALUMNO;
import static com.example.proyecto.utilidades.Constantes.TABLA_ASIGNATURA;
import static com.example.proyecto.utilidades.Constantes.TABLA_CURSO;
import static com.example.proyecto.utilidades.Constantes.TABLA_PROFESOR;
import static com.example.proyecto.utilidades.Constantes.TABLA_USUARIO;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;

    public ConexionSQLiteHelper(@Nullable Context contexto, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, BASE_DATOS, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_USUARIO);
        db.execSQL(INSERT_DATA);
        db.execSQL(CREAR_TABLA_CURSO);
        db.execSQL(CREAR_TABLA_ASIGNATURA);
        db.execSQL(CREAR_TABLA_ALUMNO);
        db.execSQL(CREAR_TABLA_PROFESOR);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_USUARIO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_CURSO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_ASIGNATURA);
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_ALUMNO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_PROFESOR);
        onCreate(db);
    }

}
