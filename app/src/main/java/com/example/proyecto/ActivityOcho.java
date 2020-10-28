package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

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