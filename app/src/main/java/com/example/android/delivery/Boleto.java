package com.example.android.delivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Boleto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boleto);

        Bundle b = getIntent().getExtras();
        String nomeCliente = (String) b.get("nome_cliente");
    }
}
