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
                return true;

            case R.id.menu_modificar_asignaturas:

                return true;

            case R.id.menu_eliminar_asignaturas:

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}