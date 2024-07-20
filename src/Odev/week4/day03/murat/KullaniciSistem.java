package Odev.week4.day03.murat;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class KullaniciSistem {

    public static int kullaniciIndex;
    public static Scanner sc;
    private static final int usersCapacity = 50;
    private Kullanici[] users;

    public KullaniciSistem() {
        users = new Kullanici[usersCapacity];
    }

    public void menu() {
        sc = new Scanner(System.in);
        boolean isMenu = true;

        while (isMenu) {
            System.out.println("\n### KULLANICI KAYIT SISTEMI ###");
            System.out.println("1- Kayit Ol");
            System.out.println("2- Giris Yap");
            System.out.println("3- Sifremi Unuttum");
            System.out.println("4- Kullanıcı listesini görüntüle");
            System.out.println("0- Cikis");
            System.out.print("Lutfen bir secim yapiniz : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    kullaniciKayit();
                    break;
                case 2:
                    KullaniciDB.girisYap();
                    break;
                case 3:
                    KullaniciDB.sifremiUnuttum();
                    break;
                case 4:
                    kullaniciListesi();
                    break;
                case 0:
                    isMenu = false;
                    break;
                default:
                    System.out.println("Lutfen belirtilen aralıklarda secim giriniz.");
                    break;

            }
        }


    }

    public void kullaniciKayit() {
        LocalDate date = dogumTarihi();
        if (yasKontrol(date)) {
            users[kullaniciIndex] = new Kullanici();
            users[kullaniciIndex].setDogumTarihi(date);
            adSoyAdGirisi();
            kullaniciAdiOlustur();
            sifreOlustur();
            mailOlustur();
            telNoOlustur();
            tcNoOlustur();

            KullaniciDB.save(users[kullaniciIndex]);
            kullaniciIndex++;
            System.out.println("Üye kaydı başarıyla oluşturulmuştur.");
            System.out.println(users[kullaniciIndex - 1]);
        }

    }

    public void adSoyAdGirisi() {
        System.out.print("Ad: ");
        String ad = sc.nextLine();
        users[kullaniciIndex].setAd(ad);
        System.out.print("Soyad: ");
        String soyad = sc.nextLine();
        users[kullaniciIndex].setSoyad(soyad);
    }

    public void kullaniciAdiOlustur() {
        while (true) {
            boolean isDone = true;
            System.out.print("Kullanici adı: ");
            String kullaniciAdi = sc.nextLine();
            if (kullaniciAdi.length() < 5 || kullaniciAdi.length() > 16) {
                System.out.println("Kullanıcı adı uzunluğu en fazla 16, en az 5 karakter olmalıdır...");
                continue;
            }
            for (int i = 0; i < kullaniciIndex; i++) {
                if (kullaniciAdi.equals(users[i].getKullaniciAdi())) {
                    System.out.println("Kullanıcı adı başkası tarafından kullanılmaktadır. Lütfen farklı kullanıcı adı seçiniz.");
                    isDone = false;
                    break;
                }
            }
            if (isDone) {
                users[kullaniciIndex].setKullaniciAdi(kullaniciAdi);
                return;
            }

        }
    }

    public void sifreOlustur() {
        while (true) {
            System.out.print("Sifre giriniz: ");
            String sifre = sc.nextLine();
            if (sifre.length() < 8) {
                System.out.println("Sifreniz 8 karakterden kucuk olmamalidir.");
                continue;
            }
            System.out.print("Sifre tekrar giriniz: ");
            String sifreTekrar = sc.nextLine();
            if (!sifre.equals(sifreTekrar)) {
                System.out.println("Girilen sifreler birbirini tutmamaktadır.");
                continue;
            }
            users[kullaniciIndex].setSifre(sifre);
            return;

        }
    }

    public void mailOlustur() {

        while (true) {
            boolean isDone = true;
            System.out.print("Emailinizi giriniz: ");
            String email = sc.nextLine();
            for (int i = 0; i < kullaniciIndex; i++) {
                if (users[i].getMail().equalsIgnoreCase(email)) {
                    System.out.println("Girdiginiz mail adresi zaten kayitli.");
                    isDone = false;
                    break;
                }
            }
            if (isDone) {
                users[kullaniciIndex].setMail(email);
                return;
            }

        }
    }

    public void telNoOlustur() {
        while (true) {
            boolean isDone = true;
            System.out.print("Telefon numaranız :+90 ");
            String input = "+90" + sc.nextLine();

            boolean numberCheck = numberCheck(input);
            if (!numberCheck) {
                System.out.println("Telefon numaranız sadece rakamlardan oluşmalıdır...");
                continue;
            }

            if (input.length() != 13) {
                System.out.println("Lütfen ülke alan kodu hariç 10 haneli telefon numaranızı aralarında boşluk olmayacak şekilde giriniz.");
                System.out.println("Örnek -- 5369876543");
                continue;
            }


            for (int i = 0; i < kullaniciIndex; i++) {
                if (users[i].getTelNo().equals(input)) {
                    System.out.println("Telefon numarasi sistemde zaten kayitlidir.");
                    isDone = false;
                    break;
                }
            }
            if (isDone) {
                users[kullaniciIndex].setTelNo(input);
                return;
            }

        }
    }

    public void tcNoOlustur() {
        while (true) {
            boolean isDone = true;
            String tcNo;
            System.out.print("11 haneli TC kimlik numaranızı giriniz: ");
            tcNo = sc.nextLine();

            boolean numberCheck = numberCheck(tcNo);
            if (!numberCheck) {
                System.out.println("TC Kimlik numaranız sadece rakamlardan oluşmalıdır...");
                continue;
            }
            for (int i = 0; i < kullaniciIndex; i++) {
                if (tcNo.equals(users[i].getTcNo())) {
                    System.out.println("Girmis oldugunuz TC no sistemde zaten kayitli.");
                    isDone = false;
                    break;
                }
            }
            if (!isDone) continue;

            if (tcNo.length() != 11) {
                System.out.println("Kimlik numaranız 11 haneli olmalıdır.");
                isDone = false;

            }
            if (isDone) {
                users[kullaniciIndex].setTcNo(tcNo);
                return;
            }
        }
    }


    public LocalDate dogumTarihi() {

        while (true) {
            System.out.print("Dogum tarihinizi giriniz (YY-MM-DD) : ");
            String date = sc.nextLine();
            try {
                return LocalDate.parse(date);
            } catch (Exception e) {
                System.out.println("Lütfen doğum tarihinizi belirtilen formatta giriniz (YY-AA-GG)");
            }
        }
    }

    public boolean yasKontrol(LocalDate localDate) {
        int age = Period.between(localDate, LocalDate.now()).getYears();
        if (age > 18) {
            return true;
        } else {
            System.out.println("18 yaşından küçükler kayıt olamaz.");
        }
        return false;
    }

    public void kullaniciListesi() {
        if (kullaniciIndex == 0) {
            System.out.println("Kayıtlı kullanici bulunamadi.");
            return;
        }
        System.out.println("#### KAYITLI KULLANICILAR ####");
        for (int i = 0; i < kullaniciIndex; i++) {
            System.out.println(users[i]);
        }
    }

    public boolean numberCheck(String input){
        for (int i = 1; i < input.length(); i++) { // telNO ilkhanesi +'dan dolayı 1. indexten başlattım.
            if (input.charAt(i) < 48 || input.charAt(i) > 57) {
               return false;
            }
        }
        return true;
    }

    public Kullanici[] getUsers() {
        return users;
    }
}
