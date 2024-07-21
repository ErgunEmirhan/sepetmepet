package week002.day03;

import java.util.Scanner;

public class Question002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number : ");
        int month = sc.nextInt();
        System.out.print("Enter a day number : ");
        int day = sc.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Please enter a day number between 1-31");
        } else {
            switch (month) {
                case 1:
                    if (day < 22) {
                        System.out.println("Oglak");
                    } else {
                        System.out.println("Kova");
                    }
                    break;
                case 2:
                    if (day < 20) {
                        System.out.println("Kova");
                    } else {
                        System.out.println("Balık");

                    }
                    break;
                case 3:
                    if (day <= 20) {
                        System.out.println("Balık");
                    } else {
                        System.out.println("Koc");
                    }
                    break;
                case 4:
                    if (day <= 20) {
                        System.out.println("Koc");
                    } else {
                        System.out.println("Boga");
                    }
                    break;
                case 5:
                    if (day <= 21) {
                        System.out.println("Boga");
                    } else {
                        System.out.println("İkizler");
                    }
                    break;
                case 6:
                    if (day <= 22) System.out.println("İkizler");
                    else System.out.println("Yengec");
                    break;
                case 7:
                    if (day <= 22) System.out.println("Yengec");
                    else System.out.println("Aslan");
                    break;
                case 8:
                    if (day <= 22) System.out.println("Aslan");
                    else System.out.println("Basak");
                    break;
                case 9:
                    if (day <= 22) System.out.println("Basak");
                    else System.out.println("Terazi");
                    break;
                case 10:
                    if (day <= 22) System.out.println("Terazi");
                    else System.out.println("Akrep");
                    break;
                case 11:
                    if (day <= 21) System.out.println("Akrep");
                    else System.out.println("Yay");
                    break;
                case 12:
                    if (day <= 21) System.out.println("Yay");
                    else System.out.println("Oglak");
                    break;
                default:
                    System.out.println("Enter a valid month number");

            }

        }


    }


}
