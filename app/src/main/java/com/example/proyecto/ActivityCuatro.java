package com.example.proyecto;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyecto.entidades.Asignatura;

import java.util.ArrayList;

public class ActivityCuatro extends AppCompatActivity {
    ListView lista;
    AdaptadorAsignatura adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);

        lista = (ListView) findViewById(R.id.listView_asignaturas);
        adaptador = new AdaptadorAsignatura(this, GetArrayItems());
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Toast.makeText(getApplicationContext(), "Asignatura 1", Toast.LENGTH_SHORT).show();
                        mostrarAlumnos(view);
                        break;
                    case 1 :
                        Toast.makeText(getApplicationContext(), "Asignatura 2", Toast.LENGTH_SHORT).show();
                        mostrarAlumnos(view);
                        break;
                    case 2 :
                        Toast.makeText(getApplicationContext(), "Asignatura 3", Toast.LENGTH_SHORT).show();
                        mostrarAlumnos(view);
                        break;
                    case 3 :
                        Toast.makeText(getApplicationContext(), "Asignatura 4", Toast.LENGTH_SHORT).show();
                        mostrarAlumnos(view);
                        break;
                    case 4 :
                        Toast.makeText(getApplicationContext(), "Asignatura 5", Toast.LENGTH_SHORT).show();
                        mostrarAlumnos(view);
                        break;
                    case 5 :
                        Toast.makeText(getApplicationContext(), "Asignatura 6", Toast.LENGTH_SHORT).show();
                        mostrarAlumnos(view);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Accion incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private ArrayList<Asignatura> GetArrayItems(){
        ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();

        listaAsignaturas.add(new Asignatura("A1", "Asignatura 1", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A2", "Asignatura 2", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A3", "Asignatura 3", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A4", "Asignatura 4", "Aula B6"));
        listaAsignaturas.add(new Asignatura("A5", "Asignatura 5", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A6", "Asignatura 6", "Aula B8"));

        return listaAsignaturas;
    }

    public void mostrarAlumnos(View view){
        Intent mostrarAlumnos = new Intent(ActivityCuatro.this, ActivityCinco.class);
        startActivity(mostrarAlumnos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones_asignaturas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_anadir_asignaturas:
                Intent anadirAsignatura = new Intent(ActivityCuatro.this, AnadirAsignatura.class);
                startActivity(anadirAsignatura);
                return true;

            case R.id.menu_modificar_asignaturas:
                Intent modificarAsignatura = new Intent(ActivityCuatro.this, ModificarAsignatura.class);
                startActivity(modificarAsignatura);
                return true;

            case R.id.menu_eliminar_asignaturas:
                Intent borrarAsignatura = new Intent(ActivityCuatro.this, BorrarAsignatura.class);
                startActivity(borrarAsignatura);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public static class ConexionSQLiteHelper extends SQLiteOpenHelper {

        final String CREAR_TABLA_ALUMNO = "CREATE TABLE alumno (dni TEXT, nombre TEXT, apellidos TEXT, edad INTEGER, email TEXT, direccion TEXT, domicilio TEXT, telefonoAlumno TEXT)";
        final String CREAR_TABLA_PROFESOR = "CREATE TABLE profesor (dniProfesor TEXT, nombreProfesor TEXT, apellidosProfesor TEXT, sexo TEXT, fechaNacimiento DATE, nacionalidad TEXT, localidad TEXT, emailProfesor TEXT, telefono TEXT)";
        final String CREAR_TABLA_CURSO = "CREATE TABLE curso (siglasCurso TEXT, descripcionCurso TEXT)";
        final String CREAR_TABLA_ASIGNATURA = "CREATE TABLE asignatura (siglasAsignatura TEXT, descripcionAsignatura TEXT, aulaAsignatura TEXT)";

        public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREAR_TABLA_ALUMNO);
            db.execSQL(CREAR_TABLA_PROFESOR);
            db.execSQL(CREAR_TABLA_CURSO);
            db.execSQL(CREAR_TABLA_ASIGNATURA);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
            db.execSQL("DROP TABLE IF EXISTS alumno");
            db.execSQL("DROP TABLE IF EXISTS profesor");
            db.execSQL("DROP TABLE IF EXISTS curso");
            db.execSQL("DROP TABLE IF EXISTS asignatura");
            onCreate(db);
        }
    }
}