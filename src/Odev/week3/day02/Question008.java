package Odev.week3.day02;
/*
    Dizide 13 sayısına denk gelene kadar devam edelim. 13 sayısı
    bulunduktan sonra ondan bir sonraki gelen sayı 13 değil ise 13'den sonra gelen sayıyı toplama ekleyelim.
 */
public class Question008 {
    public static void main(String[] args) {
        int[] arr = {1,13,13,13,5,13};
        int sum =0;

        boolean active = true;

        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==13 && arr[i+1]!=13){
                sum+=arr[i+1];
            }
        }
        System.out.println(sum);

    }
}
