package phrase;

public class NameParser {
    public String parse(String[] names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String fullName : names) {
            // Розділяємо рядок на окремі слова
            String[] parts = fullName.split("\\s+");
            // Беремо перше слово (перше ім'я) з кожного рядка
            String firstName = parts[0];
            // Додаємо перше ім'я до stringBuilder
            stringBuilder.append(firstName);
            stringBuilder.append(", ");
        }
        // Перевіряємо, чи є щось у stringBuilder перед виведенням результату
        if (stringBuilder.length() > 0) {
            // Видаляємо останній пробіл і кому перед поверненням результата
            return stringBuilder.substring(0, stringBuilder.length() - 2);
        } else {
            return ""; // Повертаємо порожній рядок, якщо stringBuilder порожній
        }
    }
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
