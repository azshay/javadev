import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String phone1 = "+7 903 712-37-54";
//        String phone2 = "7 (903) 968-60-45";
//        String phone3 = "7999-666-66-66";
//        String phone4 = "7(903)9616245";
//
//        System.out.println(formatPhoneNumber(phone1));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String userText = scanner.nextLine();

        System.out.println(numerator(userText));
    }

    public static StringBuilder numerator(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        int lengthNumber = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(" ", i) != -1) {
                stringBuilder.append("(").append(lengthNumber).append(") ")
                        .append(text, i, text.indexOf(" ", i))
                        .append(" ");
                i = text.indexOf(" ", i);
                lengthNumber++;
                System.out.println(stringBuilder);
            } else {
                stringBuilder.append("(").append(lengthNumber).append(") ")
                        .append(text, i, text.length());
                i = text.length();
            }
        }

        return stringBuilder;
    }
//    public static String formatPhoneNumber(String phone) {
//        String regex = "[^0-9]";
//        return phone.replaceAll(regex, "");
//    }
}