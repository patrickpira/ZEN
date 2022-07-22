package com.patcode.zen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Land extends AppCompatActivity {
    private Button landhelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);
        landhelp = findViewById(R.id.landhelp);
        landhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotolandtwo();
            }
        });


    }

    private void gotolandtwo() {
        Intent land = new Intent(this, Land2.class);
        startActivity(land);
    }
}