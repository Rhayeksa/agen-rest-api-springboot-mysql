package com.agenCanggih.models;

import javax.persistence.*;

@Entity
@Table(name = "transaksi_pembelian")
public class TransaksiPembelianEntity extends DateAudit<Long> {

    @ManyToOne
    @JoinColumn(name = "id_pemasok", nullable = false)
    private PemasokEntity pemasokEntity;

    @ManyToOne
    @JoinColumn(name = "id_detail_pembelian", nullable = false)
    private DetailPembelianEntity detailPembelianEntity;

    public TransaksiPembelianEntity() {
    }

    public TransaksiPembelianEntity(PemasokEntity pemasokEntity, DetailPembelianEntity detailPembelianEntity) {
        this.pemasokEntity = pemasokEntity;
        this.detailPembelianEntity = detailPembelianEntity;
    }

    public PemasokEntity getPemasokEntity() {
        return this.pemasokEntity;
    }

    public void setPemasokEntity(PemasokEntity pemasokEntity) {
        this.pemasokEntity = pemasokEntity;
    }

    public DetailPembelianEntity getDetailPembelianEntity() {
        return this.detailPembelianEntity;
    }

    public void setDetailPembelianEntity(DetailPembelianEntity detailPembelianEntity) {
        this.detailPembelianEntity = detailPembelianEntity;
    }

}