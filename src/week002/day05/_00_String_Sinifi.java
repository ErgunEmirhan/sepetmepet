package week002.day05;


public class _00_String_Sinifi {
    public static void main(String[] args) {
        String name = new String("Murat"); // String sınıfından nesne oluşturma.
        String surName = "Sacak"; // " " ile nesne String nesnesi oluşturma.

        //String sınıfı final keywordlu bir sınıftır. Final keywordu sınıfta kullanılırsa o sınıfran miras alınamaz.

        //Mutable x Immutable : String sınıfı immutable bir siniftir. Degistirilemez demektir.

        surName +=" K."; // burda surName elementine " K." eklemek istersek java o elemanı değiştirmek yerine yeni bir eleman (object) yaratır.
        // Yeni bir surName elemanı yaratırken, aynı zamanda eski surName elemanını("Sacak") da java otomatik siler.
        System.out.println(surName);





    }


}
