package com.unsia.katalogbuku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.unsia.katalogbuku.cores.BaseActivity;

public class DetailBukuActivity extends BaseActivity {

    private TextView judulTextView;
    private TextView deskripsiTextView;
    private TextView penulisTextView;
    private TextView penerbitTextView;
    private TextView tanggalTerbitTextView;
    private TextView hargaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);
        loadLayout();
    }

    @Override
    protected void loadLayout() {
        judulTextView = findViewById(R.id.detail_judul);
        deskripsiTextView = findViewById(R.id.detail_deskripsi);
        penulisTextView = findViewById(R.id.detail_penulis);
        penerbitTextView = findViewById(R.id.detail_penerbit);
        tanggalTerbitTextView = findViewById(R.id.detail_tanggal_terbit);
        hargaTextView = findViewById(R.id.detail_harga);

        // Get data from intent
        Intent intent = getIntent();
        String judul = intent.getStringExtra("judul");
        String deskripsi = intent.getStringExtra("deskripsi");
        String penulis = intent.getStringExtra("penulis");
        String penerbit = intent.getStringExtra("penerbit");
        String tanggalTerbit = intent.getStringExtra("tanggalTerbit");
        int harga = intent.getIntExtra("harga", -1);

        // Set data to views
        judulTextView.setText(judul);
        deskripsiTextView.setText(deskripsi);
        penulisTextView.setText(penulis);
        penerbitTextView.setText(penerbit);
        tanggalTerbitTextView.setText(tanggalTerbit);
        if (harga != -1) {
            hargaTextView.setText("Rp " + harga);
        }
    }
}