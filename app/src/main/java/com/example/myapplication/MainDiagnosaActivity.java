package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainDiagnosaActivity extends AppCompatActivity {
    CheckBox ChckC1, ChckC2, ChckC3, ChckC4, ChckC5, ChckC6, ChckC7, ChckC8, ChckC9, ChckC10, ChckC11,
            ChckC12, ChckC13, ChckC14, ChckC15, ChckC16, ChckC17, ChckC18, ChckC19, ChckC20, ChckC21,
            ChckC22, ChckC23, ChckC24, ChckC25, ChckC26;

    ImageButton back;
    TextView hslDiagnosa, ketDiagnosa, kerusakanDiagnosa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diagnosa);
        ChckC1 = findViewById(R.id.checkBox1);
        ChckC2 = findViewById(R.id.checkBox2);
        ChckC3 = findViewById(R.id.checkBox3);
        ChckC4 = findViewById(R.id.checkBox4);
        ChckC5 = findViewById(R.id.checkBox5);
        ChckC6 = findViewById(R.id.checkBox6);
        ChckC7 = findViewById(R.id.checkBox7);
        ChckC8 = findViewById(R.id.checkBox8);
        ChckC9 = findViewById(R.id.checkBox9);
        ChckC10 = findViewById(R.id.checkBox10);
        ChckC11 = findViewById(R.id.checkBox11);
        ChckC12 = findViewById(R.id.checkBox12);
        ChckC13 = findViewById(R.id.checkBox13);
        ChckC14 = findViewById(R.id.checkBox14);
        ChckC15 = findViewById(R.id.checkBox15);
        ChckC16 = findViewById(R.id.checkBox16);
        ChckC17 = findViewById(R.id.checkBox17);
        ChckC18 = findViewById(R.id.checkBox18);
        ChckC19 = findViewById(R.id.checkBox19);
        ChckC20 = findViewById(R.id.checkBox20);
        ChckC21 = findViewById(R.id.checkBox21);
        ChckC22 = findViewById(R.id.checkBox22);
        ChckC23 = findViewById(R.id.checkBox23);
        ChckC24 = findViewById(R.id.checkBox24);
        ChckC25 = findViewById(R.id.checkBox25);
        ChckC26 = findViewById(R.id.checkBox26);

        hslDiagnosa = findViewById(R.id.hasilDiagnosa);
        ketDiagnosa = findViewById(R.id.ketDiagnosa);
        kerusakanDiagnosa = findViewById(R.id.kerusakanDiagnosa);

        kerusakanDiagnosa.setText("Kerusakan :");
        hslDiagnosa.setText("0%");
        ketDiagnosa.setText("Keterangan");

        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDiagnosaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void prosesDiagnosa(View view) {
        
        double G01 = 0.8;
        double G02 = 0.7;
        double G03 = 0.8;
        double G04 = 0.5;
        double G05 = 0.9;
        double G06 = 0.8;
        double G07 = 0.9;
        double G08 = 0.7;
        double G09 = 0.8;
        double G010 = 0.5;
        double G011 = 0.8;
        double G012 = 0.5;
        double G013 = 0.9;
        double G014 = 0.8;
        double G015 = 0.9;
        double G016 = 0.7;
        double G017 = 0.8;
        double G018 = 0.9;
        double G019 = 0.8;
        double G020 = 0.8;
        double G021 = 0.8;
        double G022 = 0.9;
        double G023 = 0.7;
        double G024 = 0.8;
        double G025 = 0.5;
        double G026 = 0.9;

        //Daftar Kerusakan
        String kerusakan1 = "LCD";
        String kerusakan2 = "Konektor Cas";
        String kerusakan3 = "Baterai";
        String kerusakan4 = "Mesin Utama";
        String kerusakan5 = "Flexibel";
        String kerusakan6 = "Kamera";

        //Daftar Solusi Kerusakan
        String solker1= "1.\tGanti Layar LCD Yang Rusak Dengan Yang Baru.\n" +
                "2.\tPerbaiki Layar Di Pusat Layanan Resmi Atau Oleh Teknisi Profesional.\n";

        String solker2 = "1.\tGanti Kabel Pengisian\n" +
                "2.\tPeriksa Kotoran Di Konektor HP\n" +
                "3.\tMelakukan Pergantian Konektor Charge\n";

        String solker3 = "\tJika Baterai Sudah Tua Atau Menunjukkan Tanda-Tanda Kerusakan, Pertimbangkan Untuk Menggantinya Dengan Baterai Yang Baru";

        String solker4 = "1.\tPeriksa Kondisi Fisik\n" +
                "2.\tPembersihan PCB\n" +
                "3.\tPenggantian Komponen\n" +
                "4.\tKonsultasikan Dengan Teknisi.\n";

        String solker5 = "1.\tPemeriksaan Visual\n" +
                "2.\tPenyambungan Kabel\n" +
                "3.\tPembersihan Soket\n" +
                "4.\tPenggantian Komponen\n";

        String solker6 = "1.\tRestart HP\n" +
                "2.\tPemeriksaan Fisik\n" +
                "3.\tKonsultasikan Dengan Teknisi \n";

        //RULE KERUSAKAN 1
        if (ChckC1.isChecked() && ChckC2.isChecked() && ChckC3.isChecked() && ChckC4.isChecked() && ChckC5.isChecked() && ChckC6.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G01 + G02 + G03 + G04 + G05 + G06;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG01 = G01 / totalProbabilities;
            double normalizedG02 = G02 / totalProbabilities;
            double normalizedG03 = G03 / totalProbabilities;
            double normalizedG04 = G04 / totalProbabilities;
            double normalizedG05 = G05 / totalProbabilities;
            double normalizedG06 = G06 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG01 = normalizedG01;
            double conditionalProbabilityG02 = normalizedG02;
            double conditionalProbabilityG03 = normalizedG03;
            double conditionalProbabilityG04 = normalizedG04;
            double conditionalProbabilityG05 = normalizedG05;
            double conditionalProbabilityG06 = normalizedG06;

            // Hitung nilai Bayes
            double bayesG01 = conditionalProbabilityG01 * G01;
            double bayesG02 = conditionalProbabilityG02 * G02;
            double bayesG03 = conditionalProbabilityG03 * G03;
            double bayesG04 = conditionalProbabilityG04 * G04;
            double bayesG05 = conditionalProbabilityG05 * G05;
            double bayesG06 = conditionalProbabilityG06 * G06;

            double bayess = bayesG01 + bayesG02 + bayesG03 + bayesG04 + bayesG05 + bayesG06;

            // Mencari nilai P
            double PH1 = G01 * bayesG01 / bayess;
            double PH2 = G02 * bayesG02 / bayess;
            double PH3 = G03 * bayesG03 / bayess;
            double PH4 = G04 * bayesG04 / bayess;
            double PH5 = G05 * bayesG05 / bayess;
            double PH6 = G06 * bayesG06 / bayess;

            // Jumlahkan nilai P
            double PH = PH1 + PH2 + PH3 + PH4 + PH5 + PH6;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker1);
            kerusakanDiagnosa.setText(kerusakan1);
        }

        //RULE KERUSAKAN 2
        else if (ChckC11.isChecked() && ChckC12.isChecked() && ChckC23.isChecked()) {
            double totalProbabilities = G011 + G012 + G023;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG011 = G011 / totalProbabilities;
            double normalizedG012 = G012 / totalProbabilities;
            double normalizedG023 = G023 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG011 = normalizedG011;
            double conditionalProbabilityG012 = normalizedG012;
            double conditionalProbabilityG023 = normalizedG023;

            // Hitung nilai Bayes
            double bayesG011 = conditionalProbabilityG011 * G011;
            double bayesG012 = conditionalProbabilityG012 * G012;
            double bayesG023 = conditionalProbabilityG023 * G023;
            double bayess = bayesG011 + bayesG012 + bayesG023;

            // Mencari nilai P
            double PH11 = G011 * bayesG011 / bayess;
            double PH12 = G012 * bayesG012 / bayess;
            double PH23 = G023 * bayesG023 / bayess;

            double PH = PH11 + PH12 + PH23;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker2);
            kerusakanDiagnosa.setText(kerusakan2);
        }
        else if (ChckC1.isChecked() && ChckC12.isChecked() && ChckC23.isChecked()) {
            double totalProbabilities = G011 + G012 + G023;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG011 = G011 / totalProbabilities;
            double normalizedG012 = G012 / totalProbabilities;
            double normalizedG023 = G023 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG011 = normalizedG011;
            double conditionalProbabilityG012 = normalizedG012;
            double conditionalProbabilityG023 = normalizedG023;

            // Hitung nilai Bayes
            double bayesG011 = conditionalProbabilityG011 * G011;
            double bayesG012 = conditionalProbabilityG012 * G012;
            double bayesG023 = conditionalProbabilityG023 * G023;
            double bayess = bayesG011 + bayesG012 + bayesG023;

            // Mencari nilai P
            double PH11 = G011 * bayesG011 / bayess;
            double PH12 = G012 * bayesG012 / bayess;
            double PH23 = G023 * bayesG023 / bayess;

            double PH = PH11 + PH12 + PH23;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker2);
            kerusakanDiagnosa.setText(kerusakan2);
        }

        //RULE KERUSAKAN 3
        else if (ChckC7.isChecked() && ChckC8.isChecked() && ChckC9.isChecked() && ChckC10.isChecked() && ChckC18.isChecked()) {

            // Jumlahkan nilai probabilitas
            double totalProbabilities = G07 + G08 + G09 + G010 + G018;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG07 = G07 / totalProbabilities;
            double normalizedG08 = G08 / totalProbabilities;
            double normalizedG09 = G09 / totalProbabilities;
            double normalizedG010 = G010 / totalProbabilities;
            double normalizedG018 = G018 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG07 = normalizedG07;
            double conditionalProbabilityG08 = normalizedG08;
            double conditionalProbabilityG09 = normalizedG09;
            double conditionalProbabilityG010 = normalizedG010;
            double conditionalProbabilityG018 = normalizedG018;

            // Hitung nilai Bayes
            double bayesG07 = conditionalProbabilityG07 * G07;
            double bayesG08 = conditionalProbabilityG08 * G08;
            double bayesG09 = conditionalProbabilityG09 * G09;
            double bayesG010 = conditionalProbabilityG010 * G010;
            double bayesG018 = conditionalProbabilityG018 * G018;
            double bayess = bayesG07 + bayesG08 + bayesG09 + bayesG010 + bayesG018;

            // Mencari nilai P
            double PH7 = G07 * bayesG07 / bayess;
            double PH8 = G08 * bayesG08 / bayess;
            double PH9 = G09 * bayesG09 / bayess;
            double PH10 = G010 * bayesG010 / bayess;
            double PH18 = G018 * bayesG018 / bayess;

            double PH = PH7 + PH8 + PH9 + PH10 + PH18;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker3);
            kerusakanDiagnosa.setText(kerusakan3);
        }

        //RULE KERUSAKAN 4
        else if (ChckC13.isChecked() && ChckC14.isChecked() && ChckC15.isChecked() && ChckC18.isChecked() && ChckC19.isChecked() && ChckC24.isChecked() && ChckC25.isChecked() && ChckC26.isChecked()) {

            // Jumlahkan nilai probabilitas
            double totalProbabilities = G013 + G014 + G015 + G018 + G019 + G024 + G025 + G026;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG013 = G013 / totalProbabilities;
            double normalizedG014 = G014 / totalProbabilities;
            double normalizedG015 = G015 / totalProbabilities;
            double normalizedG018 = G018 / totalProbabilities;
            double normalizedG019 = G019 / totalProbabilities;
            double normalizedG024 = G024 / totalProbabilities;
            double normalizedG025 = G025 / totalProbabilities;
            double normalizedG026 = G026 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG013 = normalizedG013;
            double conditionalProbabilityG014 = normalizedG014;
            double conditionalProbabilityG015 = normalizedG015;
            double conditionalProbabilityG018 = normalizedG018;
            double conditionalProbabilityG019 = normalizedG019;
            double conditionalProbabilityG024 = normalizedG024;
            double conditionalProbabilityG025 = normalizedG025;
            double conditionalProbabilityG026 = normalizedG026;

            // Hitung nilai Bayes
            double bayesG013 = conditionalProbabilityG013 * G013;
            double bayesG014 = conditionalProbabilityG014 * G014;
            double bayesG015 = conditionalProbabilityG015 * G015;
            double bayesG018 = conditionalProbabilityG018 * G018;
            double bayesG019 = conditionalProbabilityG019 * G019;
            double bayesG024 = conditionalProbabilityG024 * G024;
            double bayesG025 = conditionalProbabilityG025 * G025;
            double bayesG026 = conditionalProbabilityG026 * G026;
            double bayess = bayesG013 + bayesG014 + bayesG015 + bayesG018 + bayesG019 + bayesG024 + bayesG025 + bayesG026;

            // Mencari nilai P
            double PH13 = G013 * bayesG013 / bayess;
            double PH14 = G014 * bayesG014 / bayess;
            double PH15 = G015 * bayesG015 / bayess;
            double PH18 = G018 * bayesG018 / bayess;
            double PH19 = G019 * bayesG019 / bayess;
            double PH24 = G024 * bayesG024 / bayess;
            double PH25 = G025 * bayesG025 / bayess;
            double PH26 = G026 * bayesG026 / bayess;

            double PH = PH13 + PH14 + PH15 + PH18 + PH19 + PH24 + PH25 + PH26;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker4);
            kerusakanDiagnosa.setText(kerusakan4);
        }

        //RULE KERUSAKAN 5
        else if (ChckC12.isChecked() && ChckC16.isChecked() && ChckC17.isChecked()) {
            double totalProbabilities = G016 + G020 + G021;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG012 = G012 / totalProbabilities;
            double normalizedG016 = G016 / totalProbabilities;
            double normalizedG017 = G017 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG012 = normalizedG012;
            double conditionalProbabilityG016 = normalizedG016;
            double conditionalProbabilityG017 = normalizedG017;

            // Hitung nilai Bayes
            double bayesG012 = conditionalProbabilityG012 * G012;
            double bayesG016 = conditionalProbabilityG016 * G016;
            double bayesG017 = conditionalProbabilityG017 * G017;
            double bayess = bayesG012 + bayesG016 + bayesG017;

            // Mencari nilai P
            double PH12 = G012 * bayesG012 / bayess;
            double PH16 = G016 * bayesG016 / bayess;
            double PH17 = G017 * bayesG017 / bayess;

            double PH = PH12 + PH16 + PH17;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker5);
            kerusakanDiagnosa.setText(kerusakan5);
        }

        //RULE KERUSAKAN 6
        else if (ChckC20.isChecked() && ChckC21.isChecked() && ChckC22.isChecked()) {
            double totalProbabilities = G020 + G021 + G022;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG020 = G020 / totalProbabilities;
            double normalizedG021 = G021 / totalProbabilities;
            double normalizedG022 = G022 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG020 = normalizedG020;
            double conditionalProbabilityG021 = normalizedG021;
            double conditionalProbabilityG022 = normalizedG022;

            // Hitung nilai Bayes
            double bayesG020 = conditionalProbabilityG020 * G020;
            double bayesG021 = conditionalProbabilityG021 * G021;
            double bayesG022 = conditionalProbabilityG022 * G022;
            double bayess = bayesG020 + bayesG021 + bayesG022;

            // Mencari nilai P
            double PH20 = G020 * bayesG020 / bayess;
            double PH21 = G021 * bayesG021 / bayess;
            double PH22 = G022 * bayesG022 / bayess;

            double PH = PH20 + PH21 + PH22;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker6);
            kerusakanDiagnosa.setText(kerusakan6);
        }

        else{
            Toast.makeText(this, "Silahkan Isi Sesuai Aturan Diatas", Toast.LENGTH_SHORT).show();
            hslDiagnosa.setText("0%");
            ketDiagnosa.setText("Keterangan");
            kerusakanDiagnosa.setText("Keterangan");
        }

    }
}
