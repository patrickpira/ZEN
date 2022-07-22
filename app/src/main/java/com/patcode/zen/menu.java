package com.patcode.zen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button air,land,water;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        air = (Button) findViewById(R.id.air);
        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoair();
            }
        });


        land = (Button) findViewById(R.id.land);
        land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoland();

            }
        });




        water = (Button) findViewById(R.id.water);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotowater();
            }
        });

    }

    private void gotowater() {
        Intent water = new Intent(this,Water.class);
        startActivity(water);
    }

    private void gotoland() {
        Intent land = new Intent(this,Land.class);
        startActivity(land);
    }

    private void gotoair() {
        Intent air = new Intent(this,Air.class);
        startActivity(air);
    }
}