package fir_planet;

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        if (n == 0){
            return 1;
        }
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;

        }
        return sum;
    }
}
