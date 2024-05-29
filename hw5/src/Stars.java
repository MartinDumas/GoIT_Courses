class Stars {
    private int count;

    @Override
    public String toString() {
        int[] nominals = {100, 10, 1};
        String[] equiv = {"Y", "Z", "*"};
        int div = count/1000;
        int mod = count%1000;
        String result = "X".repeat(div);
        for(int i = 0; i < nominals.length; i++){
            div = mod/nominals[i];
            mod %= nominals[i];
            result += equiv[i].repeat(div);

        }
        return result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
