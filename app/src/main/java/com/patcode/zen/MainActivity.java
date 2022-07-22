package com.patcode.zen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public  static final String TTS = "com.patcode.zen.TTS";
    private Button bEnter;
    private TextView Username;
    private EditText etNAme;
    private String txttowelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        bEnter = (Button) findViewById(R.id.bEnter);
        Username= findViewById(R.id.Username);
        etNAme= findViewById(R.id.etNAME);




        bEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            txttowelcome = etNAme.getText().toString();
            goToWelcomePage();



            }
        });
    }

    private void goToWelcomePage() {
        Intent i = new Intent(this, Welcome_Page.class);
        i.putExtra(TTS,txttowelcome);
        startActivity(i);
    }


}