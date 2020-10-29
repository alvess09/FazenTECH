package com.example.testeapp;
/* https://www.youtube.com/watch?v=a87CqD1qm18// */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editemail, editpswd, editname, editadress, editnasc;
    Button btnsave;
    Button btnclean;
    Button btnentrar;
    Button btncadastrar;


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
        btnentrar = (Button)findViewById(R.id.btnentrar);
        btncadastrar =(Button)findViewById(R.id.btncadastrar);

        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(String.valueOf(Login.class)));

            }
        });

        btncadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActionMode((ActionMode.Callback) new Intent(String.valueOf(CadUser.class)));
            }
        });

    }

}