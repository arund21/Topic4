package com.topic4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {
Button btnOpenDictionary,btnOpenCountry,btnCallme,btnMyregister,btnMylogin,btnCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        btnOpenCountry = findViewById(R.id.btnOpenCountry);
        btnOpenDictionary = findViewById(R.id.btnOpenDictionary);
        btnCallme = findViewById(R.id.btnCallme);
        btnMyregister = findViewById(R.id.btnMyregister);
        btnMylogin = findViewById(R.id.btnMylogin);
        btnCamera = findViewById(R.id.btnCamera);

        btnOpenDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,MainActivity.class);
                startActivity(intent);

            }
        });

        btnOpenCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,AddcountryActivity.class);
                startActivity(intent);
            }
        });
        btnCallme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,DialActivity.class);
                startActivity(intent);
            }
        });
        btnMyregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,RegistrationActivity.class);
                startActivity(intent);
            }
        });
        btnMylogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,CameraApp.class);
                startActivity(intent);
            }
        });
    }
}
