package Odev.week3.day05;

public class Main {
    public static void main(String[] args) {

        CardGame card = new CardGame();

        String[] renk = {"Maca", "Kupa", "Karo", "Sinek"};
        String[] sayi = {"2","3","4","5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        card.cardGame();
        card.shuffle();

        Dizi_StandartSapma_Median ss = new Dizi_StandartSapma_Median();

        int[] arr = {4,6,8,10};

//        ss.standartDev(arr);










    }
}
