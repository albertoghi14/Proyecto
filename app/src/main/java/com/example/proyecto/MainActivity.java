package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;
import static com.example.proyecto.utilidades.Constantes.CAMPO_APELLIDOS_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_EMAIL_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_FECHA_NACIMIENTO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_ID_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_LOCALIDAD;
import static com.example.proyecto.utilidades.Constantes.CAMPO_NACIONALIDAD;
import static com.example.proyecto.utilidades.Constantes.CAMPO_NOMBRE_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_PASSWORD;
import static com.example.proyecto.utilidades.Constantes.CAMPO_SEXO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_TELEFONO_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_USERNAME_USUARIO;
import static com.example.proyecto.utilidades.Constantes.TABLA_USUARIO;

public class MainActivity extends AppCompatActivity {

    ConexionSQLiteHelper helper ;
    private String usuariocad, passcad;
    private final static String CHANNEL_ID = "NOTIFICACION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new ConexionSQLiteHelper(this, "Proyecto.db", null, 1);
    }

    public void Entrar(View view){
        helper = new ConexionSQLiteHelper(this, "Proyecto.db", null, 1);
        TextInputLayout usuario = findViewById(R.id.editText_usuario_inicio_sesion);
        TextInputLayout password = findViewById(R.id.editText_password_inicio_sesion);

        try {
            usuariocad = usuario.getEditText().getText().toString();
            passcad = password.getEditText().getText().toString();
            Cursor cursor = ConsultarUsuPas
                    (usuariocad, passcad);
            if (cursor.getCount()>0){
                Intent entrar = new Intent(this, SplashScreenInicioSesion.class);
                startActivity(entrar);
                Toast toastEntrar =
                        Toast.makeText(getApplicationContext(),
                                "Inicio de sesión correcto", Toast.LENGTH_LONG);

                toastEntrar.show();

                createNotification();
                
            }else {
                Toast toastErrorLogin =
                        Toast.makeText(getApplicationContext(),
                                "Usuario y/o contraseña incorrectos", Toast.LENGTH_LONG);

                toastErrorLogin.show();
            }
            usuario.getEditText().setText("");
            password.getEditText().setText("");
            usuario.findFocus();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    private void createNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID);
        builder.setSmallIcon(R.drawable.ic_icono_notificacion);
        builder.setContentTitle("Inicio de sesión");
        builder.setContentText("Hey! Bienvenido "+ usuariocad +"!" +
                "" +
                "Estamos encantados de tenerte por aquí. Esperamos hacerte las cosas fáciles." +
                "Déjanos ayudarte, conforma tu propio horario semanal o échale un vistazo si ya has creado uno.");
        builder.setColor(Color.BLUE);
        builder.setPriority(NotificationCompat.PRIORITY_MAX);
        builder.setDefaults(Notification.DEFAULT_SOUND);

        builder.setContentIntent(PendingIntent.getActivity(MainActivity.this, (int) System.currentTimeMillis(), new Intent(MainActivity.this, ActivityOnce.class), 0));

        NotificationManager nmanager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nmanager.notify(0, builder.build());


    }

    public void Registrar(View view){
        Intent registrar = new Intent(this, ActivityUno.class);
        startActivity(registrar);

        Toast toastCrear =
                Toast.makeText(getApplicationContext(),
                        "Creación de cuenta nueva", Toast.LENGTH_LONG);

        toastCrear.show();
    }

    public Cursor ConsultarUsuPas(String usu, String pas) throws SQLException {
        helper = new ConexionSQLiteHelper(this, "Proyecto.db", null, 1);
        Cursor mcursor = null;

        mcursor = this.helper.getReadableDatabase().query(TABLA_USUARIO, new String[]{CAMPO_ID_USUARIO,
                CAMPO_NOMBRE_USUARIO, CAMPO_APELLIDOS_USUARIO, CAMPO_SEXO, CAMPO_FECHA_NACIMIENTO,
                CAMPO_NACIONALIDAD, CAMPO_LOCALIDAD, CAMPO_TELEFONO_USUARIO, CAMPO_USERNAME_USUARIO,
                CAMPO_EMAIL_USUARIO, CAMPO_PASSWORD}, "" + CAMPO_USERNAME_USUARIO + " like '" + usu + "' and " +
                CAMPO_PASSWORD + " like '" + pas + "'",null,null,null,null);

        return mcursor;

    }
}