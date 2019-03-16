package com.example.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boton1;
    private Button boton2;
    private TextView contador1;
    private TextView contador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1= findViewById(R.id.boton1);
        boton2= findViewById(R.id.boton2);
        contador1= findViewById(R.id.contador1);
        contador2= findViewById(R.id.contador2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cont;
                cont = Integer.parseInt(contador1.getText().toString())+1;
                contador1.setText(String.valueOf(cont));
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cont;
                cont = Integer.parseInt(contador2.getText().toString())+1;
                contador2.setText(String.valueOf(cont));
            }
        });
    }
}
