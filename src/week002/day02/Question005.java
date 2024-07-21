package week002.day02;

public class Question005 {
    public static void main(String[] args) {
        double sumEven = 0;
        double sumOdd = 0;

        for(int i =2;i<= 100;i+=2){
            sumEven +=i;
        }
        for(int i=1;i<100;i+=2){
            sumOdd+=i;
        }

        double ratio = sumEven/sumOdd;

        System.out.println("1'den 100'e kadar olan çift sayıların toplamı = "+sumEven);
        System.out.println("1'den 100'e kadar olan tek sayıların toplamı = "+sumOdd);
        System.out.println("İki değerin oranı = "+ratio);





    }
}
