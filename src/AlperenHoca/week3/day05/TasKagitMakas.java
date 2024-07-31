package AlperenHoca.week3.day05;

import java.util.Random;
import java.util.Scanner;

//Taş kağıt makas oyunu.

public class TasKagitMakas {

    ;

    Scanner sc = new Scanner(System.in);
    Random random = new Random();


    public void rockpaperScicor() {

        boolean menu = true;
        int personScore = 0;
        int compScore = 0;

        while (menu) {

            tkmMenu();
            int ans = sc.nextInt();
            int compAns = random.nextInt(1, 4);
            System.out.println("Bilgisayar secimi : " + compAns);
            System.out.println();

            if (ans < 1 || ans > 3) {
                System.out.println("Lutfen 1-3 arasında secim yapiniz.");
            } else if ((ans == 1 && compAns == 2) || (ans == 2 && compAns == 3) || (ans == 3 && compAns == 1)) {
                compScore++;
            } else if ((ans == 1 && compAns == 3) || (ans == 2 && compAns == 1) || (ans == 3 && compAns == 2)) {
                personScore++;
            }

            scoreBoard(personScore,compScore);

            sc.nextLine();

            System.out.println("\n Devam etmek ister misiniz ?");
            System.out.println("E / H ");

            String s = sc.nextLine().toUpperCase();
            if (s.equals("H")) {
                menu = false;
                System.out.println("Gorusmek uzere!");
            }

        }

    }

    public void tkmMenu() {
        System.out.println("Tas, kagit, makas ? -> Numara seciniz.");
        System.out.println("1 - Tas");
        System.out.println("2 - Kagit");
        System.out.println("3 - Makas");
        System.out.print("Seciminiz : ");
    }
    public void scoreBoard(int personScore,int compScore){
        System.out.println("Kullanıcı :" + personScore + " -- Bilgisayar :" + compScore);
        System.out.println();

        if (personScore > compScore) {
            System.out.println("Tebrikler, Ondesiniz.");
        } else if (compScore > personScore) {
            System.out.println("Uzgunum, geridesiniz..");
        } else {
            System.out.println("Durum berabere.");
        }
    }


}
