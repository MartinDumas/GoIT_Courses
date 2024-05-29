public class Engine {
    private int power;

    public String getFuelType(){
        return "A500";
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static void main(String[] args) {
        System.out.println(new Engine().getFuelType());

    }
    }

