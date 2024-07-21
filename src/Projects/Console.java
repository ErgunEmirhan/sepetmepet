package Projects;

import java.util.Scanner;

public class Console {
    int[] arrInt = new int[2];
    double[] arrDouble = new double[2];
    Scanner sc = new Scanner(System.in);



    public void sum() {
        System.out.println("--- TOPLAMA ISLEMI ---");
        getTwoIntNumbers();
        System.out.println("\n" + arrInt[0] + " + " + arrInt[1] + " = " + (arrInt[0] + arrInt[1]) + "\n");

    }

    public void substract() {
        System.out.println("--- CIKARMA ISLEMI ---");
        getTwoIntNumbers();
        System.out.println("\n" + arrInt[0] + " - " + arrInt[1] + " = " + (arrInt[0] - arrInt[1]) + "\n");

    }

    public void divide() {
        System.out.println("--- BOLME ISLEMI ---");
        getTwoDoubleNumbers();
        System.out.println("\n" + arrDouble[0] + " / " + arrDouble[1] + " = " + (arrDouble[0] / arrDouble[1]) + "\n");

    }

    public void multiply() {
        System.out.println("--- CARPMA ISLEMI ---");
        getTwoIntNumbers();
        System.out.println("\n" + arrInt[0] + " x " + arrInt[1] + " = " + (arrInt[0] * arrInt[1]) + "\n");

    }

    public void getTwoIntNumbers() {

        System.out.print("Sayı #1 giriniz : ");
        arrInt[0] = sc.nextInt();
        System.out.print("Sayi #2 giriniz : ");
        arrInt[1] = sc.nextInt();

    }

    public void getTwoDoubleNumbers() {

        System.out.print("Sayı #1 giriniz : ");
        arrDouble[0] = sc.nextInt();
        System.out.print("Sayi #2 giriniz : ");
        arrDouble[1] = sc.nextInt();

    }

    public  void exit(){
        System.out.println("Cikis yapiyorsunuz...\n");
        Calculator.isComplete = false;
    }

    public void startMenu(){

    boolean firstStop = true;
        System.out.println("Hosgeldiniz");
        Calculator calculator = new Calculator();

        do {
            System.out.println("Hangi islemi yapmak istersiniz.");
            System.out.println("0 - Cıkıs yapin");
            System.out.println("1 - Harf kelime kontrolu.");
            System.out.println("2 - Kelime icindeki harfi degistirme ");
            System.out.println("3 - Palindrom kelime kontrolu");
            System.out.println("4 - Kelime sayfa oyunu");
            System.out.println("5 - Hesap makinesi");
            System.out.print("Seciminiz = ");
            int n = 0;

            n = sc.nextInt();
            sc.nextLine();


            switch (n) {
                case 1: {
                    System.out.println("\n######## HARF KONTROLU ########");
                    System.out.print("Kelime giriniz : ");
                    String word = sc.nextLine().toLowerCase();
                    System.out.print("Kontrol edilmesini istediğiniz harfi giriniz : ");
                    String karakter = sc.nextLine().toLowerCase();
                    char myChar = karakter.charAt(0);

                    int countChar = 0;

                    for (int i = 0; i < word.length(); i++) {
                        if (myChar == word.charAt(i)) {
                            countChar++;
                            System.out.println("indeks = " + i);
                        }
                    }
                    if (countChar > 0) {
                        System.out.println("\nKelimede " + countChar + " adet " + myChar + " harfi bulunmaktadır.");
                    } else {
                        System.out.println("\nKelimede " + myChar + " harfi bulunmamaktadır.");
                    }
                    System.out.println();
                    break;


                }
                case 2: {
                    System.out.println("\n######## KELIME ICINDEKI HARFI DEGISTIRME ########");
                    System.out.print("Kelime giriniz : ");
                    String word = sc.nextLine().toLowerCase();
                    System.out.print("Degistirmek istediginiz harfi giriniz : ");
                    String temp1 = sc.nextLine().toLowerCase();

                    char myChar = temp1.charAt(0);
                    if (!word.contains(temp1)) {
                        System.out.println("Girdiğiniz harf kelime içinde bulunmamaktadır.\n");
                        break;
                    }
                    System.out.print("Değişecek harf değeri için yeni bir harf giriniz : ");
                    String temp2 = sc.nextLine().toLowerCase();
                    char myCharNew = temp2.charAt(0);
                    System.out.println();

                    word = word.replace(myChar, myCharNew);
                    System.out.println("Girmis oldugunuz degerlere karsılık gelen yeni kelime = " + word);

                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("\n######## PALINDROM KELIME ########");
                    System.out.print("Kelime giriniz : ");
                    String word = sc.nextLine().toLowerCase();
                    StringBuilder st = new StringBuilder(word);
                    String wordReverse = st.reverse().toString();

                    if (wordReverse.equals(word)) {
                        System.out.println("\nKelime Palindromdur.");
                        System.out.println("Duz hali = " + word);
                        System.out.println("Ters hali = " + wordReverse);
                    } else {
                        System.out.println("\nKelime palindrom degildir.");
                        System.out.println("Duz hali  = " + word);
                        System.out.println("Ters hali = " + wordReverse);
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("\n######## KELIME SAYFA OYUNU ########");
                    int countA = 0, countB=0,countC=0;
                    int countOther = 0;

                    for (int i = 1; i < 6; i++) {
                        System.out.print("Kelime " + i + " giriniz : ");
                        String word = sc.nextLine().toLowerCase();
                        if (word.charAt(0) == 'a') {
                            countA = 1;
                        } else if (word.charAt(0) == 'b') {
                            countB = 1;
                        } else if (word.charAt(0) == 'c') {
                            countC = 1;
                        } else {
                            countOther = 1;
                        }


                    }
                    System.out.println();
                    int pageTotal = countA + countB + countC + countOther;
                    System.out.println("Toplam " + pageTotal + " adet sayfa.\n");
                    break;

                }
                case 5:{
                    calculator.calcuLatorMenu();
                    break;
                }

                case 0:{
                    System.out.println("\n######### CIKIS YAPILIYOR ###########");
                    firstStop = false;
                    break;}

                default: {
                    System.out.println("*********************************\nLutfen 0-4 arası uygun deger giriniz.\n*********************************\n");
                    break;
                }

            }


        } while (firstStop);


    }


}
