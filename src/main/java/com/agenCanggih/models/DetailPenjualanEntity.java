package com.agenCanggih.models;

import javax.persistence.*;

@Entity
@Table(name = "detail_penjualan_barang")
public class DetailPenjualanEntity extends DateAudit<Long> {

    @Column(name = "harga")
    private Integer harga;

    @Column(name = "banyak")
    private Integer banyak;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_barang", nullable = false)
    private BarangEntity barangEntity;

    public DetailPenjualanEntity() {
    }

    public DetailPenjualanEntity(Integer harga, Integer banyak, String status, BarangEntity barangEntity) {
        this.harga = harga;
        this.banyak = banyak;
        this.status = status;
        this.barangEntity = barangEntity;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BarangEntity getBarangEntity() {
        return this.barangEntity;
    }

    public void setBarangEntity(BarangEntity barangEntity) {
        this.barangEntity = barangEntity;
    }

}