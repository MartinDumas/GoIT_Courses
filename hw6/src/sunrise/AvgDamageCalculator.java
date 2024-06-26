package sunrise;

public class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
       try {
           int sum = 0;

           for (int sampleValue : samples) {
               sum += sampleValue;
           }

           return sum / samples.length;
       }catch (ArithmeticException e) {
           return 0;

       }
    }
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}
