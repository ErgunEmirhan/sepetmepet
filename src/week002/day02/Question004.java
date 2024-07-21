package week002.day02;

import java.util.Scanner;

public class Question004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = sc.nextInt();
        int result;

        for(int i =0;i<=10;i++ ){
            result = num*i;
            System.out.println(num+" x "+i+"\t = "+result);
        }
        sc.close();

    }
}
