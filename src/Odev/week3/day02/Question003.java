package Odev.week3.day02;

import java.util.Scanner;

public class Question003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr1 = {"Turkiye","Japonya","Mogolistan","Amerika","Rusya","Cin"};
        System.out.print("Kontrol edilmesini istediginiz ulke ismini giriniz : ");
        String ans = sc.nextLine().toLowerCase();

        boolean isExist = false;

        for(int i=0;i<arr1.length;i++){
            if(ans.equals(arr1[i].toLowerCase())){
                isExist=true;
                break;
            }
        }

        System.out.println(isExist ? "Listede "+ans+" mevcut." : "Girmis oldugunuz ulke listede mevcut degil.");


    }


}
