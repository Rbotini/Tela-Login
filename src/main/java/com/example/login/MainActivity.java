package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


      String TAG = "Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void entrar(View view){
        String x ="renato";
        String y = "renato";
        String password ="renato";
        EditText entrar = findViewById(R.id.editName);
        EditText senha = findViewById(R.id.editSenha);
        TextView resultado = findViewById(R.id.textResul);
        String usuarioDigitado = entrar.getText().toString();
        String senhaDigitada = senha.getText().toString();

        if(usuarioDigitado.isEmpty() || senhaDigitada.isEmpty()) {
            resultado.setText("Usuário ou senha não preenchida");

        }else if (x.equals(usuarioDigitado) == true && y.equals(senhaDigitada) == true){
                resultado.setText("Olá renato");
            }else{
               resultado.setText("Login ou senha inválidos");
            }




        Log.i(TAG, "entrar: "+ x.equals(usuarioDigitado));
        Log.i(TAG, "entrar: "+ y.equals(senhaDigitada));


    }
}