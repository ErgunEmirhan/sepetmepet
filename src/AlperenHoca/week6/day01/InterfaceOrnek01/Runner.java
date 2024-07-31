package AlperenHoca.week6.day01.InterfaceOrnek01;

public class Runner {



    public static void main(String[] args) {
        InsanKaynaklari ik = new InsanKaynaklari("Alperen","İkinci",65000);
        OfisCalisani ofisCalisani = new OfisCalisani("Ahmet","Karaca",45000);
        Muhendis muhendis = new Muhendis("Murat","Saçak",20000);
        Tekniker tekniker = new Tekniker("Ahmet","Kaya",45000);
        OfisCalisani ofisCalisani1 = new OfisCalisani("Berna","Deniz",36000);

        calisanDB.listAll();

        calisanDB.listSahaElemanlari();
        calisanDB.listUnvaniDegisenElemanlar();
        calisanDB.listSahaElemaniOlmayanveUnvaniDegismeyenElemanlar();



    }



}
