package com.example.testeapp;
//https://www.youtube.com/watch?v=a87CqD1qm18//
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editemail, editpswd, editname, editadress, editnasc;
    Button btnsave;
    Button btnclean;

    DataBase db;
    {
        db = new DataBase(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editemail = (EditText)findViewById(R.id.editemail);
        editpswd = (EditText)findViewById(R.id.editpswd);
        editname = (EditText)findViewById(R.id.editname);
        editadress = (EditText)findViewById(R.id.editadress);
        editnasc = (EditText)findViewById(R.id.editnasc);

        btnsave = (Button)findViewById(R.id.btnsave);
        btnclean = (Button)findViewById(R.id.btnclean);

        /* TESTE DO CRUD  */
        db.addClient(new Client("arielalves9@gmail.com","1234","Ariel","05671707560","30081994","rua 1,teste") );
        Toast.makeText(MainActivity.this, "Cadastro Salvo com Sucesso! ", Toast.LENGTH_LONG).show();


    }

}