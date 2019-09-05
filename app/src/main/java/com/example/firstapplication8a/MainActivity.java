package com.example.firstapplication8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "La Aplicacion Ha Sido Creada", Toast.LENGTH_LONG).show();
        //contexto, mensaje y tiempo
        //el length_short tiene mitad de segundo, el length_long tiene un segundo

    }

    //para iniciar la aplicacion
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "La Aplicacion Ha Comenzado", Toast.LENGTH_LONG).show();

    }

    //para mostrar la aplicacion
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "La Aplicacion Es Visible", Toast.LENGTH_LONG).show();
    }

    //cuando el usuario cambia de aplicacion
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "La Aplicacion Ha Sido Pausada", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "La Aplicacion Ha Sido Detenida", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "La Aplicacion Ha Sido Destruida", Toast.LENGTH_LONG).show();
    }
}
