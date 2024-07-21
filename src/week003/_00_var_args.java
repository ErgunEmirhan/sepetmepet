package week003;

public class _00_var_args {
    public static void main(String[] args) {
        // variable args bir metoda aynı tipte değişken sayıda değer göndermek için kullanılır.
        // metod parametresinde dizi kullanımının alternatifidir.
        //main metod parametre olarak String[] args almaktadır. Yani bir String dizisini parametre olarak alabiliyor
        // burada String[] yerine String... args da kullanılabilir. Bu yönteme varargs denir.

        System.out.println(topla(2,3,4,5));
        System.out.println(topla(4,6,7,1,2,2,4,4));
        // topla(int...args) yerine (int[] args) kullanırsak bu sefer sadece dizi yollayabiliriz.
        isimYaz("Murat","Ahmet","Berkay");  // KEEEP IN MIND! It will be useful with methods.

        // String[] kaplan = new String[1] {"kaplan"}; ->> Yanlış tanımlama, hem değer atayıp hem boyut tanımlayamayız.
        //String[] x = new String[]; Yanlış tanımlama, ya initializer ile değer atıyacaksın {}, ya da köşeli parantez içinde boyut belirteceksin.
        // String str = new[] String; -> yanlış, [] köşeli parantez (veya initiliazer) data typedan (String,int vs.) sonra gelmeli.





    }
    public static int topla(int...args){
        int topla = 0;
        for(int i : args){
            topla+=topla;
        }
        return topla;
    }
    public static void isimYaz(String...args){
        for(String i : args){
            System.out.println(i);
        }
    }


}
