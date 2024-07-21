package week002.day05;

import java.util.Locale;

public class _01_String_Metodlar {
    public static void main(String[] args) {
        // Locale dili değiştirme.
        Locale tr1 = new Locale.Builder().setLanguage("tr").setRegion("TR").build(); // tr locali olusturmak.
        String str1 = "istanbul";
        System.out.println(str1.toUpperCase(tr1)); // küçük i büyüğünce I değil İ olur.

        //str.indexOf
        String str2 = "Maretaba";
        System.out.println(str2.indexOf('a',3)); //3.indexten itibaren başlar, ilk bulduğu karakter indeksini verir.
        //contains
        String str3 = "Kamekazi";
        System.out.println(str3.contains("mek")); //Girdi kelimenin bir parçası mı ona bakıyor, returns true or false.
        //startsWith,endsWith
        String str4 = "Lale";
        System.out.println(str4.startsWith("La")); // Girilen string grubu ile mi başlıyor bizim Stringimiz.
        System.out.println(str4.endsWith("le"));  // Girilen string grubu ile mi bitiyor kelimemiz ona bakar.

        //Escape characters

        System.out.println("Bugün \"Ankarada\" hava yağmurlu."); //String içinde " kullanmak için escape sequence..
        System.out.println("Ad   \t\t= Murat"); //used for text aligning.
        System.out.println("SoyAd\t\t= Saçak");
        System.out.println("Alexander\nWalker"); // creates a new line.




    }
}
