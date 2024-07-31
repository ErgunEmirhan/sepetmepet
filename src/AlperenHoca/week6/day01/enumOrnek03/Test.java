package AlperenHoca.week6.day01.enumOrnek03;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Video video = new Video();
        video.setUsername("Murat");
        video.setYorumlar(List.of("Çok eğlenceliyi.","İzlerken çok güldüm."));

            EKatilTiers katilTier = video.getKatilTier();
            User user;
        if(katilTier.equals(EKatilTiers.TIER0)){
            System.out.println("Herhangi bir yerden video izlenebilir.");
            System.out.println("Video oynatılmaya başlandı.");
        }else if(katilTier.equals(EKatilTiers.TIER1)){
            user = isUserLoggedIn();
            if(user!=null){
                user.setUserStatus(EUserStatus.TIER1);
            }
            if(user.getUserStatus().equals(EUserStatus.TIER1) || user.getUserStatus().equals(EUserStatus.TIER2)){
                System.out.println("Kullanıcı videoyu izleyebilir.");
            }
            System.out.println("Kullanici katıl1 veya katıl2 üyesidir ve videoyu izleyebilir.");
        }else if(katilTier.equals(EKatilTiers.TIER2)){
            user = isUserLoggedIn();
            if(user!=null){
                user.setUserStatus(EUserStatus.TIER2);
            }
            if(user.getUserStatus().equals(EUserStatus.TIER2)){
                System.out.println("Kullanici katıl1 üyesidir ve videoyu izleyebilir.");
            }
        }
    }

    private static User isUserLoggedIn() {
        return new User();
    }
}
