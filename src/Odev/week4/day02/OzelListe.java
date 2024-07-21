package Odev.week4.day02;

import java.util.Scanner;
/*
1- OzelListe isimli bir sinif olusturalim. Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği
 int türünde sayiyi alacak ve sayi dizimize ekleyecek.
1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği index'i silecek.
1.3 - list isimli bir metot daha yazalım. Bu metot listemizi { , , , , } formatında yazdırsın. Son eleman virgül problemini de çözelim.
1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize eklesin.
 */

public class OzelListe {
    int[] sayilar;
    private int boyut = 0;
    Scanner sc;

    OzelListe(int kapasite) {
        sayilar = new int[kapasite];
    }

    public void addSayi(int sayi) {

        if (sayilar.length == 0) {
            sayilar = new int[1];
            sayilar[0] = sayi;
            boyut++;
        } else {
            int[] temp = new int[boyut + 1];
            for (int i = 0; i < boyut; i++) {
                temp[i] = sayilar[i];
            }
            temp[boyut] = sayi;
            sayilar = temp;
            boyut++;
        }


    }

    public void removeSayi(int index) {
        int[] temp = new int[boyut - 1];
        for (int i = 0; i < boyut - 1; i++) {
            if (i >= index) {
                temp[i] = sayilar[i + 1];
            } else {
                temp[i] = sayilar[i];
            }
        }
        sayilar = temp;
        boyut--;

    }

    public void addAll(int[] sayiDizisi){
        for (int i = 0; i<sayiDizisi.length;i++){
            addSayi(sayiDizisi[i]);
        }
    }


    public void listDisplay() {
        System.out.print("(");
        for (int i = 0; i < boyut; i++) {
            if (i != boyut - 1) {
                System.out.print(sayilar[i] + " ,");
            }
        }
        System.out.println(sayilar[boyut-1] + ")");

    }


}