public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent){
        return  (holeDepth<34)||(batteryPercent >67);
    }
    public boolean canJumpOverHill(int hillHeight, int batteryPercent){
        return (hillHeight<=150) && (batteryPercent>=90);
    }
    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding){
        return isRobotStanding^isEngineWorking;
    }
    public boolean shouldSleep(boolean isDayNow){
        return !isDayNow;
    }
}