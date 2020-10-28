package com.example.fazentech;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class produto1 extends AppCompatActivity {
    int quantidade = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produto01);




    }
    public void onClick(View v){

        EditText valor = (EditText) findViewById(R.id.editValor);

        TextView mostrarValor = (TextView) findViewById(R.id.valorFinal);
        mostrarValor.setText(valor.getText());


    }
    public void somar(View view){
        quantidade= quantidade + 1;
        displayQuantidade(quantidade);
    }

    public void subtrair(View view){
        quantidade = quantidade - 1;
        displayQuantidade(quantidade);
    }

    public void displayQuantidade(int qtdpedido02){
        TextView qtdTextview = (TextView) findViewById(R.id.quantidade_tv);
        qtdTextview.setText("" + qtdpedido02);

    }


}