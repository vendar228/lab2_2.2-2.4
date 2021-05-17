import java.util.Scanner;

public class MethodNewton {
    static double eps = 0.0000001;
    public static double fx(double x) {
        return (x * x * x - 4 * x * x - 7 * x + 10);
    }
    public static double dfx(double x) {
        return (3 * x * x - 8 * x - 7);
    }

    public static double solve(double x0) {
        double x1 = x0 - fx(x0) / dfx(x0);
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = x0 - fx(x0) / dfx(x0);
        }
        return x1;
    }

    public static void solveRec(double x0, double x1) {
        System.out.println(x1);
        x1 = x0 - fx(x0) / dfx(x0);
        if (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = x0 - fx(x0) / dfx(x0);
            solveRec(x0, x1);
        }
    }

    public static void solveRecTwo(double x0) {
        double x1 = x0 - fx(x0) / dfx(x0);
        System.out.println(x1);
        x1 = x0 - fx(x0) / dfx(x0);
        if (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = x0 - fx(x0) / dfx(x0);
            solveRec(x0, x1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x0");
        double x0 = sc.nextDouble();
        System.out.println("Нахождение корня через цикл");
        System.out.println(solve(x0));
        System.out.println("Нахождение корня с применением рекурсивного алгоритма");
        double x1 = x0 - fx(x0) / dfx(x0);
        solveRec(x0, x1);
        solveRecTwo(x0);
    }
}
