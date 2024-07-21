package week002.day03;

import java.util.Scanner;

public class Question003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        if (num < 1) {
            System.out.println("1'den büyük sayı giriniz.");
        } else {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " mükemmel bir sayıdır.");
            } else {
                System.out.println(num + " mükemmel bir sayı değildir.");
            }

        }

    }
}
