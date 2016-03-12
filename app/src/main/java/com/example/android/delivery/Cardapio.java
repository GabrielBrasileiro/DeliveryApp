package com.example.android.delivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cardapio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
    }

    public void valortotal(View view){
        Intent it = new Intent(getBaseContext(), Boleto.class);
        startActivity(it);
    }
}
