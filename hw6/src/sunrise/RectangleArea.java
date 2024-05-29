package sunrise;

class RectangleArea {
   private int[] coord = new int[4];
   private int x1, y1, x2, y2;
    public RectangleArea(int[] coord) {
        this.coord = coord;
        this.x1 = coord[0];
        this.y1 = coord[1];
        this.x2 = coord[2];
        this.y2 = coord[3];
    }
    public int getArea(){
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        return width * height;
    }


    public int[] getCoord() {
        return coord;
    }
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
