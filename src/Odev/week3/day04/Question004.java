package Odev.week3.day04;

// Dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?
    //int[] array = { 1, 5, -4, 3 };
public class Question004 {
    public static void main(String[] args) {

        int[] arr = {1,5,-4,3};
        System.out.println(minDiff(arr));

    }


    public static int minDiff(int[] arr) {

        int min = Integer.MAX_VALUE;

        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){

                min = Math.min(min,Math.abs(arr[i]-arr[j]));

            }
        }


        return min;
    }


}

