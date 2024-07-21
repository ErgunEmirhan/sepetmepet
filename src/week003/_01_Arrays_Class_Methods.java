package week003;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class _01_Arrays_Class_Methods {
    public static void main(String[] args) {

        int[] nums = {6,8,2,5,3};

        // 1.Arrays.toString(arr) -> bu metod içine verilen dizideki elemanları [] içinde aralarına virgül koyarak yazdırır.
        System.out.println(Arrays.toString(nums));

        // 2.Arrays.sort: Diziye doğral sıralama uygular. Küçükten büyüğe A'dan Z'ye.
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // 3.Arrays.binarysearch(): Aranan eleman listede varsa index numarasını döner.
        // Eğer yoksa negatif bir değer gönder.(olsa hangi indexte olurdu mantık olarak onu hesaplar, o değere +1 koyup eksi ile çarpar.)
        int index = Arrays.binarySearch(nums,4);
        System.out.println(index);

        //Arrays.equals: Karşılaştırılan diziler içindeki elemanlar ve sıralamaları eşitse true döner, yoksa false.
        boolean equals = Arrays.equals(nums,new int[]{2, 3, 5, 6, 8});
        System.out.println(equals);

        // 4.Arrays.fill : Diziyi istenilen elemanlara doldurmaya yarar. Belirli indeksler arası da yapılabilir bu işlem.
        int[] arr2 = {3,5,7};
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2,1);
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2,1,2,3); // toIndex is exclusive as always.
        System.out.println(Arrays.toString(arr2));

        /* 5.Arrays.copyOf : Yeni bir diziye farklı bir dizideki değerleri kopyalamaya yarar. Yeni dizi boyutu küçük olursa o indexe kadar olan değerleri
         kopyalar. Boyutu daha büyük olursa eski dizideki tüm değerleri kopyalayıp kalan değerleri 0 olarak atar. */
        int[] arr3 = {5,2,8,4,6};
        int[] arr4 = Arrays.copyOf(arr3,8);
        System.out.println(Arrays.toString(arr4));

        // 6.Arrays.copyOfRange : Bütün dizinin bir kopyasını değil de o diziden belirli bir aralığın kopyalanmasını sağlamak için kullanılır.
        int[] arr6 = Arrays.copyOfRange(arr3,1,4);
        System.out.println(Arrays.toString(arr6));

        // 7.Arrays.stream : Belirli işlemleri yapmamıza sağlayan metod. Toplama, ortalama, max, min vs.
        int sum = Arrays.stream(arr3).sum(); // Dizideki elemanların toplamını verir.
        System.out.println(sum);
        long count = Arrays.stream(arr3).count(); // Dizideki toplam eleman sayısını (length) verir.
        System.out.println(count);
        OptionalInt max = Arrays.stream(arr3).max(); //dizideki max değeri verir.
        System.out.println(max);
        OptionalInt min = Arrays.stream(arr3).min(); //dizideki min değeri verir. OptionalInt ne sonra bakacaz.
        System.out.println(min);

        //8. Arrays.asList: Bir array'i Liste çevirme:
        Integer[] arr7 = {3,5,2,6,7}; // array türünü de wrapper class olarak tanıtman lazım.
        List<Integer> list = Arrays.asList(arr7); // Mutlaka wrapper class kullanman lazım bu metodda.
        System.out.println(list);

        //9. Arrays.deepToString(): Çok boyutlu arrayleri kolayca görüntülemek için kullanılır. (toString yerine)
        int[][] array1= {{1,2},{3,4},{5,6}};
        System.out.println(Arrays.deepToString(array1));


    }
}
