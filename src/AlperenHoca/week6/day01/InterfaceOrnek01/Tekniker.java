package AlperenHoca.week6.day01.InterfaceOrnek01;

public class Tekniker extends Calisan implements SahaCalismasiYapabilir{
    public Tekniker(String isim, String soyisim, double maas) {
        super(isim, soyisim, maas);
        super.setUnvan("Tekniker");

    }

    @Override
    public void sahaCalismasiYap() {
        System.out.println(super.getClass().getSimpleName()+" saha çalışması yürütüyor."); //getName desek packe uzantısıyla verir.
    }
}
