package week002.day04;

import java.util.Scanner;

public class Question002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Değer giriniz : ");
        String str = sc.nextLine();
        int count =0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println("a : "+count+" kez");



    }
}
