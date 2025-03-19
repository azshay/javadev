import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        String text = "English texts for beginners to practice reading " +
                "and comprehension online and for free. " +
                "Practicing your comprehension of written English will both improve " +
                "your vocabulary and understanding of grammar and word order. 10 The texts below are " +
                "designed to help you develop while giving you an instant evaluation of your progress.";

        // Scanner scanner = new Scanner(System.in);

        System.out.println(splitText(text));
    }

    public static String splitText(String text) {
        String regex = "[,.0-9\\s]+";

        return text.replaceAll(regex, "\n");
    }
}
