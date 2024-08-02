package AlperenHoca.week4.kullanici_kayit_sistemi;
import AlperenHoca.GrupProjeUygulama01.Repositories.DatabaseManager;
import AlperenHoca.GrupProjeUygulama01.Repositories.entities.Sepet;
import AlperenHoca.GrupProjeUygulama01.Repositories.entities.Urun;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    private static int kullaniciCount = 0;
    private int id;
    private String isim;
    private String soyisim;
    private String email;
    private String telNo;
    private String sifre;
    private String kullaniciAdi;
    private String tcKimlik;
    private LocalDate kayitTarihi;
    private LocalDate dogumTarihi;
    private Sepet guncelSepet;
    private ArrayList<Sepet> satinAlimGecmisi;
    private ArrayList<Urun> favoriList;
    private Integer bakiye = 0;
    
    public Integer getBakiye() {
        return bakiye;
    }
    
    public void setBakiye(Integer bakiye) {
        this.bakiye = bakiye;
    }
    
    public ArrayList<Urun> getFavoriList() {
        return favoriList;
    }
    
    public ArrayList<Sepet> getSatinAlimGecmisi() {
        return satinAlimGecmisi;
    }
    
    public Sepet getGuncelSepet() {
        return guncelSepet;
    }
    
    public void setGuncelSepet(Sepet guncelSepet) {
        this.guncelSepet = guncelSepet;
    }
    
    public void setSatinAlimGecmisi(ArrayList<Sepet> satinAlimGecmisi) {
        this.satinAlimGecmisi = satinAlimGecmisi;
    }
    
    public Kullanici(){
        this.kullaniciCount++;
        this.id = kullaniciCount;
        this.kayitTarihi = LocalDate.now();
        this.satinAlimGecmisi = new ArrayList<Sepet>();
        this.guncelSepet = new Sepet();
        this.favoriList = new ArrayList<>();
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public static int getKullaniciCount() {
        return kullaniciCount;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNo() {
        return telNo;
    }

    public String getSifre() {
        return sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public LocalDate getKayitTarihi() {
        return kayitTarihi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", email='" + email + '\'' +
                ", telNo='" + telNo + '\'' +
                ", sifre='" + sifre + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                ", kayitTarihi=" + kayitTarihi +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}