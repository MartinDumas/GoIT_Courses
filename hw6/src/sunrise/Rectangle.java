package sunrise;

class Rectangle {
    private int a, b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public boolean canPlaceInto(Rectangle anotherRect){
        if ((this.a <= anotherRect.a && this.b <= anotherRect.b) ||
                (this.a <= anotherRect.b && this.b <= anotherRect.a)) {
            return true;
        }
        return false;
    }
    public int getA() {
        return a;
    }
    public int getB() {

        return b;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}
