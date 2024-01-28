package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tentang extends AppCompatActivity {

    ImageButton back;
    Button btnpakar,btnketua,btnanggota1,btnanggota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tentang.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnpakar = findViewById(R.id.btnpakar);
        btnpakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), pakar.class));
            }
        });
        btnketua = findViewById(R.id.btnketua);
        btnketua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ketua.class));
            }
        });
        btnanggota1 = findViewById(R.id.btnanggota1);
        btnanggota1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), anggota1.class));
            }
        });
        btnanggota2 = findViewById(R.id.btnanggota2);
        btnanggota2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), anggota2.class));
            }
        });
    }
}