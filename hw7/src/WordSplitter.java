import java.util.Arrays;

class WordSplitter {
     public String[] split(String phrase) {
         String[] result = phrase.split("\\s+");
         for (int i = 0; i < result.length; i++) {
             result[i] = result[i].toLowerCase();
         }
         return result;

     }
     public static void main(String[] args) {
         WordSplitter wordSplitter = new WordSplitter();

         String[] words = wordSplitter.split("Hello      world");

         //[hello, world]
         System.out.println(Arrays.toString(words));
     }
}
