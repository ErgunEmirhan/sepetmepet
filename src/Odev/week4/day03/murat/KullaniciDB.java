package Odev.week4.day03.murat;

import java.util.Scanner;

public class KullaniciDB {

    public static int index = 0;
    public static Scanner sc = new Scanner(System.in);

    public static Kullanici[] kullanicilar = new Kullanici[50];

    private String gizliSoru;
    private String gizliCevap;


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
        for (int i = 0; i < index; i++) {
            if (kullanicilar[i].getKullaniciAdi().equals(kullaniciAdi) && kullanicilar[i].getSifre().equals(sifre)) {
                System.out.println("Basariyla giris yaptiniz!");
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

}
