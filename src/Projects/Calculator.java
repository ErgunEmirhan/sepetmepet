package Projects;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {



        System.out.println("Hosgeldiniz!");



    }
    public static boolean  isComplete = true;
    Scanner sc = new Scanner(System.in);
    Console console = new Console();

    public void calcuLatorMenu(){



        while(isComplete){

            System.out.println("#### HESAP MAKINESI ####");
            System.out.println("0 - Cikis");
            System.out.println("1 - Toplama islemi");
            System.out.println("2 - Cikarma islemi");
            System.out.println("3 - Carpma islemi");
            System.out.println("4 - Bolme islemi");
            System.out.print("Seciminiz : ");

            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Lutfen numerik degerler giriniz.");
                continue;
            } finally {
                sc.nextLine();
            }
            switch(choice){
                case 1: console.sum();
                    break;
                case 2: console.substract();
                    break;
                case 3: console.multiply();
                    break;
                case 4: console.divide();
                    break;
                case 0: console.exit();
                    break;
                default :
                    System.out.println("\nLutfen uygun degerler giriniz.\n");
            }

        }
    }










}
