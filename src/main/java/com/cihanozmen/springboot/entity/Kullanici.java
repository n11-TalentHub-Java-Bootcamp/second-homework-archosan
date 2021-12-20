package com.cihanozmen.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFilter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "KULLANICI")
@JsonFilter("KullaniciFilter")
public class Kullanici implements Serializable {

    @SequenceGenerator(name = "generator",sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID",nullable = false)
    private Long id;

    @Column(length = 50, name = "ADI")
    private String adi;

    @Column(length = 50,name = "SOYADI")
    private String soyadi;

    @Column(length = 50, name = "EMAIL")
    private String email;

    @Column(length = 15, name = "TELEFON")
    private String telefon;

    @Column(length = 20, name = "KULLANICIADI")
    private String kullaniciAdi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                '}';
    }
}
