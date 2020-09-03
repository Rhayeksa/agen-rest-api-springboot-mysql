package com.agenCanggih.models;

import javax.persistence.*;

@Entity
@Table(name = "pelanggan")
public class PelangganEntity extends DateAudit<Long> {

    @Column(name = "nama")
    private String nama;

    @Column(name = "hp")
    private String hp;

    @Column(name = "email")
    private String email;

    @Column(name = "alamat")
    private String alamat;

    public PelangganEntity() {
    }

    public PelangganEntity(String nama, String hp, String email, String alamat) {
        this.nama = nama;
        this.hp = hp;
        this.email = email;
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return this.hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}