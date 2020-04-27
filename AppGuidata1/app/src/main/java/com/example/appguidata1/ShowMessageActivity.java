package com.example.appguidata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String testo = b.getString("chiave");
        String nome = b.getString("Nome");
        TextView etichetta = (TextView) findViewById(R.id.textView);
        etichetta.setText(testo+" "+nome);

    }
}
