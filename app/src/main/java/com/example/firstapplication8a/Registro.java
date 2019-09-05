package com.example.firstapplication8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private EditText a,b,c,d,e;
    private TextView f,g,h,i,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        a= findViewById(R.id.Id_Email);
        b= findViewById(R.id.Id_Nombre);
        c= findViewById(R.id.Id_Apellido);
        d= findViewById(R.id.Id_Contraseña);
        e= findViewById(R.id.Id_Telefono);

        f= findViewById(R.id.Id_Txt_Email);
        g= findViewById(R.id.Id_Txt_Nombre);
        h= findViewById(R.id.Id_Txt_Apellido);
        i= findViewById(R.id.IdTxtContraseña);
        j= findViewById(R.id.Id_Txt_Contraseña);

    }

    public void validar (View view){
        String Email = a.getText().toString();
        f.setText(Email);
        String Nombre = b.getText().toString();
        g.setText(Nombre);
        String Apellido = c.getText().toString();
        h.setText(Apellido);
        String Contraseña = d.getText().toString();
        i.setText(Contraseña);
        String Telefono = e.getText().toString();
        j.setText(Telefono);
    }
}
