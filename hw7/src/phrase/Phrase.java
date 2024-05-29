package phrase;

import java.util.Arrays;

class Phrase {
     private  String[] words;


     public Phrase(String[] words){
         this.words = Arrays.copyOf(words, words.length);
     }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);
            if (i < words.length - 1) {
                stringBuilder.append(" "); // Додаємо пробіл між словами
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
