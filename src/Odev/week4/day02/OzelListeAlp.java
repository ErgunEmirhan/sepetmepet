package Odev.week4.day02;
/*
1- OzelListe isimli bir sinif olusturalim. Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği
 int türünde sayiyi alacak ve sayi dizimize ekleyecek.
1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği index'i silecek.
1.3 - list isimli bir metot daha yazalım. Bu metot listemizi { , , , , } formatında yazdırsın. Son eleman virgül problemini de çözelim.
1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize eklesin.
 */
public class OzelListeAlp {
    private int[] sayiDizisi;
    private int boyut;

    public int[] getSayiDizisi() {
        return sayiDizisi;
    }

    //1.1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği
    // int türünde sayiyi alacak ve sayi dizimize ekleyecek.
    public void add(int sayi){
        int[] temp;
        if(sayiDizisi == null){
            sayiDizisi = new int[1];
            sayiDizisi[0]=sayi;
            this.boyut = 1;
        }
        else{
            temp = new int[this.boyut+1]; // this demene gerek yok aslında .. this class degiskenini belirtir. eger metodda da this olsaydı karısıklık onlenecekti.
            for(int i =0;i<boyut;i++){
                temp[i] = sayiDizisi[i];
            }
            temp[boyut] =sayi;
            sayiDizisi=temp;
            boyut++;
        }
    }
    //2. 1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği index'i silecek.

    public void remove(int index){
        int[] tmp = new int[this.boyut-1];
        for(int i =0;i<boyut-1  ;i++){
            if(i<index){
                tmp[i]=sayiDizisi[i];
            }else{
                tmp[i] = sayiDizisi[i+1];
            }
        }
        sayiDizisi=tmp;
        boyut--;
    }


}
