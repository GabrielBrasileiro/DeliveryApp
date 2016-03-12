package com.example.android.delivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Esse botão chama de uma página para outra
    public void submitOrder(View view){
        EditText name1Field = (EditText) findViewById(R.id.nome_Cliente);
        String name1 = name1Field.getText().toString();

        EditText name2Field = (EditText) findViewById(R.id.Numero_Cliente);
        String name2 = name2Field.getText().toString();

        EditText name3Field = (EditText) findViewById(R.id.CEP);
        String name3 = name3Field.getText().toString();

        EditText name4Field = (EditText) findViewById(R.id.Email_usuario);
        String name4 = name4Field.getText().toString();

        Intent it = new Intent(getBaseContext(), Cardapio.class);
        it.putExtra("nome_cliente", name1);
        it.putExtra("numero_cliente", name2);
        it.putExtra("CEP", name3);
        it.putExtra("Email_usuario", name4);
        startActivity(it);
        startActivity(it);
    }



    }

