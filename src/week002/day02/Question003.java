package week002.day02;

import java.util.Scanner;

public class Question003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        double count = 0;
        double average = 0;

        while(true){
            System.out.print("Sayı giriniz = ");
            num = sc.nextInt();
            if(num==0) break;
            sum+=num;
            count++;
            average = sum/count;

        }
        System.out.println("Sayılarin toplami = "+sum);
        System.out.println("Toplanan sayıların ortalaması = "+average);
        sc.close();

    }
}
