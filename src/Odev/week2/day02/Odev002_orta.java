package Odev.week2.day02;

public class Odev002_orta {

    public static void main(String[] args) {

        long start = System.nanoTime();

        long num = 555555571159L;

        boolean isPrime = true;

        for(long i=3;i<num;i+=2){
            if(num%2==0){
                isPrime = false;
                break;
            }

            else if(num%i==0){
                isPrime=false;

            }
        }

        if(isPrime) System.out.println(num+" is a prime number!");
        else{
            System.out.println(num+" is NOT a prime number.");
        }

        long duration = (System.nanoTime()-start)/1000000;
        System.out.printf("Duration = %,d mili-seconds",duration);





    }
}
