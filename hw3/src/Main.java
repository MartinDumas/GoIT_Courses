import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//       new PassportFormCreator().createForms();
//        String[] arr = new HarekCity().createEmptyNameArray();
//        System.out.println(Arrays.toString(arr));
//        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
//        System.out.println(Arrays.toString(ageArray));
//        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
//        String[] toReplace = new String[]{"lopr", "boki"};
//        new HarekCity().fixNames(names, toReplace);
//        System.out.println(Arrays.toString(names));
//        String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
//        System.out.println(new HarekCity().firstAndLastTogether(names));
//        String[] results = new String[]{"miho", "hut"};
//        new HarekCity().changeElectResult(results);
//        System.out.println(Arrays.toString(results));
//        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
//        String[] changedResults = new HarekCity().changeElectResultAgain(results);
//        System.out.println(Arrays.toString(changedResults));
//        char[][] keyboard = new HarekCity().createKeyboard();
//        for (int i = 0; i < keyboard.length; i++) {
//            System.out.println(Arrays.toString(keyboard[i]));
//        }
        new HarekCity().printKeyboard();
        String[] source = new String[]{"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
}


