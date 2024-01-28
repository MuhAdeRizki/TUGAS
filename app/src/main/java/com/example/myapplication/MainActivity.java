package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton gejala,kerusaka1n,tentang;
    private ImageButton tempat1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempat1 = findViewById(R.id.tempat);
        tempat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }

            private void openMap() {
                Uri uri = Uri.parse("geo:0, 0?q=Samsung Service Center - Sorong");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        gejala = (ImageButton) findViewById(R.id.gejal1a);
        gejala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainDiagnosaActivity.class);
                startActivity(intent);
            }
        });
        kerusaka1n = (ImageButton) findViewById(R.id.kerusakan);
        kerusaka1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Kerusakan.class);
                startActivity(intent);
            }
        });
        tentang = (ImageButton) findViewById(R.id.tentan1g);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, tentang.class);
                startActivity(intent);
            }
        });
    }
}