package AlperenHoca.week3.day03;

import java.util.Arrays;

public class Question003 {
    public static void main(String[] args) {

        int[][] arr = { { 56, 23, 678, 231, 5 },
                        { 234, 21, 78, 26, 6 },
                        { 654, 33, 32, 67, 2 },
                        { 189, 35, 56, 89, 8 } };

        matrixToArray1D(arr);


    }

    public static void matrixToArray1D(int[][] arr){
        int count =0;
        int[] arrNew = new int[arr.length*arr[0].length];

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arrNew[count] =arr[i][j];
                count++;
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }


}
