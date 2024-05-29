import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {
    Scanner scanner = new Scanner(System.in);
    public int calculateDistance(int distance){
        return Math.abs(distance);
    }
    public String[] getPlanets(String galaxy){
        if (galaxy.equals("Miaru")){
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[]{"Fobius", "Demius"};
        } else return new String[]{};
    }
    public String choosePlanet(long distanceToEarth){
        if (distanceToEarth<45677){
            return "Earth";
        }else return "Pern";
    }
    public int calculateFuelPrice(String fuel, int count){
        if (fuel.equals("STAR100")){
            return count*70;
        } else if (fuel.equals("STAR500")) {
            return count*120;
        } else if (fuel.equals("STAR1000")) {
            return count*200;
        }else return count*50;
    }
    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }
    public  int calculateNeededFuel(int distance){
        if (distance<=20){
            return 1000;
        }else{
            int x = distance%10;
            return 1000+5*x;
        }
    }
    public void calculateMaxPower(){
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        scanner.close();
        int max = Math.max(firstNum,Math.max(secondNum,thirdNum));
        if (max<10){
            System.out.println(max*0.7f);
        } else if (max>10 && max<100) {
            System.out.println(max*1.2f);
        }else System.out.println(max*2.1f);
    }
    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }

        return result.strip();
    }
    public boolean isHangarOk(int side1, int side2, int price){
        int area = side1 * side2;
        int maxOfSides = Math.max(side1, side2);
        int minOfSides = Math.min(side1, side2);

        if (area >= 1500 && maxOfSides <= minOfSides * 2 && price / area <= 1000) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

//        System.out.println(ship.calculateDistance(-10));
//        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
//        System.out.println(ship.choosePlanet(10));
//        System.out.println(ship.calculateFuelPrice("STAR100", 10));
//        System.out.println(ship.roundSpeed(89));
//        System.out.println(ship.calculateNeededFuel(22));
//        ship.calculateMaxPower();
        System.out.println(ship.getMyPrizes(250));
        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}
