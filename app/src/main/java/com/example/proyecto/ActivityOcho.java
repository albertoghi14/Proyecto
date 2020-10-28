package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityOcho extends AppCompatActivity {

    ListView lista;
    AdaptadorCurso adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocho);

        lista = (ListView) findViewById(R.id.listView_cursos);
        adaptador = new AdaptadorCurso(this, GetArrayItems());
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Toast.makeText(getApplicationContext(), "Profesores DAM 1", Toast.LENGTH_SHORT).show();
                        mostrarProfesores(view);
                        break;
                    case 1 :
                        Toast.makeText(getApplicationContext(), "Profesores DAM 2", Toast.LENGTH_SHORT).show();
                        mostrarProfesores(view);
                        break;
                    case 2 :
                        Toast.makeText(getApplicationContext(), "Profesores DAW 1", Toast.LENGTH_SHORT).show();
                        mostrarProfesores(view);
                        break;
                    case 3 :
                        Toast.makeText(getApplicationContext(), "Profesores DAW 2", Toast.LENGTH_SHORT).show();
                        mostrarProfesores(view);
                        break;
                    case 4 :
                        Toast.makeText(getApplicationContext(), "Profesores ASIR 1", Toast.LENGTH_SHORT).show();
                        mostrarProfesores(view);
                        break;
                    case 5 :
                        Toast.makeText(getApplicationContext(), "Profesores ASIR 2", Toast.LENGTH_SHORT).show();
                        mostrarProfesores(view);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Accion incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private ArrayList<Curso> GetArrayItems(){
        ArrayList<Curso> listaCursos = new ArrayList<>();

        listaCursos.add(new Curso("DAM 1", "Desarrollo de Aplicaciones Multiplataforma (Primer año)"));
        listaCursos.add(new Curso("DAM 2", "Desarrollo de Aplicaciones Multiplataforma (Segundo año)"));
        listaCursos.add(new Curso("DAW 1", "Desarrollo de Aplicaciones Web (Primer año)"));
        listaCursos.add(new Curso("DAW 2", "Desarrollo de Aplicaciones Web (Segundo año)"));
        listaCursos.add(new Curso("ASIR 1", "Administración de Sistemas Informaticos y en Red (Primer año)"));
        listaCursos.add(new Curso("ASIR 2", "Administración de Sistemas Informaticos y en Red (Segundo año)"));

        return listaCursos;
    }

    public void mostrarProfesores(View view){
        Intent mostrarProfesores = new Intent(ActivityOcho.this, ActivityNueve.class);
        startActivity(mostrarProfesores);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cursos_profesores, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_anadir_cursos_profesores:

                return true;

            case R.id.menu_modificar_cursos_profesores:

                return true;

            case R.id.menu_eliminar_cursos_profesores:

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}