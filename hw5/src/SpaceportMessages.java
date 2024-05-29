public class SpaceportMessages {
    public static String generateLandingMessage(String shipName, String spaceport, String time){
        return String.format("Spaceship %s landing at %s time is %s", shipName, spaceport, time);
    }

    public static void main(String[] args) {
        String landingMessage = SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40");
        System.out.println(landingMessage);
    }
}