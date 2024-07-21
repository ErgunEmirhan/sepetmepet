package week002.day03;

import java.util.Scanner;

public class Question004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number #1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number #2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number #3 : ");
        int num3 = sc.nextInt();
        System.out.print("Enter number #4 : ");
        int num4 = sc.nextInt();
        System.out.print("Enter number #5 : ");
        int num5 = sc.nextInt();

        int max1, max2, max3, max;
        int min1, min2, min3, min;

        max1 = Math.max(num1, num2);
        max2 = Math.max(max1, num3);
        max3 = Math.max(max2, num4);
        max = Math.max(max3, num5);

        min1 = Math.min(num1, num2);
        min2 = Math.min(num3, min1);
        min3 = Math.min(num4, min2);
        min = Math.min(num5, min3);

        System.out.println("En büyük sayi = " + max);
        System.out.println("En küçük sayi = " + min);


    }
}
