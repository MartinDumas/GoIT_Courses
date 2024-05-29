package fir_planet;

 class FirNumSum extends FirNum{
     @Override
     public int calc(int n) {
         int sum = 0;
         while(n>0){
             sum+=n;
             n--;
         }
         return sum;
     }
 }
