package AlperenHoca.week6.day01.InterfaceOrnek01;

public class Muhendis extends Calisan implements SahaCalismasiYapabilir,MaasaGoreUnvanAlabilir{


    public Muhendis(String isim, String soyisim, double maas) {
        super(isim, soyisim, maas);
        if(maas>=50000){
            super.setUnvan("Uzman Mühendis");
        }else if(maas>=40000){
            super.setUnvan("Kıdemli Mühendis");
        }else if(maas>=30000){
            super.setUnvan("Mühendis");
        }else{
            super.setUnvan("Stajyer Mühendis");
        }

    }




    @Override
    public void sahaCalismasiYap() {
        System.out.println("Mühendis saha çalışması yürütüyor.");
    }
}
