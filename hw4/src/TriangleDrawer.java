public class TriangleDrawer {
    public String drawTriangle(int side) {
        String result = "";
        int i = side;

        // Верхня частина трикутника
        while (i >= 1) {
            int j = 1;

            // Додаємо зірочки для поточного рядка
            while (j <= i) {
                result += "*";
                j++;
            }

            // Переходимо на новий рядок
            result += "\n";
            i--;
        }

        return result;
    }
    public static void main(String[] args) {
        TriangleDrawer drawer = new TriangleDrawer();
        System.out.println(drawer.drawTriangle(5));
    }

}



