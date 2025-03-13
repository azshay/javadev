//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= Character.MAX_VALUE; i++) {
            if (((char) i >= 'А' && (char) i <= 'а') || (char) i == 'ё' || (char) i == 'Ё') {
                System.out.println("[" + i + "] - [" + (char) i + "]");
            }
        }
    }
}