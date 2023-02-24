package com.example.laboratorio_2_rhfm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagen;
    private TextView subtitulo;
    private TextView definicion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = findViewById(R.id.imageView);
        imagen.setImageResource(R.drawable.payaso);


        subtitulo = findViewById(R.id.article_subheading);
        subtitulo.setText(R.string.Pescado_1);

        definicion = findViewById(R.id.descripcion);
        definicion.setText(R.string.Descripcion_1);

        Button button = findViewById(R.id.boton_siguiente);
        button.setOnClickListener(view -> {
            imagen.setImageResource(R.drawable.globo);
            subtitulo.setText(R.string.Pescado_2);
            definicion.setText(R.string.Descripcion_2);
            findViewById(R.id.scroll).scrollTo(0,0);

        });

        Button button2 = findViewById(R.id.boton_atras);
        button2.setOnClickListener(view -> {
            imagen.setImageResource(R.drawable.payaso);
            subtitulo.setText(R.string.Pescado_1);
            definicion.setText(R.string.Descripcion_1);
            findViewById(R.id.scroll).scrollTo(0,0);
        });
    }
}