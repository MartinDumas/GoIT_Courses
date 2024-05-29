package phrase;

public class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : objects){
            stringBuilder.append(o);
            stringBuilder.append(" ");
        }
        if (stringBuilder.length()> 0 ){
            return stringBuilder.substring(0, stringBuilder.length()-1);
        }else return "";
    }
}
