package week002.day03;

public class SwitchLesson_001 {
    public static void main(String[] args) {

        // Switch alternatif kullanımı, Java12 ile beraber geldi.
        // Normal switche göre süslü parantez sonuna ; işareti konulması gerekli.
        int x = 5;
        String ay = switch (x){
            case 1 -> "Ocak";
            case 2 -> "Şubat";
            case 3 -> "Mart";
            case 4 -> "Nisan";
            case 5 -> "Mayıs";
            case 6 -> "Haziran";
            case 7 -> "Temmuz";
            case 8 -> "Agustos";
            case 9 -> "Eylül";


            default -> "Yanlış değer";
        } ;
        System.out.println("Ay : "+ ay);

        int gun = 2;
        String weekendType = switch(gun){
            case 1,2,3,4,5 -> "Haftaiçi";
            case 6,7 -> "Haftatsonu";
            default -> "1-7 arası değer giriniz.";
        };
        System.out.println(weekendType);


    }
}
