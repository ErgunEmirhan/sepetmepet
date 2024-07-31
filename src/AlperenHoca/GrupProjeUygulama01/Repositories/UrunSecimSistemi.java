package AlperenHoca.GrupProjeUygulama01.Repositories;

import AlperenHoca.GrupProjeUygulama01.Repositories.entities.Kiyafet;
import AlperenHoca.GrupProjeUygulama01.Repositories.entities.Sepet;

import java.util.Scanner;

public class UrunSecimSistemi {
        Scanner sc = new Scanner(System.in);
        Sepet sepet = new Sepet();





    public void welcomeMenu() {
        while (true) {
        System.out.println("Sepete eklemek istediğiniz ürünü seçiniz");
        System.out.println("1- " + tShirt.getUrunAd());
        System.out.println("2- " + kazak.getUrunAd());
        System.out.println("3- " + pantolon.getUrunAd());
        System.out.println("4- " + kemer.getUrunAd());
        System.out.print("Seciminiz: ");
        int secim = sc.nextInt();
        sc.nextLine();

            switch (secim) {
                case 0:
                    System.out.println("Çıkış yapıyorsunuz.");
                    sc.close();
                    return;
                case 1:{
                    Kiyafet tShirt = new Kiyafet("tShirt",350.0);
                    sizeSec(tShirt);
                }
            }
        }
    }

    public void sizeSec(Kiyafet kiyafet) {
        while (true) {
            System.out.println("Urun icin size seciniz");
            System.out.println("1- Small");
            System.out.println("2- Medium");
            System.out.println("3- Large");
            System.out.print("Seciminiz: ");
            int secim = sc.nextInt();
            sc.nextLine();
            switch (secim) {
                case 1:
                    kiyafet.setSize("Small");
                    return;
                case 2:
                    kiyafet.setSize("Medium");
                    return;
                case 3:
                    kiyafet.setSize("Large");
                    return;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız.");
                    break;
            }
        }

    }

}
