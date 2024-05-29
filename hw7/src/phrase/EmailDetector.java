package phrase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class EmailDetector {
    public boolean isPresent(String text) {
        // Регулярний вираз для перевірки email-адреси
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern emailPattern = Pattern.compile(emailRegex);

        // Пошук відповідності регулярного виразу у тексті
        Matcher matcher = emailPattern.matcher(text);
        return matcher.find();
    }
}
