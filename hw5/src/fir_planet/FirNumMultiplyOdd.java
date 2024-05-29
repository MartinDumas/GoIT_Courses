package fir_planet;

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum*= i;
            }
        }
        return sum;
    }


}
