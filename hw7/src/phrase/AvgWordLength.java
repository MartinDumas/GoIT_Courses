package phrase;

 class AvgWordLength {
    public double count(String phrase){
        String[] word = phrase.split("\\s+");
        double count = 0;
        for (int  i = 0; i< word.length; i++){
            count+=word[i].length();
        }
         double midvar = count/word.length;
        return midvar;
    }

    public static void main(String[] args) {
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
