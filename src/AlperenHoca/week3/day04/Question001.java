package AlperenHoca.week3.day04;

public class Question001 {
/*
1- Girilen kelimedeki Turkce karakterleri, Ingilizce karakterlere ceviren bir program yazalım.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

Örnegin;

Çadır - > Cadir
 */
    public static void main(String[] args) {

        String s = "öğretmenler gününüz kutlu olsun";
        System.out.println(turkishToEnglishChars(s));



    }

    public static int deneme(int x){
        x=3;
        return x;
    }

    public static String turkishToEnglishChars(String s){



        String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
        String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

        for(int i =0;i<ingilizceKarakter.length;i++){
            s = s.replace(turkceKarakter[i],ingilizceKarakter[i]);
        }



        return s;
    }




}
