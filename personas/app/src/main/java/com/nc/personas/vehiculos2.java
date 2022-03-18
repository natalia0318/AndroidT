package com.nc.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class vehiculos2 extends AppCompatActivity {
    public ImageView FotoM;
    public TextView NombreM;
    public TextView Placa1;
    public TextView Modelo1;
    public TextView Linea1;
    public TextView Color1;
    public TextView Carroceria1;
    public TextView Servicio1;
    public TextView Motor1;
    public TextView Chasis1;
    public TextView Clase;
    public Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculos2);
        setContentAttributes();

    }
    private void setContentAttributes(){
        FotoM = findViewById(R.id.FotoM);
        NombreM = findViewById(R.id.NombreM);
        Placa1 = findViewById(R.id.Placa1);
        Modelo1 = findViewById(R.id.Modelo1);
        Linea1 = findViewById(R.id.Linea1);
        Color1 = findViewById(R.id.Color1);
        Carroceria1 = findViewById(R.id.Carroceria1);
        Servicio1 = findViewById(R.id.Servicio1);
        Motor1 = findViewById(R.id.Motor1);
        Chasis1 = findViewById(R.id.Chasis1);
        Clase = findViewById(R.id.Clase);
        button4 = findViewById(R.id.button4);

    }
}