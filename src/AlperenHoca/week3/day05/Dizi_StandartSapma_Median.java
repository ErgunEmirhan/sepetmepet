package AlperenHoca.week3.day05;

import java.util.Scanner;

//Dizi boyutu ve dizi elemanları dışarıdan alınmak üzere dizi içerisindeki elemanların ortalamasını, standart sapmasını ve medyanını bulan program.

public class Dizi_StandartSapma_Median {

    Scanner sc =new Scanner(System.in);




    public void standartDev(int[] arr){
        System.out.print("Dizi boyutu giriniz : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print((i+1)+". eleman = ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i : arr){
            sum+=i;
        }

        double average = ((double)sum)/n;
        double standartDeviation = 0;

        for(int i : arr){
            standartDeviation+= Math.pow(i-average,2);
        }
        standartDeviation/=n;
        standartDeviation=Math.sqrt(standartDeviation);

        double median =0;
        int nHalf = n/2;

        if(n%2!=0){
            median = arr[n/2];
        }else{
            median = (double) (arr[nHalf] + arr[nHalf + 1]) /2;
        }


        System.out.println("Dizilerdeki sayıların ortalaması = "+average);
        System.out.println("Standart sapma = "+standartDeviation);
        System.out.println("Medyan = "+median);


    }

}