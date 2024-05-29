package phrase;

 class PalindromeCounter {
     public int count(String phrase) {
         // Розділяємо фразу на слова
         String[] words = phrase.split(" ");
         int palindromeCount = 0;

         // Перевіряємо кожне слово на паліндромність
         for (String word : words) {
             if (isPalindrome(word)) {
                 palindromeCount++;
             }
         }

         return palindromeCount;
     }

     // Метод для перевірки, чи є слово паліндромом
     private boolean isPalindrome(String word) {
         int left = 0;
         int right = word.length() - 1;

         while (left < right) {
             if (word.charAt(left) != word.charAt(right)) {
                 return false;
             }
             left++;
             right--;
         }

         return true;
     }
}
