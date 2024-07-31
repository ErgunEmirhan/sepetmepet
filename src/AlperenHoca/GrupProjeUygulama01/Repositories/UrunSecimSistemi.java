package AlperenHoca.GrupProjeUygulama01.Repositories;

import AlperenHoca.GrupProjeUygulama01.Repositories.entities.*;

import java.util.*;

public class UrunSecimSistemi {
    static Scanner sc = new Scanner(System.in);
    static DatabaseManager<Kiyafet> db = new DatabaseManager();


    public static void main(String[] args) {

       demoVeriOlustur();
       welcomeMenu();



    }

    public static void demoVeriOlustur(){
        ArrayList<Kiyafet> kiyafetList = db.urunList;
        for(int i =0;i<5;i++){
            Random random = new Random();
            ERenk[] renkArr = ERenk.values();
            ESize[] sizeArr = ESize.values();
            EGender[] genderArr = EGender.values();
            ETur[] turArr = ETur.values();

            Kiyafet kiyafet = new Kiyafet("kiyafet", random.nextDouble(400,1000));
            kiyafet.setRenk(renkArr[random.nextInt(3)]);
            kiyafet.setSize(sizeArr[random.nextInt(3)]);
            kiyafet.setGender(genderArr[random.nextInt(3)]);
            kiyafet.setTur(turArr[random.nextInt(4)]);
            kiyafet.setAdet(random.nextInt(1,21));
            db.save(kiyafet);

        }
        System.out.println(kiyafetList);

    }






    public static void welcomeMenu() {
        Sepet sepet = new Sepet();
        while (true) {
            System.out.println("1- Ürün listele");
            System.out.println("2- Sepete ürün ekle");
            System.out.println("3- Sepeti görüntüle");
            System.out.println("0- Çıkış yap");


        System.out.print("Seciminiz: ");
        int secim = sc.nextInt();
        sc.nextLine();

            switch (secim) {
                case 0:
                    System.out.println("Çıkış yapıyorsunuz.");
                    sc.close();
                    return;
                case 1:{
                   db.getAll();

                }
                case 2:{
                    urunSec(sepet);

                    break;
                }
                case 3:{

                }

            }
        }
    }


    public static void sepetGoruntule(Sepet sepet){

    }
    // burdan id alıp urunSecenekleri metoduna gidiyoruz.
    public static void urunSec(Sepet sepet){
        while(true) {
            System.out.println("Almak istediğiniz ürün için id giriniz: ");
            int secim = sc.nextInt();
            Urun urun = db.findByID(secim);
            if (urun == null) {
                System.out.println("Girdiğiniz id'de kayıtlı ürün bulunmamaktadır.");
                return;
            }
            urunSecenekleri(urun, sepet);
            return;
        }
    }

    public static void urunSecenekleri(Urun urun,Sepet sepet){
        System.out.println("1 - Sepete ekle");
        System.out.println("2 - Ürün detaylarını göster");
        System.out.println("0 - Ana menüye geri dön");
        System.out.print("Seciminiz: ");
        int secim = sc.nextInt();
        switch (secim){
            case 0 :
                System.out.println("Ana menüye dönüyorsunuz.");
                break;
            case 1:sepeteEkle(urun,sepet);
            break;

        }


    }

    public static void sepeteEkle(Urun urun,Sepet sepet){
        System.out.println("Bu üründen "+urun.getAdet()+" adet bulunmaktadir.");
        System.out.println("Kaç adet almak istersiniz? ");
        int adet = sc.nextInt();
        if(adetCheck(urun,adet)) {
            Urun sepetUrun = new Urun(urun, adet);
            sepet.setToplamFiyat(sepet.getToplamFiyat() + urun.getFiyat() * adet);
            sepet.getUrunArrayList().add(urun);
            urun.setAdet(urun.getAdet() - adet);
            sepet.getUrunArrayList().add(sepetUrun);
            System.out.println("Ürün sepete eklenmiştir.");

        }
        else{
            System.out.println("Bu üründen yeterli sayida stoğumuz bulunmamaktadir.");
        }

    }
    public static boolean adetCheck(Urun urun,int adet){

        return urun.getAdet()>=adet;
    }
}
