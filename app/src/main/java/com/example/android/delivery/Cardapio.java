package com.example.android.delivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cardapio extends AppCompatActivity {
    String nomeCliente;
    String numerocliente;
    String CEPusuario;
    String Emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        Bundle b = getIntent().getExtras();
         nomeCliente = (String) b.get("nome_cliente");
         numerocliente = (String) b.get("numero_cliente");
         CEPusuario = (String) b.get("CEP");
         Emailusuario = (String) b.get("Email_usuario");
    }

    public void valortotal(View view){
        Intent it = new Intent(getBaseContext(), Boleto.class);
        it.putExtra("nome_cliente", nomeCliente);
        it.putExtra("numero_cliente", numerocliente);
        it.putExtra("CEP", CEPusuario);
        it.putExtra("Email_usuario", Emailusuario);
        startActivity(it);
    }
}
