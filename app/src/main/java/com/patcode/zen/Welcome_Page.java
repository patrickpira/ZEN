package com.patcode.zen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Welcome_Page extends AppCompatActivity {
    private Button btnWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        btnWelcome = (Button)findViewById(R.id.btnWelcome);
        btnWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotosavenature();
            }
        });

        Intent i =getIntent();
        String uName = i.getStringExtra(MainActivity.TTS);
        TextView txtview = findViewById(R.id.Username);
        txtview.setText(uName);



    }

    private void gotosavenature() {
        Intent i = new Intent(this,LetsSaveNature.class);
        startActivity(i);
    }
}