package com.patcode.zen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Water extends AppCompatActivity {
    private Button waterhelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        waterhelp = (Button)findViewById(R.id.waterhelp);
        waterhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwatertwo();
            }
        });
    }

    private void openwatertwo() {
        Intent wotah = new Intent(this,Water2.class);
        startActivity(wotah);
    }
}