package Odev.week4.day03.murat;

import java.util.Scanner;

public class KullaniciDB {

    static KullaniciSistem mySistem = new KullaniciSistem();

    public static int index = 0;
    public static Scanner sc = new Scanner(System.in);

    public static Kullanici[] kullanicilar = new Kullanici[50];

    public static void save(Kullanici kullanici) {
        kullanicilar[index] = kullanici;
        index++;
    }

    public static void sifremiUnuttum() {
        System.out.print("Kullanici adinizi giriniz: ");
        String userName = sc.nextLine();
        System.out.print("11 haneli TC kimlik numaranızı giriniz: ");
        String tcNo = sc.nextLine();
        System.out.print("Basinda 0 olmadan telefon numaranızı giriniz :+90 ");
        String telNO ="+90"+ sc.nextLine();
        for (int i = 0; i < index; i++) {
            if ((tcNo.equals(kullanicilar[i].getTcNo()) && kullanicilar[i].getTelNo().equals(telNO) && (userName.equals(kullanicilar[i].getKullaniciAdi())))) {
                System.out.println("Dogrulama adini basariyla gectiniz.");
                System.out.println("Yeni sifre belirleyiniz: ");
                String sifre = sc.nextLine();
                kullanicilar[i].setSifre(sifre);
                System.out.println("###########################################");
                System.out.println("Yeni sifreniz basariyla olusturulmustur!");
                System.out.println("###########################################");
                return;
            }
        }

        System.out.println("Girmis oldugunuz bilgiler hatalidir. Ana menuye yonlendiriliyorsunuz.");
    }


    public static void girisYap() {
        System.out.print("Kullanici adi: ");
        String kullaniciAdi = sc.nextLine();
        System.out.print("Sifre: ");
        String sifre = sc.nextLine();
        boolean isUser = false;
        int kullaniciIndex = 0;

        for (int i = 0; i < index; i++) {
            if (kullanicilar[i].getKullaniciAdi().equals(kullaniciAdi) && kullanicilar[i].getSifre().equals(sifre)) {
                System.out.println("Basariyla giris yaptiniz!");
                kullaniciIndex = i;
                loginMenu(kullaniciIndex);
                return;
            } else if (kullanicilar[i].getKullaniciAdi().equals(kullaniciAdi)) {
                isUser = true;
                break;
            }
        }
        if (!isUser) {
            System.out.println("Girmis oldugunuz kullanici adi sistemimizde kayitli degildir. Lutfen tekrar deneyiniz.");
        } else {
            System.out.println("Girmis oldugunuz sifre yanlistir.");
            System.out.println("Ana menuye yonlendiriliyorsunuz...");
        }
        System.out.println();
    }

    public static void loginMenu(int kullaniciIndex){
        boolean isLoginMenu = true;
        while(isLoginMenu) {
            System.out.println("--------- KULLANICI MENUSU --------- ");
            System.out.println("1- Bilgilerimi goruntule");
            System.out.println("2- Tel no degistir");
            System.out.println("3- Email degistir");
            System.out.println("4- Sifre degistir");
            System.out.println("0- Ana menuye don");
            int secim = sc.nextInt();
            sc.nextLine();
            switch (secim) {
                case 0: {
                    isLoginMenu = false;
                    System.out.println("Ana menuye yonlendiriliyorsunuz.");
                    break;
                }
                case 1: {
                    displayUserInfo(kullaniciIndex);
                    break;
                }
                case 2:{
                    telNoDegistir(kullaniciIndex);
                    break;
                }
                case 3:{
                    mailDegistir(kullaniciIndex);
                    break;
                }
                case 4:{
                    sifreDegistir(kullaniciIndex);
                    break;
                }

            }
        }

    }

    public static void displayUserInfo(int kullaniciIndex){
        System.out.println(kullanicilar[kullaniciIndex]);
        System.out.println();
    }
    public static void telNoDegistir(int kullaniciIndex){

        while(true) {
            boolean isDone=true;
            System.out.print("Yeni tel no giriniz: ");
            String telNo = "+90" + sc.nextLine();
            boolean numberCheck = mySistem.numberCheck(telNo);
            if (!numberCheck) {
                System.out.println("Telefon numaranız sadece rakamlardan oluşmalıdır...");
                continue;
            }
            if (telNo.length() != 13) {
                System.out.println("Lütfen ülke alan kodu hariç 10 haneli telefon numaranızı aralarında boşluk olmayacak şekilde giriniz.");
                System.out.println("Örnek -- 5369876543");
                continue;
            }

            for (int i = 0; i < index; i++) {
                if (kullanicilar[i].getTelNo().equals(telNo)) {
                    if(i==kullaniciIndex) continue;
                    System.out.println("Telefon numarasi sistemde zaten kayitlidir.");
                    isDone=false;
                    break;
                }
            }
            if(isDone){
                kullanicilar[kullaniciIndex].setTelNo(telNo);
                System.out.println("Telefon numaranız basariyla degistirilmistir.");
                return;
            }
        }

    }

    public static void mailDegistir(int kullaniciIndex){
        System.out.println("Yeni mail adresinizi giriniz: ");
        String mail = sc.nextLine();
        kullanicilar[kullaniciIndex].setMail(mail);
        System.out.println("Mail adresiniz basariyla degistirilmistir.");
    }

    public static void sifreDegistir(int kullaniciIndex){
        int count = 0;
        while(true){
            System.out.print("Eski sifrenizi giriniz: ");
            String eskiSifre = sc.nextLine();
            if(eskiSifre.equals(kullanicilar[kullaniciIndex].getSifre())){
                System.out.print("Yeni sifrenizi giriniz: ");
                String yeniSifre = sc.nextLine();
                System.out.print("Yeni sifreyi tekrar giriniz: ");
                String yeniSifreTekrar = sc.nextLine();
                if(yeniSifre.equals(yeniSifreTekrar)){
                    kullanicilar[kullaniciIndex].setSifre(yeniSifre);
                    System.out.println("Sifreniz basariyla degistirilmistir.");
                    return;
                }else{
                    System.out.println("Girilen yeni sifreler birbirini tutmamaktadır.Lutfen tekrar deneyiniz.");
                    continue;
                }

            }else{
                count++;
                if(count==3) {
                    System.out.println("Sifrenizi 3 kez ard arda yanlıs girdiniz. Menuye yonlendiriliyorsunuz.");
                    return;
                }
                System.out.println("Sifrenizi yanlıs girdiniz. Lutfen tekrar deneyiniz.");

            }
        }

    }




}
