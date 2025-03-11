import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);

        while (true) {
            int attempt = new Scanner(System.in).nextInt();

            if (attempt < value) {
                System.out.println("Загаданное число больше!");
            } else if (attempt > value) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}