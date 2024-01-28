package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

public class Kerusakan extends AppCompatActivity {

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerusakan);
        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kerusakan.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button btnShowPopup = findViewById(R.id.button1);
        btnShowPopup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopup();
            }
        });
        Button btnShowPopup2 = findViewById(R.id.button2);
        btnShowPopup2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopup2();
            }
        });
        Button btnShowPopup3 = findViewById(R.id.button3);
        btnShowPopup3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopup3();
            }
        });
        Button btnShowPopup4 = findViewById(R.id.button4);
        btnShowPopup4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)  {
                showPopup4();
            }
        });
        Button btnShowPopup5 = findViewById(R.id.button5);
        btnShowPopup5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopup5();
            }
        });
        Button btnShowPopup6 = findViewById(R.id.button6);
        btnShowPopup6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopup6();
            }
        });
    }
    private void showPopup() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //Daftar Item untuk ditampilkan
        String[] items = {"Kerusakan pada layar LCD HP dapat disebabkan oleh berbagai faktor, seperti terjatuh atau terkena benturan keras yang menyebabkan retak atau garis-garis pada layar, tekanan berlebih saat membersihkan layar atau tumpahan cairan yang merusak layar secara fisik, masalah internal seperti gangguan koneksi kabel fleksibel atau kerusakan pada komponen internal, penurunan kualitas seiring umur pakai yang intensif, serta paparan suhu panas yang berlebihan. Dalam banyak kasus, diperlukan penggantian layar atau perbaikan oleh teknisi yang berpengalaman untuk mengatasi kerusakan layar LCD tersebut."};

        // Atur daftar item pada AlertDialog
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Aksi yang diambil ketika item daftar diklik
                String selectedItem = items[which];
                // Lakukan sesuatu dengan item yang dipilih
            }
        });
        // Untuk menutup pop-up ketika tombol batal diklik
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        // Tampilkan pop-up
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Daftar item untuk ditampilkan
        String[] items = {"Kerusakan pada konektor pengisian HP dapat disebabkan oleh beberapa faktor. Salah satunya adalah pemakaian yang kasar atau sering menyambung dan memutus pengisian secara tiba-tiba, yang dapat mengakibatkan ausnya konektor. Selain itu, debu, kotoran, atau korosi di dalam lubang pengisian juga dapat mengganggu kontak yang tepat antara kabel pengisian dan konektor, menyebabkan pengisian yang tidak efisien atau terganggu. Penggunaan charger yang tidak sesuai, kelebihan tegangan listrik saat pengisian, atau komponen dalam charger yang rusak juga bisa menjadi penyebab kerusakan pada konektor pengisian HP."};

        // Atur daftar item pada AlertDialog
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Aksi yang diambil ketika item daftar diklik
                String selectedItem = items[which];
                // Lakukan sesuatu dengan item yang dipilih
            }
        });

        // Untuk menutup pop-up ketika tombol batal diklik
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        // Tampilkan pop-up
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showPopup3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Daftar item untuk ditampilkan
        String[] items = {"\n" +
                "Kerusakan pada baterai HP dapat disebabkan oleh beberapa faktor. Salah satunya adalah siklus pengisian dan pengosongan baterai yang berlebihan atau penggunaan yang terlalu lama, yang dapat mengurangi kapasitas baterai seiring waktu."};

        // Atur daftar item pada AlertDialog
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Aksi yang diambil ketika item daftar diklik
                String selectedItem = items[which];
                // Lakukan sesuatu dengan item yang dipilih
            }
        });


        // Untuk menutup pop-up ketika tombol batal diklik
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        // Tampilkan pop-up
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showPopup4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Daftar item untuk ditampilkan
        String[] items = {"Kerusakan pada Main PCB (Printed Circuit Board) HP bisa disebabkan oleh berbagai faktor. Salah satunya adalah kerusakan fisik, seperti terjatuh atau terkena benturan keras, yang dapat merusak sirkuit atau komponen di dalamnya. Masalah pada daya listrik yang tidak stabil atau berlebihan, baik dari charger yang salah atau kualitas daya yang buruk, juga dapat merusak Main PCB. Paparan kelembapan atau cairan juga bisa menjadi penyebab, karena dapat mengganggu koneksi atau menyebabkan korosi pada komponen sirkuit."};

        // Atur daftar item pada AlertDialog
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Aksi yang diambil ketika item daftar diklik
                String selectedItem = items[which];
                // Lakukan sesuatu dengan item yang dipilih
            }
        });


        // Untuk menutup pop-up ketika tombol batal diklik
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();  }
        });
        // Tampilkan pop-up
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showPopup5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Daftar item untuk ditampilkan
        String[] items = {"Kerusakan pada kabel fleksibel HP bisa disebabkan oleh berbagai faktor. Penggunaan yang berlebihan atau terlalu sering melipat kabel fleksibel dapat menyebabkan keausan atau patahnya kawat di dalamnya."};

        // Atur daftar item pada AlertDialog
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Aksi yang diambil ketika item daftar diklik
                String selectedItem = items[which];
                // Lakukan sesuatu dengan item yang dipilih
            }
        });


        // Untuk menutup pop-up ketika tombol batal diklik
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        // Tampilkan pop-up
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showPopup6() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Daftar item untuk ditampilkan
        String[] items = {"Kerusakan pada kamera HP bisa disebabkan oleh sejumlah faktor. Salah satunya adalah kerusakan fisik akibat jatuh atau terkena benturan, yang dapat merusak lensa atau komponen mekanis dalam kamera."};

        // Atur daftar item pada AlertDialog
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Aksi yang diambil ketika item daftar diklik
                String selectedItem = items[which];
                // Lakukan sesuatu dengan item yang dipilih
            }
        });

        // Untuk menutup pop-up ketika tombol batal diklik
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        // Tampilkan pop-up
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}