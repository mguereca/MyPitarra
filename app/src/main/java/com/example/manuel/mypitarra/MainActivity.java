package com.example.manuel.mypitarra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etParticipantes;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etParticipantes = (EditText) findViewById(R.id.etParticipantes);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lanzarCapturaActivity(v,etParticipantes.getText().toString());
            }
        });
    }

    private void lanzarCapturaActivity(View v, String s) {
        if(s.length() > 0) {
            Toast.makeText(this, s + " Participantes", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(MainActivity.this,CapturaActivity.class);
            i.putExtra("participantes",s);
            startActivity(i);

        }else{
            Toast.makeText(this, "NO Participantes", Toast.LENGTH_SHORT).show();
        }
    }


}
