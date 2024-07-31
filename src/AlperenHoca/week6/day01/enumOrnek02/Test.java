package AlperenHoca.week6.day01.enumOrnek02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> userDB = new ArrayList<>();

    public static void main(String[] args) {


        User user = new User();
        user.setUsername("Murat");
        user.setPassword("12345678");
        user.setRole(Erole.ADMIN);
        userDB.add(user);

        User user1 = new User();
        user1.setUsername("Ahmet");
        user1.setPassword("12345678");
        user1.setRole(Erole.USER);

        User user2 = new User();
        user2.setUsername("Mehmet");
        user2.setPassword("12345678");
        user2.setRole(Erole.USER);

        userDB.add(user1);
        userDB.add(user2);

        welcomeInterface();
    }

    public static void welcomeInterface() {
        int secim = -1;
        while (secim != 0) {
            System.out.println("1 - Giriş Yap");
            System.out.println("0 - Çıkış");
            System.out.print("Seçiminiz: ");
            secim = sc.nextInt();
            sc.nextLine();
            welcomeFunctions(secim);
        }
    }

    private static void welcomeFunctions(int secim) {
        switch (secim) {
            case 1: {
                User user = girisYap();
                if(user!=null) {
                    System.out.println("Başarıyla giriş yaptınız.");
                }
                else{
                    System.out.println("Kullanıcı adı ya da şifre hatalı...");
                }
                break;
            }
            case 0: {
                System.out.println("Güle güle");
                break;
            }
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız.");
        }

    }

    private static User girisYap() {

        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        User user;
        if (checkCredentials(username, password)) {
            user =  findByUserNameAndPassword(username,password);
            if(user.getRole().equals(Erole.USER)){
                userMenu(user);
            }
            else if(user.getRole().equals(Erole.ADMIN)){
                adminMenu(user);
            }
        }


        return null;
    }

    private static void adminMenu(User user) {
        int secim = -1;
        while (secim != 0) {
            System.out.println("#### ADMIN MENU ####");
            System.out.println("1 - Şifremi değiştir.");
            System.out.println("2 - Kullanıcı engelle");;
            System.out.println("0 - Çıkış");
            System.out.print("Seçiminiz: ");
            secim = sc.nextInt();
            sc.nextLine();
            adminFunctions(secim);
        }
    }

    private static void adminFunctions(int secim) {
        switch (secim){
            case 1:
                System.out.println("Şifremi değiştir.");
                break;
            case 2:
                System.out.println("Kullanıcı engelle");
                break;
            case 0:
                System.out.println("Ana menüye dönülüyor.");
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız.");
        }
    }

    private static void userMenu(User user) {
        int secim = -1;
        while (secim != 0) {
            System.out.println("#### USER MENU ####");
            System.out.println("1 - Şifremi değiştir.");
            System.out.println("0 - Çıkış");
            System.out.print("Seçiminiz: ");
            secim = sc.nextInt();
            sc.nextLine();
            userFunctions(secim);
        }
    }

    private static void userFunctions(int secim) {

        switch (secim){
            case 1: {
                System.out.println("Şifremi değiştir.");
                break;
            }
            case 0:
                System.out.println("Ana menüye dönülüyor.");
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız.");
        }

    }

    private static boolean checkCredentials(String username, String password) {

        for (User user : userDB) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private static User findByUserNameAndPassword(String username, String password) {
        for (User user : userDB) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

}
