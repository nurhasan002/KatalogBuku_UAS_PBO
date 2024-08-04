package com.unsia.katalogbuku.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unsia.katalogbuku.DetailBukuActivity;
import com.unsia.katalogbuku.R;
import com.unsia.katalogbuku.models.Buku;

import java.util.List;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuViewHolder> {

    private List<Buku> daftarBuku;
    private Context context;

    public BukuAdapter(List<Buku> daftarBuku, Context context) {
        this.daftarBuku = daftarBuku;
        this.context = context;
    }

    @NonNull
    @Override
    public BukuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buku, parent, false);
        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BukuViewHolder holder, int position) {
        Buku buku = daftarBuku.get(position);
        holder.bind(buku);
    }

    @Override
    public int getItemCount() {
        return daftarBuku.size();
    }

    class BukuViewHolder extends RecyclerView.ViewHolder {
        private TextView judulTextView;
        private TextView penulisTextView;
        private TextView hargaTextView;

        public BukuViewHolder(@NonNull View itemView) {
            super(itemView);
            judulTextView = itemView.findViewById(R.id.judul_buku);
            penulisTextView = itemView.findViewById(R.id.penulis_buku);
            hargaTextView = itemView.findViewById(R.id.harga_buku);
        }

        public void bind(final Buku buku) {
            judulTextView.setText(buku.getJudulBuku());
            penulisTextView.setText(buku.getPenulisBuku());
            hargaTextView.setText("Rp " + buku.getHargaBuku());

            // Handle item click to navigate to DetailBukuActivity
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailBukuActivity.class);
                    intent.putExtra("judul", buku.getJudulBuku());
                    intent.putExtra("deskripsi", buku.getDeskripsiBuku());
                    intent.putExtra("penulis", buku.getPenulisBuku());
                    intent.putExtra("penerbit", buku.getPenerbitBuku());
                    intent.putExtra("tanggalTerbit", buku.tanggalTerbitBuku());
                    intent.putExtra("harga", buku.getHargaBuku());
                    context.startActivity(intent);
                }
            });
        }
    }
}
