import java.lang.reflect.Array;
import java.util.Arrays;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result={};
        return result;
    }
    public int[] createAgeArray(int age1, int age2, int age3, int age4){
        int[] result = {age1, age2, age3, age4};
        return result;
    }
    public void fixNames(String[] names, String[] toReplace){
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }
    public String firstAndLastTogether(String[] names){
        String result = names[0]+ " AND "+ names[names.length-1]+ " TOGETHER";
        return result;
    }
    public void changeElectResult(String[] results){
        String temp = results[0];
        results[0]= results[results.length-1];
        results[results.length-1]= temp;
    }
    public String[] changeElectResultAgain(String[] results){
        String[] changedResults = {results[2],results[3], results[4], };
        return changedResults;
    }
    public char[][] createKeyboard(){
      return new char[][]{
              {'1', '2', '3'},
              {'4', '5', '6'},
              {'7', '8', '9'},
              {'*', '0', '#'}
      };
    }
    public void printKeyboard(){
        char[][] keyboard = createKeyboard();
        System.out.println(Arrays.toString(keyboard[0]));
        System.out.println(Arrays.toString(keyboard[1]));
        System.out.println(Arrays.toString(keyboard[2]));
        System.out.println(Arrays.toString(keyboard[3]));

    }
    public String[] makeCopy(String[] names){
        String[] nameCopy = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return nameCopy;
    }
}
