package week002.day02;

import java.util.Scanner;

public class Question006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int telCode = 3523;
        int mailCode = 6655;
        System.out.print("Telefonunuza gelen kodu giriniz : ");
        int telInput = sc.nextInt();
        System.out.print("Mailinize gelen kodu giriniz : ");
        int mailInput = sc.nextInt();

        if(telInput==telCode && mailInput==mailCode){
            System.out.println("Başarıyla giriş yaptınız.");
        }
        else if(telInput==telCode & mailInput!=mailCode){
            System.out.println("Mail kodunu yanlış girdiniz.");
        }
        else if(telInput!=telCode && mailInput==mailCode){
            System.out.println("Telefon kodunu yanlış girdiniz.");
        }
        else{
            System.out.println("Girdiğiniz değerler hatalıdır.");
        }



    }




}
