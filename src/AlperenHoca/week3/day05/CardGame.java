package AlperenHoca.week3.day05;

import java.util.Arrays;
import java.util.Scanner;

//String[] renk = {"Maça", "Kupa", "Karo", "Sinek"};
//String[] sayi = {"2","3","4","5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//Yukarıdaki dizilerden 52'lik bir iskambil destesi üretelim. (Yeni bir dizide)
//Örnek Deste Eleman Çıktısı.
//"Maça 6", "Sinek J"
//Desteyi Ürettikten Sonra Menü'den oyun seçelim:
//Papaz Kaçtı için ; Kupa papaz, Sinek papaz, Karo papaz kartlarını desteden çıkaralım. Ve destenin çıktısını alalım.
//
//Altmış Altı için: Her renkte 9, 10, Vale, Kız, Papaz ve As dışındaki bütün elemanları desteden çıkaralım.


public class CardGame {



    public void cardGame(){
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;

        System.out.println("Hangi oyunu oynamak istersiniz.");
        System.out.println("1 - Papaz Kaçtı");
        System.out.println("2 - Altmış Altı");
        System.out.print("Seciminiz : ");
        int ans = sc.nextInt();

        switch(ans){
            case 1: papazKacti(shuffle());
            break;
            case 2:almisAlti(shuffle());
            break;
            default:
                System.out.println("Lütfen geçerli bir rakam giriniz.");
        }

    }



    public  String[] shuffle(){

        String[] renk = {"Maca", "Kupa", "Karo", "Sinek"};
        String[] sayi = {"2","3","4","5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] shuffle = new String[renk.length*sayi.length];
        int count =0;

        for(int i=0;i<renk.length;i++){
            for(int j =0;j<sayi.length;j++){
                shuffle[count] =renk[i]+" "+sayi[j];
                count++;


            }
        }

        return shuffle;
    }

    public void papazKacti(String[] shuffle){

        String[] papazKacti = new String[shuffle.length-3];
        int count =0;

        for(int i=0;i<shuffle.length;i++){
            if(shuffle[i].equals("Kupa K") || shuffle[i].equals("Karo K") || shuffle[i].equals("Sinek K")){
                continue;
            }
            else{
            papazKacti[count]=shuffle[i];
            count++;

            }
        }
        System.out.println(Arrays.toString(papazKacti));



    }
    public void almisAlti(String[] shuffle){

        String[] altmisAlti = new String[24];
        int count =0;

        for(int i=0;i<altmisAlti.length;i++){
            if(shuffle[i].contains("9") || (shuffle[i].contains("10"))|| (shuffle[i].contains("J"))|| (shuffle[i].contains("Q"))||
                    (shuffle[i].contains("A"))|| (shuffle[i].charAt(5) == 'K'))  {
                altmisAlti[count] = shuffle[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(altmisAlti));

    }

}
