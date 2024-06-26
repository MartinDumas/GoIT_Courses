class StarTrack {
    private Point start;
    private Point finish;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StarTrack) {
            StarTrack other = (StarTrack) obj;
            return start.equals(other.start) && finish.equals(other.finish);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return start.hashCode() + finish.hashCode();

    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3)); //Should be false
        System.out.println(track1.hashCode() == track2.hashCode()); //Should be true
    }
}
