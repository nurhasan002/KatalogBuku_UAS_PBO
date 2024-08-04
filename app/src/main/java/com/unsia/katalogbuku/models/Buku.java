package com.unsia.katalogbuku.models;

public class Buku {
    private String judulBuku;
    private String deskripsiBuku;
    private String penulisBuku;
    private String penerbitBuku;
    private String tanggalTerbitBuku;
    private Integer hargaBuku;

//    public Buku(String judul, String deskripsi, Integer harga) {
//        this.judulBuku = judul;
//        this.deskripsiBuku = deskripsi;
//        this.hargaBuku = harga;
//    }
    public Buku(String judul, String deskripsi, String penulis, String penerbit, String tanggalterbit, Integer harga) {
        this.judulBuku = judul;
        this.deskripsiBuku = deskripsi;
        this.penulisBuku = penulis;
        this.penerbitBuku = penerbit;
        this.tanggalTerbitBuku = tanggalterbit;
        this.hargaBuku = harga;
    }
    public String getJudulBuku() {
        return judulBuku;
    }
    public String getDeskripsiBuku() {
        return deskripsiBuku;
    }
    public String getPenulisBuku() {
        return penulisBuku;
    }
    public String getPenerbitBuku() {
        return penerbitBuku;
    }
    public String tanggalTerbitBuku() {
        return tanggalTerbitBuku;
    }
    public Integer getHargaBuku() {
        return hargaBuku;
    }

}
