package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.proyecto.entidades.Usuario;
import com.google.android.material.textfield.TextInputLayout;

import static com.example.proyecto.utilidades.Constantes.CAMPO_APELLIDOS_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_EMAIL_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_FECHA_NACIMIENTO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_LOCALIDAD;
import static com.example.proyecto.utilidades.Constantes.CAMPO_NACIONALIDAD;
import static com.example.proyecto.utilidades.Constantes.CAMPO_NOMBRE_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_PASSWORD;
import static com.example.proyecto.utilidades.Constantes.CAMPO_SEXO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_TELEFONO_USUARIO;
import static com.example.proyecto.utilidades.Constantes.CAMPO_USERNAME_USUARIO;
import static com.example.proyecto.utilidades.Constantes.TABLA_USUARIO;

public class ActivityUno extends AppCompatActivity {

    Button btnRegisUsu, btnCancRegis;
    TextInputLayout txtNomUsu, txtApellUsu, txtLocUsu, txtTelfUsu, txtUserUsu, txtPassUsu, txtPasswUsu, txtEmailUsu;
    CheckBox checkUsuHomb, checkUsuMuj;
    RadioButton radTermUno, radTermDos;
    Spinner listaPaises;
    Spinner listaDias;
    Spinner listaMeses;
    Spinner listaAnos;
    //Spinner spDiaUsu, spMesUsu, spAnoUsu, spNacUsu;

    Usuario usu = new Usuario();

    ConexionSQLiteHelper helper = new ConexionSQLiteHelper(this, "Proyecto.db", null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);

        btnRegisUsu = (Button) findViewById(R.id.buttonRegistrarUsuario);
        btnCancRegis = (Button) findViewById(R.id.buttonCancelarRegistrarUsuario);
        txtNomUsu = (TextInputLayout) findViewById(R.id.editTextNombreUsuario);
        txtApellUsu = (TextInputLayout) findViewById(R.id.editTextApellidosUsuario);
        txtLocUsu = (TextInputLayout) findViewById(R.id.editTextLocalidadUsuario);
        txtTelfUsu = (TextInputLayout) findViewById(R.id.editTextTelefonoUsuario);
        txtUserUsu = (TextInputLayout) findViewById(R.id.editTextUsernameUsuario);
        txtPassUsu = (TextInputLayout) findViewById(R.id.editTextPasswordUsuario);
        txtPasswUsu = (TextInputLayout) findViewById(R.id.editTextPasswordConfirmarUsuario);
        txtEmailUsu = (TextInputLayout) findViewById(R.id.editTextEmailUsuario);
        checkUsuHomb = (CheckBox) findViewById(R.id.checkBoxSexoHombre);
        checkUsuMuj = (CheckBox) findViewById(R.id.checkBoxSexoMujer);
        radTermUno = (RadioButton) findViewById(R.id.radioButtonTerminosUno);
        radTermDos = (RadioButton) findViewById(R.id.radioButtonTerminosDos);

        String[] paises = getResources().getStringArray(R.array.array_paises);
        String[] dias = getResources().getStringArray(R.array.array_dias);
        String[] meses = getResources().getStringArray(R.array.array_meses);
        String[] anos = getResources().getStringArray(R.array.array_anos);

        listaPaises = (Spinner) findViewById(R.id.spinnerNacionalidadUsuario);
        listaDias = (Spinner) findViewById(R.id.spinnerDiaUsuario);
        listaMeses = (Spinner) findViewById(R.id.spinnerMesUsuario);
        listaAnos = (Spinner) findViewById(R.id.spinnerAnoUsuario);

        ArrayAdapter<String> adapterPais = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, paises);
        listaPaises.setAdapter(adapterPais);
        ArrayAdapter<String> adapterDia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dias);
        listaDias.setAdapter(adapterDia);
        ArrayAdapter<String> adapterMes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, meses);
        listaMeses.setAdapter(adapterMes);
        ArrayAdapter<String> adapterAno;
        adapterAno = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, anos);
        listaAnos.setAdapter(adapterAno);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, MainActivity.class);
        startActivity(cancelar);

        Toast toastCancelar =
                Toast.makeText(getApplicationContext(),
                        "Regreso al inicio", Toast.LENGTH_LONG);

        toastCancelar.show();
    }

    public void Crear(View view){
        helper.getWritableDatabase();
        insertarUsuario();

        Toast toastCrear =
                Toast.makeText(getApplicationContext(),
                        "Cuenta creada correctamente", Toast.LENGTH_LONG);
        toastCrear.show();

        Intent crear = new Intent(this, MainActivity.class);
        crear.putExtra("Nombre", txtNomUsu.getEditText().getText().toString());
        startActivity(crear);
    }

    private String validarCheck(){
        String check = "";
        if (checkUsuHomb.isChecked()) {
            check = (String) checkUsuHomb.getText();
        }
        if (checkUsuMuj.isChecked()){
            check = (String) checkUsuMuj.getText();
        }
        return check;
    }

    private String obtenerFecha(){
        String fecha, dia, mes, ano;

        dia = String.valueOf(listaDias.getSelectedItem());
        mes = String.valueOf(listaMeses.getSelectedItem());
        ano = String.valueOf(listaAnos.getSelectedItem());

        fecha = "" + dia + "/" + mes + "/" + ano + "";
        return fecha;
    }

    public void insertarUsuario(){
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(CAMPO_NOMBRE_USUARIO, String.valueOf(txtNomUsu.getEditText().getText()));
        valores.put(CAMPO_APELLIDOS_USUARIO, String.valueOf(txtApellUsu.getEditText().getText()));
        valores.put(CAMPO_SEXO, validarCheck() );
        valores.put(CAMPO_FECHA_NACIMIENTO, obtenerFecha());
        valores.put(CAMPO_NACIONALIDAD, String.valueOf(listaPaises.getSelectedItem()));
        valores.put(CAMPO_LOCALIDAD, String.valueOf(txtLocUsu.getEditText().getText()));
        valores.put(CAMPO_TELEFONO_USUARIO, String.valueOf(txtTelfUsu.getEditText().getText()));
        valores.put(CAMPO_USERNAME_USUARIO, String.valueOf(txtUserUsu.getEditText().getText()));
        valores.put(CAMPO_EMAIL_USUARIO, String.valueOf(txtEmailUsu.getEditText().getText()));
        valores.put(CAMPO_PASSWORD, String.valueOf(txtPassUsu.getEditText().getText()));

        db.insertOrThrow(TABLA_USUARIO, null, valores);
        db.close();
    }
}