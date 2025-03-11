import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }
}