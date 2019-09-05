package com.example.firstapplication8a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText usuario, contraseña;
    private  Button btnInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario= findViewById(R.id.IdtxtEmail);
        contraseña= findViewById(R.id.IdTxtContraseña);
        btnInicio = findViewById(R.id.IdButtonIniciarSesion);

    }

    public void IniciarSesion(View view) {
        //el redireccionamiento depende de la actividad de login

        String email1 = "stiveng21@gmail.com";
        String password1 = "stiven26";

        //esto es lo que llega de las cajas del formulario
        String User = usuario.getText().toString();
        String Pssword = contraseña.getText().toString();
        

        if (User.equals(email1) && Pssword.equals(password1)) {
            Toast.makeText(this, "Inicio de sesion Correcto", Toast.LENGTH_LONG).show();
            Intent Menu = new Intent(this, MainActivity.class);
            startActivity(Menu);
        } else {
            Toast.makeText(this, "Inicio de sesion Inorrecto", Toast.LENGTH_LONG).show();

        }
    }

    public void Registrar (View view){
        //redireccionar a la actividad de registro
        Intent registro = new Intent(this, Registro.class);
        startActivity(registro);
    }
}
