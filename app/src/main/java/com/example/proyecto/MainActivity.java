package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
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
    //Variable para gestionar FireBase
    private FirebaseAuth mfirebaseAuth;
    //Agregar cliente de inicio de sesión de Google
    private GoogleSignInClient mGoogleSignInClient;

    public static final int REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Base de datos
        helper = new ConexionSQLiteHelper(this, "Proyecto.db", null, 1);

        //FireBase
        mfirebaseAuth = FirebaseAuth.getInstance();

        //Configurar Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        //Crear un GoogleSignInClient con las opciones especificadas por el gso
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

    }

    public void signIn(){
        Intent signIn = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signIn, REQUEST_CODE);
    }

    public void EntrarGoogle(View view){
        signIn();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            if (task.isSuccessful()){
                GoogleSignInAccount account = task.getResult();
                Toast toastEntrarGoogle =
                    Toast.makeText(getApplicationContext(),
                            "Inicio de sesión con Google correcto", Toast.LENGTH_LONG);
                toastEntrarGoogle.show();
                fireBaseAuthWithGoogle(account.getIdToken());
                createNotification();
            } else {
                Toast toastEntrarGoogleFallido =
                    Toast.makeText(getApplicationContext(),
                            "Inicio de sesión con Google incorrecto", Toast.LENGTH_LONG);
                toastEntrarGoogleFallido.show();
            }
        }
    }

    private void fireBaseAuthWithGoogle(String idToken){
        AuthCredential credencial = GoogleAuthProvider.getCredential(idToken, null);
        mfirebaseAuth.signInWithCredential(credencial).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Intent entrarAppGoogle = new Intent(MainActivity.this, SplashScreenInicioSesion.class);
                    startActivity(entrarAppGoogle);
                    createNotification();
                }
            }
        });
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
                createNotificationChannel();
                createNotification();
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
            usuario.getEditText().setText("");
            password.getEditText().setText("");
            usuario.findFocus();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    private void createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "NOTIFICACION";
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,name, NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
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