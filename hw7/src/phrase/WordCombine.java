package phrase;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        int count = 0;
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();
        for (char s1 : targetWord.toCharArray()){
            for (char s2 : sourceWord.toCharArray()){
                if (Character.valueOf(s2).equals(Character.valueOf(s1))){
                    count++;
                }

            }
        }
        if (count == targetWord.length()){
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
