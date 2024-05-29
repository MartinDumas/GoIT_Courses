package phrase;

public class DoubleSpaceCleaner {
    public String clean(String phrase) {
      StringBuilder stringBuilder = new StringBuilder();
      boolean prevSpace = false;
        for (char ch : phrase.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                if (prevSpace) {
                    continue;
                }
                prevSpace = true;
            } else {
                prevSpace = false;
            }
            stringBuilder.append(ch);
            }
        return stringBuilder.toString().strip();

        }


    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
    }

