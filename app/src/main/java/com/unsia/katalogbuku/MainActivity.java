package com.unsia.katalogbuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unsia.katalogbuku.adapters.BukuAdapter;
import com.unsia.katalogbuku.cores.BaseActivity;
import com.unsia.katalogbuku.models.Buku;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private BukuAdapter bukuAdapter;
    private List<Buku> daftarBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        daftarBuku = new ArrayList<>();
        daftarBuku.add(new Buku("Filosofi Hati", "Filosofi Hati merupakan karya seorang sastrawan Universitas Siber Asia", "NurHasan", "UNSIAMEDIA", "04-08-2024", 100000));
        daftarBuku.add(new Buku("Mobile Programming Modern", "Buku Pegangan UNSIA 2024", "NurHasan", "UNSIAMEDIA", "04-08-2024", 150000));
        // Tambahkan buku lainnya sesuai kebutuhan

        bukuAdapter = new BukuAdapter(daftarBuku, this);
        recyclerView.setAdapter(bukuAdapter);
    }

    @Override
    protected void loadLayout() {

    }
}
