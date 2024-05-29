package sunrise;

class AI {
    static {
        System.out.println("AI loaded!");
    }

    {
        System.out.println("AI created!");
    }


    public static void main(String[] args) {
            for(int i = 0; i < 3; i++) {
                new AI();
            }
    }
}

