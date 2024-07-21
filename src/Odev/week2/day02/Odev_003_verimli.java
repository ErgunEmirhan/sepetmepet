package Odev.week2.day02;

public class Odev_003_verimli {
    public static void main(String[] args) {
        long start = System.nanoTime();


        long num = 4;              //555555571159 büyük asal sayı denemek için.
        long sqrt = (long)(Math.ceil(Math.sqrt(num)));

        if(num<=1){
            System.out.println("Lütfen 1'den büyük değer giriniz.");
        }else if(num==2 || num==3){
            System.out.println(num+" is a PRIME number.");
        }
        else {
            boolean isPrime = true;

            for (long i = 3; i <= sqrt + 1; i += 2) {
                if (num % 2 == 0) {
                    isPrime = false;
                    break;
                } else if (num % i == 0) {
                    isPrime = false;
                    break;

                }
            }

            if (isPrime) System.out.println(num + " is a prime number!");
            else {
                System.out.println(num + " is NOT a prime number.");
            }

            long duration = (System.nanoTime() - start) / 1000000;
            System.out.printf("Duration = %,d mili-seconds", duration);


        }
    }
}
