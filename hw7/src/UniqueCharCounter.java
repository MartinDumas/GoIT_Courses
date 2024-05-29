 class UniqueCharCounter {
    public int count(String phrase){
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            // Перевіряємо, чи символ уже є в uniqueChars
            if (uniqueChars.indexOf(String.valueOf(ch)) == -1) {
                uniqueChars.append(ch); // Додаємо символ, якщо він унікальний
            }
        }
        return uniqueChars.length();
    }
}
