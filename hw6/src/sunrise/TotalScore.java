package sunrise;

 class TotalScore {
     public int sum(int[] scores) {
         int result = 0;
         int index = 0;

         while(true) {
            result += scores[index];
            index++;
            if(index == scores.length) {
                throw new IndexOutOfBoundsException();

            }
         }

     }
}
