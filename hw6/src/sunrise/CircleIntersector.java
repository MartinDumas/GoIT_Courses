package sunrise;

class CircleIntersector {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int r1;
    private int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.r1 = r1;
        this.r2 = r2;
    }
    @Override
    public String toString() {
        double distanceBetweenCenters = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (distanceBetweenCenters <= r1 + r2 && distanceBetweenCenters >= Math.abs(r1 - r2)) {
            return "intersects";
        } else {
            return "not intersects";
        }
    }

    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }

}
