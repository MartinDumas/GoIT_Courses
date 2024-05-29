import java.util.Scanner;

public class PassportFormCreator {
    Scanner scanner = new Scanner(System.in);
    public void createForms(){
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt()*10;
        System.out.printf("%s %s %d", name, surname, age);
        System.out.println();
        System.out.println(name.toUpperCase() +"\n" + surname.toUpperCase()+ "\n" + age);
        scanner.close();

    }

}
