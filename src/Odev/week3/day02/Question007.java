package Odev.week3.day02;

public class Question007 {

     /*
    Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti 4
    sayısının adetinden büyükse true değilse false yazdıralım.
     */

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,1,1,4,8};

        int countOne =0;
        int countFour = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1) countOne++;
            if(arr[i]==4) countFour++;

        }

        System.out.println("1 sayisi -> "+countOne+" kez.");
        System.out.println("4 sayisi -> "+countFour+" kez.");
        System.out.println(countOne>countFour);

    }
}
