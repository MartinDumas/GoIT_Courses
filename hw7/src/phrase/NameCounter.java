package phrase;

public class NameCounter {
    public int count(String text) {
        // Розбиваємо текст на слова за пробілами
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            // Перевіряємо, чи слово має хоча б дві літери
            if (word.length() >= 2) {
                // Перевіряємо, чи перша літера велика, а решта маленькі
                if (Character.isUpperCase(word.charAt(0)) &&
                        word.substring(1).equals(word.substring(1).toLowerCase())) {
                    count++;
                }
            }
        }

        return count;
    }
}
