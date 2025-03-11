//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int filled = 0;
        int time = 0;

        while (filled < volume) {
            filled += fillingSpeed - devastationSpeed;
            time += 1;
        }

        System.out.println(time + " min.");
    }
}