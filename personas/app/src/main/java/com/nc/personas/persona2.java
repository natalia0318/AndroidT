package com.nc.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class persona2 extends AppCompatActivity {
    public ImageView Foto;
    public TextView Nombre1;
    public TextView Apellido1;
    public TextView Documento1;
    public TextView Sexo1;
    public TextView Edad1;
    public TextView Direccion1;
    public TextView Telefono1;
    public TextView Correo1;
    public TextView Ocupacion1;
    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona2);
        setContentAttributes();

    }
    private void setContentAttributes(){
       Foto = findViewById(R.id.Foto);
       Nombre1 = findViewById(R.id.Nombre1);
       Apellido1 = findViewById(R.id.Apellido1);
       Documento1 = findViewById(R.id.Documento1);
       Sexo1 = findViewById(R.id.Sexo1);
       Edad1 = findViewById(R.id.Edad1);
       Direccion1 = findViewById(R.id.Direccion1);
       Telefono1 = findViewById(R.id.Telefono1);
       Correo1 = findViewById(R.id.Correo1);
       Ocupacion1 = findViewById(R.id.Ocupacion1);
       button2 = findViewById(R.id.button2);



    }
}