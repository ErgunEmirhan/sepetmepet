package AlperenHoca.week3.day02;

public class Question004 {

    /*
    En büyük ve en küçük sayiyi tespit edelim.
    Dizideki en buyuk 2. sayiyi bulalim.
     */


    public static void main(String[] args) {

        int[] arr = {0,120,5,85,-256,1300,16,1258,81,14};

        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        int max2 = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==max) {
                continue;
            }
            else{
                max2 = Math.max(max2,arr[i]);
            }
        }



        System.out.println("Dizideki en buyuk sayı = "+max);
        System.out.println("Dizideki en kucuk sayı = "+min);
        System.out.println("En buyuk ikinci sayi = "+max2);
    }
}
