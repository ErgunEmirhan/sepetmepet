package Odev.week4.day02;

import java.util.Scanner;

public class OzelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OzelListe ozel1 = new OzelListe(5);
        OzelListe ozel2 = new OzelListe(5);
        int[] arr = {1,2,3,4,5};

        ozel1.addSayi(5);
        ozel1.addSayi(3);
        ozel1.addSayi(4);
        ozel1.addSayi(2);
        ozel1.addSayi(1);

        ozel2.addAll(arr);

        ozel1.removeSayi(4);

        ozel1.listDisplay();
        ozel2.listDisplay();







    }
}
