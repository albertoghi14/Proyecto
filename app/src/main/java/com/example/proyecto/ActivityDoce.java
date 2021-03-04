package com.example.proyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityDoce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doce);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones_cuenta, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_opciones_cuenta_configuracion:
                Intent configuracionCuenta = new Intent(ActivityDoce.this, ModificarUsuario.class);
                startActivity(configuracionCuenta);
                return true;

            case R.id.menu_opciones_cuenta_cerrar_sesion:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(R.string.mensajeSeguroSalir)
                        .setPositiveButton(R.string.opcionSi,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent cerrarSesion = new Intent(ActivityDoce.this, SplashScreenCierreSesion.class);
                                        startActivity(cerrarSesion);


                                    }})
                        .setNegativeButton(R.string.opcionNo,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }});
                builder.create().show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}