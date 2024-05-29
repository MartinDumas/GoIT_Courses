import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MathDetector {
     public boolean isMath(String text){
         String regex = "\\d+\\s*[+\\-*/]\\s*\\d+";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(text);

         // Перевіряємо, чи рядок відповідає шаблону
         if (matcher.find()) {
             // Додаткова перевірка наявності знака "="
             if (text.contains("=")) {
                 return true;
             }
         }
         return false;

     }
     public static void main(String[] args) {
         //true
         System.out.println(new MathDetector().isMath("2+2=4"));

         //false
         System.out.println(new MathDetector().isMath("1992 is great year"));

         //false
         System.out.println(new MathDetector().isMath("Venus vs Earth"));
     }
}
