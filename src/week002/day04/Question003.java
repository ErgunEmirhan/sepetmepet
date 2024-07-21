package week002.day04;

import java.util.Scanner;

public class Question003 {
    public static void main(String[] args) {

        String str = "Java,React,Spring";
        String react = "";
        String java = "";
        String spring = "";
        int index = 0;
        int count = 1;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==','){
                System.out.println(str.substring(index,i));
                index = i+1;
            }
        }
        System.out.println(str.substring(index));
        System.out.println("************");
        System.out.println("ALTERNATİF ÇÖZÜM");

        System.out.println(str.replace(',', '\n'));




    }
}
