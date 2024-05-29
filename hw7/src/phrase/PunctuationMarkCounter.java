package phrase;

public class PunctuationMarkCounter {
    public int count(String phrase){
        int count = 0;
        for (int i = 0; i< phrase.length(); i++){
            char ch = phrase.charAt(i);
            if (ch == '.' || ch == ',' || ch == '!' || ch == ':' || ch == ';') {
                count++;
            }
        }
        return count;
    }
}
