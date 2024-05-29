package sunrise;

 class Distance {
     private int startX;
     private int startY;
     private int endX;
     private int endY;

     public Distance(int startX, int startY, int endX, int endY){
         this.startX = startX;
         this.startY = startY;
         this.endX = endX;
         this.endY = endY;

     }
     public int getDistance(){
        double pow1 =  Math.pow((endX-startX), 2);
        double pow2 =  Math.pow((endY-startY), 2);
        double root =  Math.sqrt(pow1+pow2);
         return(int) Math.round(root);

     }

     public int getStartX() {
         return startX;
     }

     public int getStartY() {
         return startY;
     }

     public int getEndX() {
         return endX;
     }

     public int getEndY() {
         return endY;
     }

     public static void main(String[] args) {
         System.out.println(new Distance(-26, 36, 25, -28).getDistance());
     }
 }
