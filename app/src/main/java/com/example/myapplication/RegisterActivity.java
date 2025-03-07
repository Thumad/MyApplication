package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        //Collegamento con elementi grafici
        EditText nome = findViewById(R.id.RegistrazioneNome);
        EditText cognome = findViewById(R.id.RegistrazioneCognome);
        EditText email = findViewById(R.id.RegistrazioneEmail);
        EditText password = findViewById(R.id.RegistrazionePassword);
        EditText dataNascita = findViewById(R.id.RegistrazioneData);
        Button registrati = findViewById(R.id.RegistrazioneButton);

        registrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utente utente = new Utente(nome.getText().toString(), cognome.getText().toString(), dataNascita.getText().toString(), email.getText().toString(), password.getText().toString());
                Log.d("Registrazione", "Nome: "+ nome.getText().toString() + "Cognome: "+cognome.getText().toString() + "Data: "+ dataNascita.getText().toString() + "Email: "+email.getText().toString() + "Password: "+password.getText().toString());
                Toast.makeText(RegisterActivity.this, nome.getText().toString()+" registrato", Toast.LENGTH_LONG).show();
            }
        });

    }
}
