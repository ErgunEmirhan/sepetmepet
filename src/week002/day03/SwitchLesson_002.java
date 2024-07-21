package week002.day03;

public class SwitchLesson_002 {
    public static void main(String[] args) {
        int n = 2;
        int sayi1 = 10;
        int sayi2 = 20;
        int result;

        int sonuc = switch(n){
            case 1->{
                result = sayi1+sayi2;
                yield result; // yield, return keywordu gibi çalışıyor burda.
            }
            case 2->{
                result = sayi1-sayi2;
                yield result;
            }

            default -> throw new IllegalStateException("Unexpected value"+n); //hata gönderildi.
        };

        System.out.println(result);




    }
}
