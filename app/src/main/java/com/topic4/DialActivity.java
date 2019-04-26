package com.topic4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DialActivity extends AppCompatActivity {
    private EditText etPhoneNo;
    private Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        etPhoneNo = findViewById(R.id.etPhoneNo);
        btnDial = findViewById(R.id.btnDial);
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dial();
            }
        });
    }
    private void Dial(){
        Uri u = Uri.parse("tel:"+etPhoneNo.getText().toString());
        Intent intent = new Intent(Intent.ACTION_DIAL,u);
        startActivity(intent);
    }
}
