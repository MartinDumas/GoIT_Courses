package sunrise;

class LevelLoader {

    private static LevelLoader instance = new LevelLoader();

    static public LevelLoader getInstance() {
        return instance;
    }
    private LevelLoader() {

    }

    public String load(String levelName){
        return String.format("Loading level %s", levelName);
    }
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}
