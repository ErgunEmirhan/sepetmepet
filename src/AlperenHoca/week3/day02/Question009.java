package AlperenHoca.week3.day02;

public class Question009 {

    /*
    String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek çıktıyı almaya çalışalım;

    "Adana şehrinin plaka kodu : 01"

    Aşağdaki şehirler tek bir String degerdir.
-> 01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya
     */


    public static void main(String[] args) {

        String city = "41-Kocaeli";

        char[] arr = city.toCharArray();

        StringBuilder stPlate = new StringBuilder();
        StringBuilder stCity = new StringBuilder();

        for(int i=0;i<2;i++){
            stPlate.append(arr[i]);
        }


        for(int i = 3; i< city.length(); i++){
            stCity.append(arr[i]);
        }

        System.out.println(stCity+" sehrinin plaka kodu: "+stPlate);



    }
}
