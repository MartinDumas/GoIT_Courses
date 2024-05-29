package sunrise;

 class Level {
    private LevelInfo levelInfo;
    private Point[] points;



    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }
    public int calculateLevelHash(){
        int hash = 0;
        for(Point p : points){
            hash += p.x* p.y;
        }
        return hash;
    }

    @Override
    public String toString() {
        return String.format("Quarke level, name is %s, difficulty is %s, point count is %d",levelInfo.name, levelInfo.difficulty, points.length);

    }
    static class Point{
        private int x;
        private int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }
    static class LevelInfo{
        private String name;
        private  String difficulty;
        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
        public String getName() {
            return name;
        }
        public String getDifficulty() {
            return difficulty;
        }

    }
     public static void main(String[] args) {

             Level.Point p1 = new Level.Point(3, 5);
             Level.Point p2 = new Level.Point(10, 100);
             Level.Point p3 = new Level.Point(50, 40);

             Level.Point[] points = {p1, p2, p3};

             Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

             //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
             System.out.println(new Level(info, points));
         System.out.println(new Level(info, points).calculateLevelHash());
         }

}
