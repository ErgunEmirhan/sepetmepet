package AlperenHoca.GrupProjeUygulama01.Repositories.entities;

public class Urun {
    private static Integer idCount = 0;
    private Integer id;
    private String urunAd;
    private Double fiyat;


    public Urun(String urunAd, Double fiyat) {
        this.urunAd = urunAd;
        this.fiyat = fiyat;
        this.id = ++idCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }


    @Override
    public String toString() {
        return "Urun{" +
                "id=" + getId() +
                ", urunAd='" + getUrunAd() + '\'' +
                ", fiyat=" + getFiyat() +
                '}';
    }
}
