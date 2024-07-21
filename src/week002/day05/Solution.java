package week002.day05;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(1,7);

        for(int i =0;i<50;i++){
            int y = random.nextInt(1,7);
            System.out.print(y+", ");
        }

    }
}
