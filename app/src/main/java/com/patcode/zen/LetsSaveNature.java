package com.patcode.zen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LetsSaveNature extends AppCompatActivity {
    private Button btndoit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_save_nature);


        btndoit =(Button) findViewById(R.id.btndoit);
        btndoit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotomenu();
            }
        });


    }

    private void gotomenu() {
        Intent i = new Intent(this, menu.class);
        startActivity(i);
    }
}