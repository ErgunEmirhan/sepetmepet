package week002.day05;

public class _03_StringvsStringBuilder {
    public static void main(String[] args) {
        int islemAdet = 100_000;
        long startTime =System.currentTimeMillis();


//        String metin = "Hello";
//        for(int i =0;i<islemAdet;i++){
//            metin+=i;
//        }
//       Yukaridaki islem icin duration = 3438 ms.
//       Aynı işlemi StringBuilder ile yaptığımızda 6ms çıktı. İnanılmaz bir fark. Immutable ve mutable arasındaki fark!.


        StringBuilder metin2 = new StringBuilder();
        metin2.append("Hello");
        for(int i =0;i<islemAdet;i++){
            metin2.append(i);
        }


        long endTime = System.currentTimeMillis();
        long duration = endTime-startTime;
        System.out.println(duration);



    }
}
