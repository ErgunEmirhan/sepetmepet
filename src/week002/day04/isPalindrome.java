package week002.day04;


import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Kelime giriniz : ");
        String name = sc.nextLine();
        int i = 0;
        int j = name.length()-1;

        while(i <j){
            if(name.charAt(i)==name.charAt(j) || (name.charAt(i)==name.charAt(j)+32) || (name.charAt(i)+32==name.charAt(j)) ){
                i++;
                j--;
            }
            else{
                System.out.println("Palindrom değil");
                break;
            }
            if(i >=j) {
                System.out.println("Palindrom");
                break;
            }
        }




    }
}
