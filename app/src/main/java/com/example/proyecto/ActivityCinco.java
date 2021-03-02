package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.proyecto.entidades.Alumno;

import java.util.ArrayList;

public class ActivityCinco extends AppCompatActivity {
    private ListView alumnos;
    private AdaptadorAlumno adaptadorAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco);

        alumnos = (ListView) findViewById(R.id.listView_alumnos);
        adaptadorAlumnos = new AdaptadorAlumno(this,GetArrayItems());
        alumnos.setAdapter(adaptadorAlumnos);

        registerForContextMenu(alumnos);
    }

    private ArrayList<Alumno> GetArrayItems(){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 1", "20 años", "alumno1@gmail.com", "Calle 1", "Domicilio 1", "606885762"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 2", "20 años", "alumno2@gmail.com", "Calle 2", "Domicilio 2", "606885761"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 3", "20 años", "alumno3@gmail.com", "Calle 3", "Domicilio 3", "606885763"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 4", "20 años", "alumno4@gmail.com", "Calle 4", "Domicilio 4", "606885764"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 5", "20 años", "alumno5@gmail.com", "Calle 5", "Domicilio 5", "606885765"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 6", "20 años", "alumno6@gmail.com", "Calle 6", "Domicilio 6", "606885766"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 7", "20 años", "alumno7@gmail.com", "Calle 7", "Domicilio 7", "606885767"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 8", "20 años", "alumno8@gmail.com", "Calle 8", "Domicilio 8", "606885768"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 9", "20 años", "alumno9@gmail.com", "Calle 9", "Domicilio 9", "606885769"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 10", "20 años", "alumno10@gmail.com", "Calle 10", "Domicilio 10", "606885760"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 11", "20 años", "alumno11@gmail.com", "Calle 11", "Domicilio 11", "606885712"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 12", "20 años", "alumno12@gmail.com", "Calle 12", "Domicilio 12", "606885722"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 13", "20 años", "alumno13@gmail.com", "Calle 13", "Domicilio 13", "606885732"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 14", "20 años", "alumno14@gmail.com", "Calle 14", "Domicilio 14", "606885742"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alumno 15", "20 años", "alumno15@gmail.com", "Calle 15", "Domicilio 15", "606885752"));
        return listaAlumnos;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones_alumnos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_anadir_alumno:
                Intent anadirAlumno = new Intent(ActivityCinco.this, AnadirAlumno.class);
                startActivity(anadirAlumno);
                return true;

            case R.id.menu_eliminar_alumno:
                Intent borrarAlumno = new Intent(ActivityCinco.this, BorrarAlumno.class);
                startActivity(borrarAlumno);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_contextual_alumno, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {



        switch (item.getItemId()) {
            case R.id.menu_contextual_alumno_modificar:
                Intent modificarAlumno = new Intent(ActivityCinco.this, ModificarAlumno.class);
                startActivity(modificarAlumno);
                return true;
            case R.id.menu_contextual_alumno_enviar_email:
                return true;
            case R.id.menu_contextual_alumno_llamar:
                Intent intentLLamar = new Intent(Intent.ACTION_DIAL);
                startActivity(intentLLamar);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}