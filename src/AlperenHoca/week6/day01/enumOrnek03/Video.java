package AlperenHoca.week6.day01.enumOrnek03;

import java.util.List;

public class Video {
    private String username;
    List<String> yorumlar;
    private boolean katilStatus = false;
    private EKatilTiers katilTier = EKatilTiers.TIER2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getYorumlar() {
        return yorumlar;
    }

    public void setYorumlar(List<String> yorumlar) {
        this.yorumlar = yorumlar;
    }

    public boolean isKatilStatus() {
        return katilStatus;
    }

    public void setKatilStatus(boolean katilStatus) {
        this.katilStatus = katilStatus;
    }

    public EKatilTiers getKatilTier() {
        return katilTier;
    }

    public void setKatilTier(EKatilTiers katilTier) {
        this.katilTier = katilTier;
    }
}
