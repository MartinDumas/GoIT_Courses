import java.util.Scanner;

public class MoonComputerTests {
    Scanner scanner = new Scanner(System.in);
//    public void testBasicInputOutput() {
//
//        String line = scanner.nextLine();
//        System.out.println(line);
//        scanner.close();
//    }
    public void testMath(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d %d %d %d", a+b, a-b, a*b, a/b);
        scanner.close();
    }
    public void testLogicalOperators(){
        boolean x = scanner.nextBoolean();
        boolean y = scanner.nextBoolean();
        boolean z = scanner.nextBoolean();
        System.out.println(x&&y&&z);
        System.out.print(x||y||z);
        scanner.close();
    }
}
