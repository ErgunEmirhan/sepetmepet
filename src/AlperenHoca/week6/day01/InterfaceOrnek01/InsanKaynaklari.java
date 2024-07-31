package AlperenHoca.week6.day01.InterfaceOrnek01;

import java.util.ArrayList;

public class InsanKaynaklari extends Calisan implements NonSpesificInterface{




    public InsanKaynaklari(String isim, String soyisim, double maas) {
        super(isim, soyisim, maas);
        super.setUnvan("IK");

    }

    public void zamYap(Calisan calisan, double zamOrani) {
        calisan.setMaas(calisan.getMaas() * (1 + zamOrani));
        if (calisan.getClass()== Muhendis.class) {
                calisan.setMaas(calisan.getMaas() + 1000);
            }
        if(calisan.getClass()==Tekniker.class){
            calisan.setMaas(calisan.getMaas()+500);
        }
            System.out.println(calisan.getIsim() + " " + calisan.getSoyisim() + " yeni maaşı = " + calisan.getMaas());
        }


    public void unvanBelirle() {
        System.out.println("Unvan belirlendi.");
    }

}
