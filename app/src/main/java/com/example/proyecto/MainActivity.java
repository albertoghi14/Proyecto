package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyecto.utilidades.Constantes;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new ConexionSQLiteHelper(this, "Proyecto.db", null, 1);
    }

    public void Entrar(View view){
        helper = new ConexionSQLiteHelper(this, "Proyecto.db", null, 1);
        EditText usuario = (EditText) findViewById(R.id.editText_usuario_inicio_sesion);
        EditText password = (EditText) findViewById(R.id.editText_password_inicio_sesion);

        try {
            Cursor cursor = ConsultarUsuPas
                    (usuario.getText().toString(), password.getText().toString());
            if (cursor.getCount()>0){
                Intent entrar = new Intent(this, ActivityDos.class);
                startActivity(entrar);
                Toast toastEntrar =
                        Toast.makeText(getApplicationContext(),
                                "Inicio de sesión correcto", Toast.LENGTH_LONG);

                toastEntrar.show();
            }else {
                Toast toastErrorLogin =
                        Toast.makeText(getApplicationContext(),
                                "Usuario y/o contraseña incorrectos", Toast.LENGTH_LONG);

                toastErrorLogin.show();
            }
            usuario.setText("");
            password.setText("");
            usuario.findFocus();
        } catch (SQLException e){
            e.printStackTrace();
        }

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