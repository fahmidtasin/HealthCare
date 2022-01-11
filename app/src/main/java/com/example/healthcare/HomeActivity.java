package com.example.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button = findViewById(R.id.ambulance);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AmbulanceActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = findViewById(R.id.pills);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PillsActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.nearme);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.aboutus);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });


    }
}
