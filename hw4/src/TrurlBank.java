public class TrurlBank {
    public int sumQuads(int n){
        int sum = 0;
        while(n > 0){
            int rem = (int)Math.pow(n, 2);
            sum += rem;
            n--;
        }
        return sum;
    }
    public int countSumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            sum += number%10;
            number/=10;

        }
        return sum;
    }
    public static void main(String[] args) {
        TrurlBank tb = new TrurlBank();
        System.out.println(tb.sumQuads(3));
        System.out.println(tb.countSumOfDigits(333));
    }
}
