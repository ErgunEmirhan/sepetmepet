package Odev.week4.day02;


public class OzelListeMainAlp {
    public static void main(String[] args) {
        OzelListeAlp ozelListe = new OzelListeAlp();

        ozelListe.add(10);
        ozelListe.add(20);
        ozelListe.add(25);
        ozelListe.add(30);
        ozelListe.add(35);
        ozelListe.remove(2);

        for(int i : ozelListe.getSayiDizisi()){
            System.out.print(i+" ");
        }

    }
}
