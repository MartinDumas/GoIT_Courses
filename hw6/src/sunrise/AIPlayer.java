package sunrise;

public class AIPlayer {
    private int hp;

    public void setHp(int hp) {
        this.hp = hp;
        if (hp<0 || hp>100) {
            throw new IllegalArgumentException();
        }
    }

}
