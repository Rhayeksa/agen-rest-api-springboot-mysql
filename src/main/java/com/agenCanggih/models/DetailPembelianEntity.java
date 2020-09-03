package com.agenCanggih.models;

import javax.persistence.*;

@Entity
@Table(name = "detail_pembelian_barang")
public class DetailPembelianEntity extends DateAudit<Long> {

    @Column(name = "kode_barang")
    private String kodeBarang;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "harga", nullable = false)
    private Integer harga;

    @Column(name = "banyak", nullable = false)
    private Integer banyak;

    @Column(name = "total_harga", nullable = false)
    private Integer totalHarga;

    public DetailPembelianEntity() {
    }

    public DetailPembelianEntity(String kodeBarang, String nama, Integer harga, Integer banyak, Integer totalHarga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.harga = harga;
        this.banyak = banyak;
        this.totalHarga = totalHarga;
    }

    public String getKodeBarang() {
        return this.kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHarga() {
        return this.harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getBanyak() {
        return this.banyak;
    }

    public void setBanyak(Integer banyak) {
        this.banyak = banyak;
    }

    public Integer getTotalHarga() {
        return this.totalHarga;
    }

    public void setTotalHarga(Integer totalHarga) {
        this.totalHarga = totalHarga;
    }

}