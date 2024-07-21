package week002.day05;

// String immutable bir sınıftır. StringBuilder mutabledir. Yapılan değişiklikler ilgili nesnede yapılır,
// yeni nesne oluşmaz.
// StringBuffer sınıfı da mutable bir sınıftır, Multithread uygulamalarda kullanılabilir.

public class _02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(); //StringBuilder str = "Merhaba"; --> StringBuilder ile bu şekilde nesne oluşturamazsın.
        str.append("Murat"); // append ile mevcut nesneye yeni değer eklersin.
        System.out.println(str.reverse()); // String terse çevirir. StringBuilder ile yapılan metotlar sout içinde olsa bile nesnenin üzerinde kalıcı olur.
        str.replace(0,1,"B");
        System.out.println(str);
        str.insert(5," Kaya");
        System.out.println(str);
        str.delete(5,10);
        System.out.println(str);



    }
}
