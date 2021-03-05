package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class PantallaInformacionCuenta extends AppCompatActivity {
    //Variable para gestionar FireBase
    private FirebaseAuth mAuth;

    //Variables para desloguear en Google
    private GoogleSignInClient mGoogleSignInClient;
    private GoogleSignInOptions gso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_informacion_cuenta);

        mAuth = FirebaseAuth.getInstance();

        //Configurar las gso para Google para despues desloguear de Google
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

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
                Intent configuracionCuenta = new Intent(PantallaInformacionCuenta.this, ModificarUsuario.class);
                startActivity(configuracionCuenta);
                return true;

            case R.id.menu_opciones_cuenta_cerrar_sesion:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(R.string.mensajeSeguroSalir)
                        .setPositiveButton(R.string.opcionSi,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        //Cerrar sesión con FireBase
                                        mAuth.signOut();

                                        //Cerrar sesión con Google
                                        mGoogleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if (task.isSuccessful()){
                                                    Intent cerrarSesion = new Intent(PantallaInformacionCuenta.this, SplashScreenCierreSesion.class);
                                                    startActivity(cerrarSesion);
                                                } else {
                                                    Toast.makeText(getApplicationContext(), "No se pudo cerrar sesión con Google", Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });

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