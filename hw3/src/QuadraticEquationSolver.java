import java.util.Arrays;

public class QuadraticEquationSolver {
        public double[] solve(int a, int b, int c){
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d > 0) {
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                return new double[]{x1, x2};
            } else if (d == 0) {
                double x = -b / (2.0 * a);
                return new double[]{x};
            } else {
                return new double[]{};
            }
        }


    public static void main(String[] args) {
        QuadraticEquationSolver solver= new QuadraticEquationSolver();
        double[] arr = solver.solve(10,-110,180);
        System.out.println(Arrays.toString(arr));


    }
}
