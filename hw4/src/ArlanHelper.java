public class ArlanHelper {
    public String drawQuad(int n){
        int count = 0;
        String result = "";
        while(count < n){
            int j = 0;
            while(j < n){
                result += "* ";
                j++;
            }
            result += "\n";
            count++;
        }
        return result;
    }
    public String drawRect(int width, int height, char c){
        String result = "";
        int i = 0;
        while(i<height){
            int j = 0;
            while(j < width){
                result += c;
                j++;
            }
            result += "\n";
            i++;
        }
        return result;
    }
    public String drawLine(int length){
        String result = "";

        while( length >0){
            result += "*";
            length--;
            if (length != 0){
                result += "#";
                length--;
            }
        }
        return result;
    }
    public String drawPattern(char[] pattern, int repeatCount){
        String result = "";
        while (repeatCount > 0) {
            int j = pattern.length;
            int index = 0; // Початковий індекс для проходження по масиву pattern
            while (j > 0) {
                result += pattern[index]; // Додаємо символ до результату
                j--;
                index++; // Збільшуємо індекс для наступної ітерації
                if (index == pattern.length) {
                    index = 0;
                    // Перевірка на випадок, якщо досягнуто кінця масиву pattern, повертаємося на початок
                }
            }
            repeatCount--;
        }
        return result;
    }


    public static void main(String[] args) {
       ArlanHelper helper = new ArlanHelper();
//       System.out.println(helper.drawQuad(5));
//       System.out.println(helper.drawRect(2, 3, 'c'));
//        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
    }

