package AlperenHoca.GrupProjeUygulama01.Repositories.entities;

public class Kiyafet extends Urun{

    private KiyafetTur tur;
    private String renk;
    private String size;
    private String gender;


    public Kiyafet(String urunAd, Double fiyat) {
        super(urunAd, fiyat);
    }


    public KiyafetTur getTur() {
        return tur;
    }

    public void setTur(KiyafetTur tur) {
        this.tur = tur;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Kiyafet{" +
                "tur=" + getTur() +
                ", renk='" + getRenk() + '\'' +
                ", size='" + getSize() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", id=" + getId() +
                ", urunAd='" + getUrunAd() + '\'' +
                ", fiyat=" + getFiyat() +
                '}';
    }
}
