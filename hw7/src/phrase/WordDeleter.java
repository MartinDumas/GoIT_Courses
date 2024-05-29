package phrase;

class WordDeleter {
    public String remove(String phrase, String[] words) {
        // Розділити рядок на окремі слова
        String[] phraseWords = phrase.split(" ");
        StringBuilder result = new StringBuilder();

        // Перевіряємо кожне слово в рядку
        for (String word : phraseWords) {
            boolean shouldRemove = false;
            // Перевіряємо, чи поточне слово належить до слів, які потрібно видалити
            for (String removeWord : words) {
                if (word.equals(removeWord)) {
                    shouldRemove = true;
                    break;
                }
            }
            // Якщо слово не має бути видалено, додаємо його до результату
            if (!shouldRemove) {
                result.append(word).append(" ");
            }
        }
        // Повертаємо результат, видаливши останній пробіл
        return result.toString().trim();
    }
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("yhypno ycly ibfe coe egces zyryzai matajilyh", new String[] {"yhypno, egces, coe, ibfe, ycly"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
