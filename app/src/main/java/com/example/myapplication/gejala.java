package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class gejala extends AppCompatActivity {
    private List<CheckBox> checkboxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala);
        checkboxes = new ArrayList<>();
        // Inisialisasi checkbox dan tambahkan ke dalam list checkboxes
        checkboxes.add(findViewById(R.id.check1));
        checkboxes.add(findViewById(R.id.check2));
        checkboxes.add(findViewById(R.id.check3));
        checkboxes.add(findViewById(R.id.check4));
        checkboxes.add(findViewById(R.id.check5));
        checkboxes.add(findViewById(R.id.check6));
        checkboxes.add(findViewById(R.id.check7));
        checkboxes.add(findViewById(R.id.check8));


        // Tambahkan checkbox lainnya hingga gejala ke-30

        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungProbabilitas();
            }
        });
    }

    private void hitungProbabilitas() {
        double[] probabilitasGejala = {0.2, 0.2, 0.2, 0.2, 0.2}; // Asumsi probabilitas gejala
        double[] probabilitasKerusakan = {0.2, 0.2, 0.2, 0.2, 0.2}; // Asumsi probabilitas kerusakan

        int gejalaTercentang = 0;
        for (CheckBox checkbox : checkboxes) {
            if (checkbox.isChecked()) {
                gejalaTercentang++;
            }
        }

        // Misalnya, kita hitung probabilitas kerusakan jika terdapat 6 gejala tercentang
        if (gejalaTercentang == 6) {
            double probabilitas = 0;
            for (int i = 0; i < probabilitasKerusakan.length; i++) {
                probabilitas += (probabilitasGejala[i] * probabilitasKerusakan[i]);
            }
            probabilitas /= 6; // Jumlah gejala tercentang

            // Tampilkan hasil probabilitas menggunakan Toast
            Toast.makeText(gejala.this, "Probabilitas kerusakan: " + probabilitas, Toast.LENGTH_SHORT).show();
        } else {
            // Jika gejala yang tercentang tidak tepat
            Toast.makeText(gejala.this, "Harap pilih tepat 6 gejala", Toast.LENGTH_SHORT).show();
        }
    }
}