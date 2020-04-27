package com.example.appguidata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nome = (EditText)findViewById(R.id.Nome);
        Button bpremi = (Button) findViewById(R.id.Premi);
        Button reset = (Button) findViewById(R.id.Reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome.setText("");

            }
        });

        bpremi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testoNome = nome.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(), "Ciao sono un Toast "+testoNome, Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }

    public void sendMessage(View view){
        EditText nome = (EditText)findViewById(R.id.Nome);
        String NomeUtente = nome.getText().toString();
        Intent intent = new Intent(getApplicationContext(), ShowMessageActivity.class);
        intent.putExtra("chiave", "Ciao");
        intent.putExtra("Nome", NomeUtente);
        startActivity(intent);
    }


}
