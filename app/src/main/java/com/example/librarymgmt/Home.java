package com.example.librarymgmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void logout(View view) {
        Intent lgout=new Intent(this,MainActivity.class);
        lgout.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(lgout);
        finish();
    }

    public void addBooks(View view) {
        Intent addbooks=new Intent(this,AddBooks.class);
        startActivity(addbooks);
    }

    public void issueBooks(View view) {
        Intent issuebooks=new Intent(this,IssueBooks.class);
        startActivity(issuebooks);
    }

    public void getPosition(View view) {
        Intent position=new Intent(this,BookPosition.class);
        startActivity(position);
    }

    public void viewBooks(View view) {
        Intent viewbks=new Intent(this,ViewBooks.class);
        startActivity(viewbks);
    }
}