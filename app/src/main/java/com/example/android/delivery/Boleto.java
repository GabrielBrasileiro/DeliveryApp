package com.example.android.delivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Boleto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boleto);

        Bundle b = getIntent().getExtras();
        String nomeCliente = (String) b.get("nome_cliente");
        String numerocliente = (String) b.get("numero_cliente");
        String CEPusuario = (String) b.get("CEP");
        String Emailusuario = (String) b.get("Email_usuario");

        TextView test = (TextView) findViewById(R.id.test);
        test.setText(cadastro_cliente(nomeCliente, numerocliente, CEPusuario, Emailusuario));
    }

    private String cadastro_cliente(String nomeCliente, String numeroCliente, String CEPusuario, String Emailusuario) {
        return "Nome do Cliente: " + nomeCliente +
                "\nCelular: " + numeroCliente +
                "\nEndereço(CEP): " + CEPusuario +
                "\nE-mail do Cliente: " + Emailusuario +
                "\nObrigado!";
    }
}
