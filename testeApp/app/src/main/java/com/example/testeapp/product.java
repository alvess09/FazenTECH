package com.example.testeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.testeapp.R;

public class product extends AppCompatActivity {
    CardView leite;
    CardView melancia;
    CardView laranja;
    CardView limao;


    @Override
     protected  void  onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtos);
        leite = findViewById(R.id.leite);
        melancia= findViewById(R.id.melancia);
        laranja = findViewById(R.id.laranja);
        limao = findViewById(R.id.limão);

        leite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(product.this, com.example.testeapp.produto1.class));

            }
        });
        melancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(product.this, com.example.testeapp.produto2.class));
            }
        });

        laranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(product.this, com.example.testeapp.produto3.class));

            }
        });
        limao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(product.this, com.example.testeapp.produto4.class));

            }
        });



    }
}
