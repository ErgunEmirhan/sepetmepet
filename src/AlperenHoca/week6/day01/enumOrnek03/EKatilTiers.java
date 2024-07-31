package AlperenHoca.week6.day01.enumOrnek03;

public enum EKatilTiers {
    TIER0("Herkes İcin Gecerli",0),
    TIER1("Katil Uyesi",5),
    TIER2("Has Uye",20d);

    private String name;
    private double price;

    EKatilTiers(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
