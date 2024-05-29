package phrase;

public class WordFreqCounter {
    public float countFreq(String phrase, String word){
        phrase = phrase.toLowerCase();
        word = word.toLowerCase();
        String[] words = phrase.split("\\s+");

        int wordCount = 0;
        for (String w : words) {
            if (w.equals(word)) {
                wordCount++;
            }
        }
        float freq = (float) wordCount / words.length;
        return freq;


    }
}
