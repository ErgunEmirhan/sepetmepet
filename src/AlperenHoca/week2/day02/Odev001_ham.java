package AlperenHoca.week2.day02;

public class Odev001_ham {
    public static void main(String[] args) {

        long start = System.nanoTime();

        int num = 2147483647;

        boolean isPrime = true;

        for(int i=2;i<num;i++){
            if(num%i==0){
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
