package com.example.librarymgmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void goBack(View view) {
        Intent back=new Intent(this,MainActivity.class);
        startActivity(back);
    }

    public void RegisterDone(View view) {
        Intent home=new Intent(this,Home.class);
        startActivity(home);
    }
}