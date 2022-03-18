package com.nc.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Vehiculos extends AppCompatActivity {
    public ImageView Imagen3;
    public TextView Marca;
    public TextView Placa;
    public TextView Modelo;
    public TextView Linea;
    public TextView Color;
    public TextView Carroceria;
    public TextView Servicio;
    public TextView Motor;
    public TextView Chasis;
    public TextView ClaseV;
    public Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculos);
        setContentAttributes();

    }
    private void setContentAttributes(){
        Imagen3 = findViewById(R.id.Imagen3);
        Marca = findViewById(R.id.Marca);
        Placa = findViewById(R.id.Placa);
        Modelo = findViewById(R.id.Modelo);
        Linea = findViewById(R.id.Linea);
        Color = findViewById(R.id.Color);
        Carroceria = findViewById(R.id.Carroceria);
        Servicio = findViewById(R.id.Servicio);
        Motor = findViewById(R.id.Motor);
        Chasis = findViewById(R.id.Chasis);
        ClaseV = findViewById(R.id.ClaseV);
        button3 = findViewById(R.id.button3);


    }
}