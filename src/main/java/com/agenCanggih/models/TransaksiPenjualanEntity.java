package com.agenCanggih.models;

import javax.persistence.*;

@Entity
@Table(name = "transaksi_penjualan")
public class TransaksiPenjualanEntity extends DateAudit<Long> {

    @ManyToOne
    @JoinColumn(name = "id_pelanggan", nullable = false)
    private PelangganEntity pelangganEntity;

    @ManyToOne
    @JoinColumn(name = "id_detail_penjualan", nullable = false)
    private DetailPenjualanEntity detailPenjualanEntity;

    public TransaksiPenjualanEntity() {
    }

    public TransaksiPenjualanEntity(PelangganEntity pelangganEntity, DetailPenjualanEntity detailPenjualanEntity) {
        this.pelangganEntity = pelangganEntity;
        this.detailPenjualanEntity = detailPenjualanEntity;
    }

    public PelangganEntity getPelangganEntity() {
        return this.pelangganEntity;
    }

    public void setPelangganEntity(PelangganEntity pelangganEntity) {
        this.pelangganEntity = pelangganEntity;
    }

    public DetailPenjualanEntity getDetailPenjualanEntity() {
        return this.detailPenjualanEntity;
    }

    public void setDetailPenjualanEntity(DetailPenjualanEntity detailPenjualanEntity) {
        this.detailPenjualanEntity = detailPenjualanEntity;
    }

}