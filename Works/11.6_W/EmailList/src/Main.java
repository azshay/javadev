import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        readEmails();
    }

    public static void readEmails() {
        EmailList list = new EmailList();
        Scanner scanner = new Scanner(System.in);
        String userCommand = scanner.nextLine();
        String[] splitedCommand;

        while (true) {
            splitedCommand = userCommand.split(" ");

            if (splitedCommand[0].equalsIgnoreCase("EXIT")) {
                break;
            }

            switch (splitedCommand[0].toLowerCase()) {
                case "add" -> list.addEmail(splitedCommand[1].toLowerCase());
                case "list" -> System.out.println(list.getEmails());
                default -> System.out.println("Введена некорректная комманда!");
            }

            userCommand = scanner.nextLine();
        }
    }
}