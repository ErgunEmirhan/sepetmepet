package Odev.week3.day02;
/*
Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.

 */
public class Question005 {
    public static void main(String[] args) {

        int[] arr = {2,-256,2,1258,2,2};

        boolean x = false;

        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) {
                x = true;
                break;
            }
        }

        System.out.println(x);


    }
}
