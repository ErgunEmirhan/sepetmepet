package Odev;

public class Odev_003_verimli {
    public static void main(String[] args) {
        long start = System.nanoTime();

        int num = 4411117;
        int numSqrt = (int)Math.ceil(Math.sqrt(num));

        boolean isPrime = true;

        for(int i=3;i<numSqrt;i+=2){
            if(num%2==0){
                isPrime = false;
                break;
            }

            if(num%i==0){
                isPrime=false;
                break;

            }
        }

        if(isPrime) System.out.println(num+" is a prime number!");
        else{
            System.out.println(num+" is NOT a prime number.");
        }

        long duration = (System.nanoTime()-start);
        System.out.printf("Duration = %,d nano-seconds",duration);



    }
}
