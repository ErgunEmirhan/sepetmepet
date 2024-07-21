package week002.day04;

public class StringFunctions {
    public static void main(String[] args) {

        String value = "Murat Saçak";
        System.out.println(value.charAt(2)); // 2.indexteki karakteri gösterir
        System.out.println(value.trim()); // stringin baş ve sonundaki boşlukları siler.
        System.out.println(value.length()); // String karakter uzunluğu verir.
        System.out.println(value.indexOf('a')); // a harfinin ilk indeksini verir.
        System.out.println(value.lastIndexOf('a')); // a harfinin bulunduğu en son indeksi verir.
        System.out.println(value.substring(5)); //5. index ve sonrasını yazdırır.
        System.out.println(value.substring(0,5)); //0.indexten 5.indexe kadar olan kısmı yazdırır.




    }
}
