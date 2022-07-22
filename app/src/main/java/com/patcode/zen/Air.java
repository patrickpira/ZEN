package com.patcode.zen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Air extends AppCompatActivity {
    private Button airhelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air);

        airhelp = (Button)findViewById(R.id.landhelp);
        airhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startairtwo();
            }
        });

    }

    private void startairtwo() {
        Intent startairtwo = new Intent(this, Air2.class);
        startActivity(startairtwo);
    }


}