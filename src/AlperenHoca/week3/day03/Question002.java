package AlperenHoca.week3.day03;

import java.util.Arrays;
// Tek sayıları bul, space complexity optimize etmek amacıyla temp arr oluşturmadan aynı metodu yazmaya çalış.
public class Question002 {
    public static void main(String[] args) {

        int[] arr = {4,5,9,11,13,11,6,2};
        arrayTransfer(arr);




    }



    public static void arrayTransfer(int[] arr1) {

        int count = 0;
        int[] tempArr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                tempArr[count] = arr1[i];
                count++;
            }
        }
        int[] arrNew = new int[count];
        for(int i =0;i<count;i++){
            arrNew[i]=tempArr[i];
        }


        System.out.println("Yeni array olusturuldu --> " + Arrays.toString(arrNew));


    }


}
