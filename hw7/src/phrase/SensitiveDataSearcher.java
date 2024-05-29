package phrase;

 class SensitiveDataSearcher {
     public boolean isSensitiveDataPresent(String phrase){
         String[] words = phrase.split("\\W+");

         for (String word : words){
             if (word.equalsIgnoreCase("pass") || word.equalsIgnoreCase("key") ||  word.equalsIgnoreCase("login") || word.equalsIgnoreCase("email")){
                 return true;
             }
         }
         return false;

     }
     public static void main(String[] args) {
         SensitiveDataSearcher searcher = new SensitiveDataSearcher();

         //false
         System.out.println(searcher.isSensitiveDataPresent("Hello world"));

         //true
         System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
     }
}
