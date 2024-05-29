package fir_planet;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));
        System.out.println(new FirNumSum().calc(5));
        System.out.println(new FirNumFactorial().calc(4));
        System.out.println(new FirNumFactorial().calc(5));
    }
}
