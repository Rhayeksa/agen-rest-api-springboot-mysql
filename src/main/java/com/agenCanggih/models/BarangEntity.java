package com.agenCanggih.models;

import javax.persistence.*;

@Entity
@Table(name = "barang")
public class BarangEntity extends DateAudit<Long> {

    @Column(name = "harga", nullable = false)
    private Integer harga;

    @Column(name = "stok", nullable = false)
    private Integer stok;

    @ManyToOne
    @JoinColumn(name = "id_detail_pembelian", nullable = false)
    private DetailPembelianEntity detailPembelianEntity;

    public BarangEntity() {
    }

    public BarangEntity(Integer harga, Integer stok, DetailPembelianEntity detailPembelianEntity) {
        this.harga = harga;
        this.stok = stok;
        this.detailPembelianEntity = detailPembelianEntity;
    }

    public Integer getHarga() {
        return this.harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return this.stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public DetailPembelianEntity getDetailPembelianEntity() {
        return this.detailPembelianEntity;
    }

    public void setDetailPembelianEntity(DetailPembelianEntity detailPembelianEntity) {
        this.detailPembelianEntity = detailPembelianEntity;
    }

}