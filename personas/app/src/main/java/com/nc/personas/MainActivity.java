package com.nc.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public ImageView Imagen;
    public TextView Nombre;
    public TextView Apellido;
    public TextView Documento;
    public TextView Sexo;
    public TextView Edad;
    public TextView Direccion;
    public TextView Telefono;
    public TextView Correo;
    public TextView Ocupacion;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentAttributes();

    }
    private void setContentAttributes(){
       Imagen = findViewById(R.id.Imagen);
       Nombre = findViewById(R.id.Nombre);
       Apellido = findViewById(R.id.Apellido);
       Documento = findViewById(R.id.Documento);
       Sexo = findViewById(R.id.Sexo);
       Edad = findViewById(R.id.Edad);
       Direccion = findViewById(R.id.Direccion);
       Telefono = findViewById(R.id.Telefono);
       Correo = findViewById(R.id.Correo);
       Ocupacion = findViewById(R.id.Ocupacion);
       button = findViewById(R.id.button);


    }
}