package com.example.appguidata1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModifyActivity extends AppCompatActivity {
    String nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        nome = b.getString("Nome");
        StringBuffer buffer = new StringBuffer(nome);
        nome = buffer.reverse().toString();

        Button button = (Button) findViewById(R.id.ShowResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Nome", nome);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }
}
