package week002;

import java.util.Scanner;

public class Question001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = sc.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int expo = sc.nextInt();
        sc.nextLine();
        System.out.print("İsminizi giriniz : ");
        String name = sc.nextLine();
        int result = (int)Math.pow(number,expo);
        System.out.println("İsminiz : "+name+"\n"+number+"^"+expo+" işleminin sonucu = "+result);

    }
}
