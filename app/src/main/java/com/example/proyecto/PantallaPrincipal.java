package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_inicio:
                Intent inicio = new Intent(this, PantallaPrincipal.class);
                startActivity(inicio);
                return true;

            case R.id.menu_inicio_asignaturas:
                Intent asignaturas = new Intent(this, PantallaCursosAsignaturas.class);
                startActivity(asignaturas);
                return true;

            case R.id.menu_inicio_profesores:
                Intent profesores = new Intent(this, PantallaCursosProfesores.class);
                startActivity(profesores);
                return true;

            case R.id.menu_inicio_horario:
                Intent horario = new Intent(this, PantallaCursosHorario.class);
                startActivity(horario);
                return true;

            case R.id.menu_inicio_localizacion:
                Intent localizacion = new Intent(this, PantallaLocalizacion.class);
                startActivity(localizacion);
                return true;

            case R.id.menu_inicio_cuenta:
                Intent cuenta = new Intent(this, PantallaInformacionCuenta.class);
                startActivity(cuenta);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}