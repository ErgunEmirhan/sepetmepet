package AlperenHoca.week6.day01.InterfaceOrnek01;

public class OfisCalisani extends Calisan implements MaasaGoreUnvanAlabilir{


    public OfisCalisani(String isim, String soyisim, double maas) {
        super(isim, soyisim, maas);
        if(maas>=30000){
            super.setUnvan("Kıdemli Çalışan");
        }else if(maas>=20000){
            super.setUnvan("Çalışan");
        }else {
            super.setUnvan("Stajyer Çalışan");
        }

    }

}
