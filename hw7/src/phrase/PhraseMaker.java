package phrase;

public class PhraseMaker {
    public String join(String[] words){
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words){
           if (word.length()>3){
               stringBuilder.append(word.toLowerCase());
           } else stringBuilder.append(word.toUpperCase());
           stringBuilder.append(" ");

        }
        if (stringBuilder.length()> 0 ){
            return stringBuilder.substring(0, stringBuilder.length()-1);
        }else return "";


    }
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}
