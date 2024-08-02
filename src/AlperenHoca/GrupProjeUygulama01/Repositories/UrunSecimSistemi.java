package AlperenHoca.GrupProjeUygulama01.Repositories;

import AlperenHoca.GrupProjeUygulama01.Repositories.entities.*;
import AlperenHoca.week4.kullanici_kayit_sistemi.Kullanici;
import AlperenHoca.week4.kullanici_kayit_sistemi.KullaniciKayitSistemi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class UrunSecimSistemi {
    static Scanner sc = new Scanner(System.in);
    static DatabaseManager<Kiyafet> db = new DatabaseManager();


    public static void main(String[] args) {
    
    }

    public static void demoVeriOlustur(){
        ArrayList<Kiyafet> kiyafetList = db.urunList;
        String[] adlar = {"tisort", "pantolon", "ayakkabi"};
        DecimalFormat df = new DecimalFormat("#,##");
        for (int j = 0; j < adlar.length; j++) {
            for (int i = 0; i < 5; i++) {
                Random random = new Random();
                ERenk[] renkArr = ERenk.values();
                ESize[] sizeArr = ESize.values();
                EGender[] genderArr = EGender.values();
                ETur[] turArr = ETur.values();
                
                
                Kiyafet kiyafet = new Kiyafet(adlar[j], // çalışıyorsa dokunma
                                              random.nextInt(400, 1000) + Double.parseDouble(df.format(random.nextDouble(100,1000))));
                kiyafet.setRenk(renkArr[random.nextInt(ERenk.values().length)]);
                kiyafet.setSize(sizeArr[random.nextInt(ESize.values().length)]);
                kiyafet.setGender(genderArr[random.nextInt(EGender.values().length)]);
                kiyafet.setTur(turArr[random.nextInt(ETur.values().length)]);
                Integer adet = random.nextInt(1, 21);
                kiyafet.setAdet(adet);
                kiyafet.setSepetLimiti((int)Math.ceil(adet*3/4.));
                db.save(kiyafet);
            }
        }
        System.out.println(kiyafetList);

    }
    
    
    
    public static void welcomeMenu(Kullanici kullanici) {
        Sepet sepet;
        if (kullanici == null) sepet = new Sepet();
        else sepet = kullanici.getGuncelSepet();
        System.out.println("!!!MODA PATIKASI'NA HOS GELDINIZ!!!");
        while (true) {
            System.out.println("""
                                       1- Urun listele
                                       2- Urun incele
                                       3- Sepeti görüntüle
                                       4- Alisverisi tamamla
                                       5- Sepetimden urun cikar.
                                       6- Sepetten urun azalt.
                                       7- Sepeti bosalt.
                                       8- Siparis gecmisimi goruntule
                                       0- Cikis yap
                                       """);
                               
                               
                               
                               
                               
                               
                               System.out.print("Seciminiz: ");
            int secim = secimYap();
            
            

            switch (secim) {
                case 0:
                    System.out.println("Çıkış yapıyorsunuz.");
                    return;
                case 1:{
                   db.getAll();
                   break;
                }
                case 2:{
                    urunSec(sepet, kullanici);
                    break;
                }
                case 3:{
                    sepetiGoruntule(sepet);
                    break;
                }
                case 4: {
                    kullanici = alisverisiTamamla(kullanici, sepet);
                    if (kullanici != null) sepet = kullanici.getGuncelSepet();
                    break;
                }
                case 5: {
                    sepetiGoruntule(sepet);
                    sepettenUrunCikar(sepet);
                    break;
                }
                case 6:{
                    sepetiGoruntule(sepet);
                    sepettenUrunAzalt(sepet);
                    break;
                }
                case 7: {
                    sepetiBosalt(sepet);
                    break;
                }
                case 8:{
                    if (kullanici == null) {
                        System.out.println("Bir hesaba giris yapmadiginiz icin siparis gecmisinizi goruntulemiyoruz.." +
                                                   ".");
                        break;
                    }
                    KullaniciKayitSistemi.siparisGecmisimiGoruntule(kullanici);
                    break;
                }
                case 9:
                    if (kullanici != null) KullaniciKayitSistemi.bakiyeOlustur(kullanici);
                    else System.out.println("ilk once giris yapmalisiniz");
                    break;
            }
        }
    }
    
    private static void sepetiBosalt(Sepet sepet) {
        sepet.getUrunArrayList().removeAll(sepet.getUrunArrayList());
    }
    
    private static void sepettenUrunAzalt(Sepet sepet) {
        System.out.print("Adetini azaltmak istediginiz urunun id'sini giriniz: ");
        int urunId = secimYap();
        Urun azaltUrun = findById(sepet, urunId);
        System.out.println("Bu urunden " + azaltUrun.getAdet() + " adet bulunmaktadır.  Kac adet cikarmak isterisniz?");
        int cikarAdet = secimYap();
        sepet.setToplamFiyat(sepet.getToplamFiyat() - azaltUrun.getFiyat()*Math.min(cikarAdet, azaltUrun.getAdet()));
        int istenenMiktar = azaltUrun.getAdet()-cikarAdet;
        azaltUrun.setAdet(Math.max(0, istenenMiktar));
        System.out.println("Artik sepetinizde " + azaltUrun.getUrunAd() + " urununden " + azaltUrun.getAdet() + " " +
                                   "adet bulunmaktadır.");
        
    }
    
    private static void sepettenUrunCikar(Sepet sepet) {
        System.out.print("Sepetten kaldirmak istediginiz urunun id'sini giriniz: ");
        int urunId = secimYap();
        Urun cikarilacakUrun = findById(sepet, urunId);
        if (cikarilacakUrun != null){
            sepet.getUrunArrayList().remove(cikarilacakUrun);
            System.out.println(cikarilacakUrun.getUrunAd() + " urunu basariyla cikarilmistir.");
            sepet.setToplamFiyat(sepet.getToplamFiyat()-cikarilacakUrun.getFiyat()*cikarilacakUrun.getAdet());
        }
        else System.out.println("Cikarmak istediginiz urun zaten sepetinizde bulunmamaktadır.");
    }
    
    private static Urun findById(Sepet sepet, int urunId){
        for (Urun urun:sepet.getUrunArrayList()){
            if(urun.getId() == urunId) return urun;
        }
        return null;
    }
    
    private static Kullanici alisverisiTamamla(Kullanici kullanici, Sepet sepet) {
        while (kullanici == null){
            System.out.println("""
                                  Alisverisi tamamlamak icin hesabiniza giris yapmaniz gerekiyor. ,
                                  1. Giris Yap
                                  2. Hesap Olustur
                                  0. Geri don
                                  """);
            int secim = secimYap();
            switch (secim){
                case 1:
                    kullanici = girisYapSatinAlim();
                    if (kullanici != null && !kullanici.getGuncelSepet().getUrunArrayList().isEmpty()){
                        System.out.println("Eski sepetinizdekileri satın almak ister misiniz?\n1. Ekle\n2. Hayır");
                        secim = secimYap();
                        switch (secim){
                            case 1:
                                kullanici.getGuncelSepet().getUrunArrayList().addAll(sepet.getUrunArrayList());
                                sepet = kullanici.getGuncelSepet();
                                break;
                            case 2:
                                break;
                        }
                    }
                    break;
                case 2:
                    kullanici = KullaniciKayitSistemi.kullaniciKaydi();
                    break;
                case 0:
                    System.out.println("Magaza sayfasina yonlendiriliyorsunuz...");
                    return null;
            }
        }
        sepetiGoruntule(sepet);
        System.out.println("ALISVERISI ONAYLIYOR MUSUNUZ???");
        int secim = secimYap();
        if (secim == 0) {
            System.out.println("Alisveris iptal, ana menuye donuluyor...");
            return kullanici;
        }
        if (sepet.getToplamFiyat() <= kullanici.getBakiye()) {
            kullanici.getSatinAlimGecmisi().add(sepet);
            for (Urun urun : sepet.getUrunArrayList()) {
                Urun siradakiUrun = db.findByID(urun.getId());
                siradakiUrun.setAdet(siradakiUrun.getAdet() - urun.getAdet());
            }
            System.out.println("Alisverisiniz gerceklesmistir, kargo bilgileri icin bilgilendirme maili alacaksiniz.  " + "Bizi sectiginiz icin tesekkur ederiz!");
            kullanici.setGuncelSepet(new Sepet());
            return kullanici;
        }
        else {
            System.out.println("Yeterli bakiyeniz bulunammaktadir");
            return kullanici;
        }
    }
    
    private static Kullanici girisYapSatinAlim() {
        Kullanici kullanici = null;
        for (int i = 0; i < 3; i++) {
            
            kullanici = KullaniciKayitSistemi.girisYap();
            if (kullanici != null) return kullanici;
        }
        return kullanici;
    }
    
    public static void sepetiGoruntule(Sepet sepet) {
        if (sepet.getUrunArrayList().isEmpty()){
            System.out.println("Sepetiniz bos");
            return;
        }
        System.out.println(sepet.getUuid());
        for (Urun urun: sepet.getUrunArrayList()) {
            System.out.printf("id:%-1d %-12s %2d ad. x %8.1f TL = %9.1f TL%n", urun.getId(), urun.getUrunAd(),
                              urun.getAdet(), urun.getFiyat(), urun.getAdet() * urun.getFiyat());
        }
        System.out.printf("%40s %9.1f TL%n", "Toplam fiyat =", sepet.getToplamFiyat());
        
    }
    
    // burdan id alıp urunSecenekleri metoduna gidiyoruz.
    public static void urunSec(Sepet sepet, Kullanici kullanici){
        while(true) {
            System.out.println("Almak istediğiniz ürün için id giriniz: ");
            int secim = secimYap();
            Urun urun = db.findByID(secim);
            if (urun == null) {
                System.out.println("Girdiğiniz id'de kayıtlı ürün bulunmamaktadır.");
                return;
            }
            urunSecenekleri(urun, sepet, kullanici);
            return;
        }
    }

    public static void urunSecenekleri(Urun urun,Sepet sepet, Kullanici kullanici){
        System.out.println(urun);
        System.out.println("1 - Sepete ekle");
        System.out.println("2 - Ürün detaylarını göster");
        System.out.println("3-  Favorilerime ekle");
        System.out.println("0 - Ana menüye geri dön");
        System.out.print("Seciminiz: ");
        while (true){
            int secim = secimYap();
            switch (secim) {
                case 0:
                    System.out.println("Ana menüye dönüyorsunuz.");
                    return;
                case 1:
                    sepeteEkle(urun, sepet);
                    return;
                case 2:
                    urunDetayGoruntule(urun, sepet);
                    return;
                case 3:
                    favorilerimeEkle(urun, kullanici);
                default:
                    System.out.println("Gecersiz girdi");
            }
        }


    }
    
    private static void favorilerimeEkle(Urun urun, Kullanici kullanici) {
        ArrayList<Urun> favList= kullanici.getFavoriList();
        if (!favList.contains(urun)) {
            favList.add(urun);
            System.out.println("basariyla favorilere eklendi");
        }
        else System.out.println("urun zaten favorilerde");
    }
    
    
    private static void urunDetayGoruntule(Urun urun, Sepet sepet) {
        System.out.println(urun.detayliGoruntule());
        while (true){
            System.out.println("1 - Sepete ekle");
            System.out.println("0 - Ana menüye geri dön");
            System.out.print("Seciminiz: ");
            int secim = secimYap();
            switch (secim) {
                case 0:
                    System.out.println("Ana menüye dönüyorsunuz.");
                    return;
                case 1:
                    sepeteEkle(urun, sepet);
                    return;
                default:
                    System.out.println("Gecersiz girdi");
            }
        }
    }
    
    public static void sepeteEkle(Urun urun,Sepet sepet){
        while (true) {
            if (urun.getAdet() == 0) {
                System.out.println("Urun stokta bulunmamaktadır");
                return;
            }
            int sepettekiAdet = 0;
            Urun tempUrun = null;
            for (Urun urunX:sepet.getUrunArrayList()){
                if (urunX.getId().equals(urun.getId())) {
                    sepettekiAdet = urunX.getAdet();
                    tempUrun = urunX;
                    break;
                }
            }
            System.out.println("Bu üründen " + urun.getAdet() + " adet bulunmaktadir.");
            if (tempUrun != null) System.out.println("Sepetinizde bu urunden " + sepettekiAdet +" adet bulunmaktadir.");
            System.out.println("Kaç adet almak istersiniz?(Geri donmek icin 0 tuslayiniz");
            int adet = secimYap() + sepettekiAdet;
            if (adet > urun.getSepetLimiti()){
                System.out.println("Maalesef ayni urunden cok sayida almaya calisiyorsunuz.  Talep " +
                                           "gerceklestirilemedi.");
                return;
            }
            if (adet == 0){
                System.out.println("Satin alimdan vazgecildi, ana menuye donuluyor...");
                return;
            }
            
            if (adetCheck(urun, adet)) {
                if (tempUrun != null){
                    tempUrun.setAdet(adet);
                    sepet.setToplamFiyat(sepet.getToplamFiyat() + urun.getFiyat() * (adet - sepettekiAdet));
                    System.out.println("Sepetinizdeki adet guncellenmistir.");
                    return;
                }
                Urun sepetUrun = new Urun(urun, adet);
                sepet.setToplamFiyat(sepet.getToplamFiyat() + urun.getFiyat() * adet);
                sepet.getUrunArrayList().add(sepetUrun);
                System.out.println("Ürün sepete eklenmiştir.");
                return;
                
            }
            else {
                System.out.println("Bu üründen yeterli sayida stoğumuz bulunmamaktadir.");
            }
        }
    }
    public static boolean adetCheck(Urun urun,int adet){

        return urun.getAdet()>=adet;
    }
    
    public static int secimYap(){
        int secim;
        while (true) {
            try {
                secim = sc.nextInt();
                if (secim < 0) {
                    System.out.println("Negatif deger kabul etmiyoruz");
                    continue;
                }
                return secim;
            }
            catch (Exception e) {
                System.out.println("Gecersiz deger");
            }
            finally {
                sc.nextLine();
            }
        }
    }
}