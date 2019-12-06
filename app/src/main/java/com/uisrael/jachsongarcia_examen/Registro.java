package com.uisrael.jachsongarcia_examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    EditText etusuario;
    Bundle dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        String valor = dato.getString("valor enviado");
        etusuario.setText(valor);
    }
    public void calcular(View v){
        int pagomensual = 0, montoinicial=0;
    }
}
