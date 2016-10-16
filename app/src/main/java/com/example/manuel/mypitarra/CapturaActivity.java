package com.example.manuel.mypitarra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CapturaActivity extends AppCompatActivity {

    EditText etNombre;
    Button btnCapturar;
    Button btnFinal;
    String participantes;
    List<Participante> listaParticipantes;
    ArrayList<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captura);

        etNombre = (EditText) findViewById(R.id.etNombre);
        btnCapturar = (Button) findViewById(R.id.btnCapturar);
        btnFinal = (Button) findViewById(R.id.btnFinal);
        listaParticipantes = new ArrayList<Participante>();
        numeros = new ArrayList<Integer>();

        Bundle bundle = getIntent().getExtras();
        participantes = bundle.getString("participantes");
        Toast.makeText(this, participantes+" Participantes", Toast.LENGTH_SHORT).show();

        creaNumeros(participantes);

        btnCapturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                creaParticipante(etNombre.getText().toString());

            }
        });

        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void creaNumeros(String participantes) {
        int num = Integer.parseInt(participantes);
        Random r = new Random();
        for(int i = 0; i < num; i++) {
            numeros.add(r.nextInt(num));
        }
    }

    private void creaParticipante(String s) {
        Participante participante = new Participante();
        participante.setNombre(s);
        participante.setTurno(asignarTurno());
    }

    private int asignarTurno() {
        return 0;
    }
}
