package AlperenHoca.week2.day3;

import java.util.Scanner;

public class UserInterface_v01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz! / Welcome!");
        int lang = -1;

        while (lang != 1 && lang != 2) try {
            {
                System.out.println("Lutfen goruntuleme dilini seciniz. / Please select display language.");
                System.out.println("1-- Türkçe\t (TR)\n2-- English\t (EN)");
                lang = sc.nextInt();
            }
        } catch (Exception InputMismatchException) {
            System.out.println("\nLütfen uygun değer girişi yapın.\nPlease enter valid input.");
            System.exit(1);
        }

        if (lang == 1) {
            int choice =-1;
            do {
                try {
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("0-- Çıkış Yap\n1-- Merhaba dünya yazdır\n2-- Faktöriyel Hesapla\n3-- Asal sayı kontrolü yap");
                    choice = sc.nextInt();

                    if (choice == 0) {
                        System.out.println("Program sonlandirilmistir! Gorusmek uzere!");
                    } else if (choice == 1) {
                        System.out.println("Merhaba dünya!\n");

                    } else if (choice == 2) {
                        System.out.print("Sayı giriniz : ");
                        int n = sc.nextInt();
                        int result = 1;
                        for (int i = 1; i <= n; i++) {
                            result *= i;
                        }
                        System.out.println(n + "! = " + result + "\n");
                    } else if (choice == 3) {
                        System.out.print("Sayı giriniz : ");
                        long num = sc.nextInt();
                        long sqrt = (long) (Math.ceil(Math.sqrt(num)));
                        boolean isPrime = true;

                        if (num <= 1) {
                            System.out.println("Lütfen 1'den büyük değer giriniz.\n");
                        } else if (num == 2 || num == 3) {
                            System.out.println(num + " asal sayıdır.\n");
                        } else {

                            for (long i = 3; i <= sqrt+1; i += 2) {
                                if (num % 2 == 0) {
                                    isPrime = false;
                                    break;
                                } else if (num % i == 0) {
                                    isPrime = false;
                                    break;

                                }
                            }

                            if (isPrime) System.out.println(num + " asal sayıdır.\n");
                            else {
                                System.out.println(num + " asal sayı değildir.\n");
                            }
                        }

                    } else {
                        System.out.println("Lutfen 0-4 aralığında secim yapiniz.\n");
                    }
                } catch (Exception InputMismatchException) {
                    System.out.println("\nLütfen uygun değer giriniz.");
                    System.exit(1);
                }


            } while (choice != 0);

        } else {
            int choice = -1;
            try {
                do {
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("0-- Exit\n1-- Output 'Hello World!'\n2-- Calculate factorial of a number\n3-- Check if number is Prime");
                    choice = sc.nextInt();

                    if (choice == 0) {
                        System.out.println("Program has been shutdown! See you later!");
                    } else if (choice == 1) {
                        System.out.println("Hello World!\n");

                    } else if (choice == 2) {
                        System.out.print("Enter a number : ");
                        int n = sc.nextInt();
                        int result = 1;
                        for (int i = 1; i <= n; i++) {
                            result *= i;
                        }
                        System.out.println(n + "! = " + result + "\n");
                    } else if (choice == 3) {
                        System.out.print("Enter a number : ");
                        long num = sc.nextInt();
                        long sqrt = (long) (Math.ceil(Math.sqrt(num)));
                        if (num <= 1) {
                            System.out.println("Please enter a number bigger than 1.\n");
                        } else if (num == 2 || num == 3) {
                            System.out.println(num + " is a PRIME number.\n");
                        } else {

                            boolean isPrime = true;

                            for (long i = 3; i <= sqrt+1; i += 2) {
                                if (num % 2 == 0) {
                                    isPrime = false;
                                    break;
                                } else if (num % i == 0) {
                                    isPrime = false;
                                    break;

                                }
                            }

                            if (isPrime) System.out.println(num + " is a PRIME number.\n");
                            else {
                                System.out.println(num + " is NOT a prime number.\n");
                            }

                        }
                    } else {
                        System.out.println("Please make a choice between 0-4\n");
                    }


                } while (choice != 0);
            } catch (Exception InputMismatchException ) {
                System.err.println("Please enter a valid input.");
                System.exit(1);
            }
        }
    }
}