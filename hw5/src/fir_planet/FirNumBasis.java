package fir_planet;

class FirNumBasis extends FirNum{
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum/2;
    }

    public static void main(String[] args) {
        System.out.println(new FirNumBasis().calc(9));
    }
}
