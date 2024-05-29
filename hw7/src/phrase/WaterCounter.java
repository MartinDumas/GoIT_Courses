package phrase;

public class WaterCounter {
    public double count(String text){
        double count = 0;
        for (char s : text.toCharArray()){
            if (Character.isSpaceChar(s)){
                count++;
            }
        }
        double result = count/text.length();
        return result;
    }
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
