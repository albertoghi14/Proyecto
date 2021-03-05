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

import com.example.proyecto.entidades.Curso;

import java.util.ArrayList;

public class PantallaCursosAsignaturas extends AppCompatActivity {

    ListView lista;
    AdaptadorCurso adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_cursos_asignaturas);

        lista = findViewById(R.id.listView_cursos);
        adaptador = new AdaptadorCurso(this, GetArrayItems());
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Toast.makeText(getApplicationContext(), "DAM 1", Toast.LENGTH_SHORT).show();
                        mostrarAsignaturas(view);
                        break;
                    case 1 :
                        Toast.makeText(getApplicationContext(), "DAM 2", Toast.LENGTH_SHORT).show();
                        mostrarAsignaturas(view);
                        break;
                    case 2 :
                        Toast.makeText(getApplicationContext(), "DAW 1", Toast.LENGTH_SHORT).show();
                        mostrarAsignaturas(view);
                        break;
                    case 3 :
                        Toast.makeText(getApplicationContext(), "DAW 2", Toast.LENGTH_SHORT).show();
                        mostrarAsignaturas(view);
                        break;
                    case 4 :
                        Toast.makeText(getApplicationContext(), "ASIR 1", Toast.LENGTH_SHORT).show();
                        mostrarAsignaturas(view);
                        break;
                    case 5 :
                        Toast.makeText(getApplicationContext(), "ASIR 2", Toast.LENGTH_SHORT).show();
                        mostrarAsignaturas(view);
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


    public void mostrarAsignaturas(View view){
        Intent mostrarAsignaturas = new Intent(PantallaCursosAsignaturas.this, PantallaAsignaturas.class);
        startActivity(mostrarAsignaturas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cursos_asignaturas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_anadir_cursos_asignaturas:
                Intent anadirCurso = new Intent(PantallaCursosAsignaturas.this, AnadirCurso.class);
                startActivity(anadirCurso);
                return true;

            case R.id.menu_modificar_cursos_asignaturas:
                Intent modificarCurso = new Intent(PantallaCursosAsignaturas.this, ModificarCurso.class);
                startActivity(modificarCurso);
                return true;

            case R.id.menu_eliminar_cursos_asignaturas:
                Intent borrarCurso= new Intent(PantallaCursosAsignaturas.this, BorrarCurso.class);
                startActivity(borrarCurso);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}