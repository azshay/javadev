import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Введите число и нажмите <Enter>: ");
//        double value = new Scanner(System.in).nextDouble();
//        square(value);

        calculateTriangleSquare(3, 4, 5);
    }

//    public static void square(double value) {
//        System.out.println(value * value);
//    }

    public static void calculateTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(
                p * (p - a) * (p - b) * (p - c)
        );
        System.out.println(square);
    }
}