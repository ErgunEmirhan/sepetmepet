package AlperenHoca.week6.day01.InterfaceOrnek01;

public class Calisan {

    private String isim;
    private String soyisim;
    private String unvan;
    private double maas;

    public Calisan(String isim, String soyisim,double maas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;

    }
    //innit blogu. constructor her calıstıgında calısır. Normaldde bunu constructora da yazabilirdik ama birden fazla constructor
    // kullandıgımız durumlarda tek sefer bu şekilde innit ile yazmak daha mantıklı.
    {
        calisanDB.calisanlar.add(this);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }


    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    // isim,soyisim,unvan,maas, maasAl(),izinAl(),fazlaMesaiYap()
    public void maasAl(){
        System.out.println("Maaş alındı.");
    }
    public void izinAl(){
        System.out.println("İzin alındı.");
    }
    public void fazlaMesaiYap(){
        System.out.println("Fazla mesai yapıldı.");
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + getIsim() + '\'' +
                ", soyisim='" + getSoyisim() + '\'' +
                ", unvan='" + getUnvan() + '\'' +
                ", maas=" + getMaas() +
                '}';
    }
}
