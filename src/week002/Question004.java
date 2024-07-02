package week002;

import java.util.Scanner;

public class Question004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = sc.nextInt();
        int result;

        for(int i =0;i<=9;i++ ){
            result = num*i;
            System.out.println(num+" * "+i+" = "+result);
        }
        sc.close();

    }
}
