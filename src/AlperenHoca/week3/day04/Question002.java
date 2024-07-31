package AlperenHoca.week3.day04;

import java.util.Scanner;

public class Question002 {
    /*
    2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).
2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.
3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim
ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

Yani;
Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.
     */

    public static void main(String[] args) {

      sum();

    }

    public static void sum(){
        System.out.print("Kac adet sayi toplamak istersiniz : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1 || n>3) {
            System.out.println("Lutfen belirtilen aralıklarda deger giriniz.");
            System.exit(0);
        }

        System.out.print("1.sayi giriniz : ");
        int num1 = sc.nextInt();
        System.out.print("2.sayi giriniz : ");
        int num2 = sc.nextInt();
        if(n==2) {
            sumTwo(num1,num2);

        }
        else if(n==3){
            System.out.print("3.sayi giriniz : ");
            int num3 = sc.nextInt();
            sumTwo(num1,num2,num3);
        }
    }

    public static void sumTwo(int num1,int num2){
        System.out.println("İki sayinin toplamı = "+(num1+num2));;
    }

    public static void sumTwo(int num1,int num2, int num3){
        System.out.println("Uc sayinin toplami = "+(num1+num2+num3));
    }

}
