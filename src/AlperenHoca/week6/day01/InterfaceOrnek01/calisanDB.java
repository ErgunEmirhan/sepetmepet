package AlperenHoca.week6.day01.InterfaceOrnek01;

import java.util.ArrayList;

public class calisanDB {

    static ArrayList<Calisan> calisanlar = new ArrayList<>();

    static void listAll(){
        System.out.println("###### TÜM ÇALIŞANLAR ###### ");
        for(Calisan calisan : calisanlar){
            System.out.println(calisan);
        }
    }
    static ArrayList<SahaCalismasiYapabilir> listSahaElemanlari(){
        System.out.println("#### SAHA ELEMANLARI ####");
        ArrayList<SahaCalismasiYapabilir> sahaCalismasiYapabilenlerList = new ArrayList<>();
        for(Calisan calisan : calisanlar){
            if(calisan instanceof SahaCalismasiYapabilir){
                sahaCalismasiYapabilenlerList.add((SahaCalismasiYapabilir) calisan);
                System.out.println(calisan);
            }
        }
        return sahaCalismasiYapabilenlerList;
    }

    static ArrayList<MaasaGoreUnvanAlabilir> listUnvaniDegisenElemanlar(){
        System.out.println("### Unvanı maasına gore degisen elemanlar ###");
        ArrayList<MaasaGoreUnvanAlabilir> list = new ArrayList<>();
        for(Calisan calisan : calisanlar){
            if(calisan instanceof MaasaGoreUnvanAlabilir){
                list.add((MaasaGoreUnvanAlabilir) calisan);
                System.out.println(calisan);
            }
        }
        return list; // return tipine dikkat böyle yapılmak zorunda değil ama its a good practice
    }

    static ArrayList<NonSpesificInterface> listSahaElemaniOlmayanveUnvaniDegismeyenElemanlar(){
        System.out.println("### Sahada çalışmayan ve unvanı maaşına göre değişmeyen elemanlar ###");
        ArrayList<NonSpesificInterface> sahaElemaniOlmayanveUnvaniDegismeyenElemanlarList = new ArrayList<>();
            for(Calisan calisan : calisanlar){
                if(calisan instanceof NonSpesificInterface){
                    System.out.println(calisan);
                    sahaElemaniOlmayanveUnvaniDegismeyenElemanlarList.add((NonSpesificInterface) calisan);
                }
            }
            return sahaElemaniOlmayanveUnvaniDegismeyenElemanlarList;
    }



}
