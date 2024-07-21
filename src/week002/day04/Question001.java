package week002.day04;

import java.util.Scanner;

public class Question001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Değer giriniz : ");
        String str = sc.nextLine();
        for(int i =0;i<str.length();i++){
            System.out.println("i(" +i+") = "+str.charAt(i));
        }


    }
}
