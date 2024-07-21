package week002.day03;

public class SwitchLessonExample_001 {
    public static void main(String[] args) {
        int grade = 65;

        String not = null;

        String  s = switch(grade/10){
            case 9-> "AA";
            case 8-> "BA";
            case 7-> "BB";
            case 6-> "BC";
            case 5-> "CC";
            case 4-> "DC";
            case 3-> "DD";
            case 0,1,2-> "FF";


            default -> "1 ile 10 arası değer girmelisiniz.";
        };

        System.out.println("Not değeri : "+s);




    }

}
