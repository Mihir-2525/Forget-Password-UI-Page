package com.example.forgetpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CheckMailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_mail_page);
    }
    /*
        Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(view -> {
            Intent in =new Intent(CheckMailPage.this,CreateNewPass.class);
            startActivity(in);
        });
    }
     */
}