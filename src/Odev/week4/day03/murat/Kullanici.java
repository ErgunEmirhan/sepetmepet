package Odev.week4.day03.murat;

import java.time.LocalDate;

public class Kullanici {

    public static int kullaniciCount;
    private int id;
    private String ad;
    private String soyad;
    private String mail;
    private String telNo;
    private String sifre;
    private String kullaniciAdi;
    private String tcNo;
    private LocalDate kayitTarihi;
    private LocalDate dogumTarihi;

    public Kullanici(){
        kullaniciCount++;
        this.id=kullaniciCount;
        this.kayitTarihi= LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public LocalDate getKayitTarihi() {
        return kayitTarihi;
    }


    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + getId() +
                ", ad='" + getAd() + '\'' +
                ", soyad='" + getSoyad() + '\'' +
                ", mail='" + getMail() + '\'' +
                ", telNo='" + getTelNo() + '\'' +
                ", sifre='" + getSifre() + '\'' +
                ", kullaniciAdi='" + getKullaniciAdi() + '\'' +
                ", tcNo='" + getTcNo() + '\'' +
                ", kayitTarihi=" + getKayitTarihi() +
                ", dogumTarihi=" + getDogumTarihi() +
                '}';
    }
}
