package Odev.week3.day04;

import java.util.Scanner;

public class Question003 {
    /*
    3- Kullanici disaridan bir sayi girecek.

Ornek girdi = 10;
Sirasiyla;
1- 10 + 50
2- (10+50) * 30
3- ((10+50)*30) -40
4- (((10+50)*30) -40) / 20
islemlerini yaptiracagiz.

Bu islemleri tek bir satirda, metotlara, diger metotlari parametre olarak gecerek gerceklestirelim.
     */

    public static void main(String[] args) {
        System.out.println(sum4(10));
    }

    Scanner sc = new Scanner(System.in);

    public static int sum(int x){
        return x+50;
    }

    public static int sum2(int x){
        return sum(x)*30;
    }
    public static int sum3(int x){
        return sum2(x)-40;
    }
    public static int sum4(int x){
        return sum3(x)/20;
    }






}
