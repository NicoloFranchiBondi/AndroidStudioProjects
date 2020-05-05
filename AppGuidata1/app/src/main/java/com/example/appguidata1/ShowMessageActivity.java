package com.example.appguidata1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowMessageActivity extends AppCompatActivity {

    private static final Object TAG =  1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);


        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String testo = b.getString("chiave");
        final String nome = b.getString("Nome");
        TextView etichetta = (TextView) findViewById(R.id.textView);
        etichetta.setText(testo+" "+nome);

        Button home = (Button) findViewById(R.id.Home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final  int REQUEST_CODE = 1;
                Intent intent = new Intent(getApplicationContext(), ModifyActivity.class);
                intent.putExtra("Nome", nome);

                startActivityForResult(intent, REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView etichetta = (TextView) findViewById(R.id.textView);
        etichetta.setText(data.getStringExtra("Nome"));
    }

    /*public void ReturnHome(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }*/



}
