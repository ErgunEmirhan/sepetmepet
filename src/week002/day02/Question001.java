package week002.day02;

import java.util.Scanner;

//1- Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5 gibi) tabanın kuvvetini hesaplamak istiyorum.
//Hesaplamayı yaptıktan sonra, kullanıcıya ismini soracağım. Sonra çıktı olarak; "kullaniciIsmi + "n üzeri x isleminin sonucu " "
public class Question001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = sc.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int power = sc.nextInt();
        sc.nextLine();
        System.out.print("İsminizi giriniz : ");
        String name = sc.nextLine();
        int result = (int)Math.pow(number,power);
        System.out.println("İsminiz : "+name+"\n"+number+"^"+power+" işleminin sonucu = "+result);

    }
}
