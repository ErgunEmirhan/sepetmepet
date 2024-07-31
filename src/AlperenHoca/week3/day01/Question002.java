package AlperenHoca.week3.day01;

import java.util.Arrays;

public class Question002 {
    public static void main(String[] args) {

        int[] arr = {20,19,20,40,3,40,5,3,7,3};
        int[] temp = new int[arr.length];

        Arrays.sort(arr);
        int count =1;

        temp[0] = arr[0];
         for(int i = 1; i< temp.length; i++){
             if(arr[i]!=arr[i-1]){
                 temp[count]=arr[i];
                 count++;
             }
         }

        int[] arrNew = new int[count];

         for(int i=0;i<count;i++){
             arrNew[i]=temp[i];
         }
        System.out.println(Arrays.toString(arrNew));



    }
}
