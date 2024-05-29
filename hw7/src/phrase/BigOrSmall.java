package phrase;

import java.util.Arrays;

public class BigOrSmall {
    public String calculate(String text){
        int lowerCount = 0;
        int upperCount = 0;
        for (char s : text.toCharArray()){
            if (Character.isLowerCase(s)){
                lowerCount++;
            } else upperCount++;
        }
        if (lowerCount>upperCount){
            return "Small";
        }else if (lowerCount == upperCount){
            return "Same";
        } else return "Big";
    }
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
