package Odev.week3.day02;

public class Question006 {

/*
Dizideki bütün sayıların toplamını yazdıralım.
Dizinin her bir elemanı için;
çift ise çifttir, tek ise tektir yazdıralım.
 */

    public static void main(String[] args) {

        int[] arr = {0,120,5,85,-256,16,1258,81,14};

        int sum = 0;

        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]%2==0){
                System.out.println(arr[i]+"\t\t : "+" Cift Sayi");
            }
            else {
                System.out.println(arr[i]+"\t\t : "+" Tek Sayi");
            }
        }
        System.out.println("Butun sayilarin toplami = "+sum);

    }
}
