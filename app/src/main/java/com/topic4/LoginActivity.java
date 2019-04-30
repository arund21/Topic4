package com.topic4;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etLUsername,etLPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLUsername = findViewById(R.id.etLUsername);
        etLPassword = findViewById(R.id.etLPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUser();
            }
        });
    }
        private void checkUser(){
            SharedPreferences sharedPreferences = getSharedPreferences("User",MODE_PRIVATE);
            String username = sharedPreferences.getString("username","");
            String password = sharedPreferences.getString("password","");

            if (username.equals(etLUsername.getText().toString()) &&  password.equals(etLPassword.getText().toString())) {

                Toast.makeText(LoginActivity.this,"Success",Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(LoginActivity.this,"Either username or password is incorrect", Toast.LENGTH_LONG).show();
            }
        }
    }
