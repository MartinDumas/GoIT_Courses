package phrase;

class SummaryCreator {
    public String create(String text) {
        if (text.length() > 15) {
            String result = text.substring(0, 15);
            if (result.endsWith(" ")) {
                return result.trim();
            } else {
                return result + "...";
            }
        }
        return text;
    }
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }

}
