package week002.day02;

import java.util.Scanner;

public class Question007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = sc.nextInt();

        int temp =1;

        while(temp <num){
            temp *=5;

        }

        if(num== temp){
            System.out.println("Doğru");
        }
        else{
            System.out.println("Yanlış");
        }

        sc.close();

    }
}
