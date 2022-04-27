package com.example.terapigealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelesaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);
    }

    public void btnLagi(View view) {
        Intent lagi = new Intent(this, MainActivity.class);
        startActivity(lagi);
    }
}