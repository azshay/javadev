import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Birthdays {

    private final LocalDate birthdayDate;

    public Birthdays(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        birthdayDate = LocalDate.parse(date, formatter);

    }

    public String collectBirthdays() {
        int year = birthdayDate.getYear();
        int month = birthdayDate.getMonthValue();
        int day = birthdayDate.getDayOfMonth();

        String result = "";
        LocalDate birthday;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int i = year; i < LocalDate.now().getYear(); i++) {
            birthday = LocalDate.of(i, month, day);
            result = result.concat((i - year) + " - " +
                    formatter.format(birthday) +
                    " - " + birthday.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + "\n");
        }

        birthday = LocalDate.of(year, month, day);

        if (LocalDate.now().compareTo(LocalDate.of(LocalDate.now().getYear(), month, day)) >= 0) {
            result = result.concat(LocalDate.now().getYear() - birthday.getYear() + " - " +
                    formatter.format(LocalDate.of(LocalDate.now().getYear(), month, day)) +
                    " - " + birthday.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + "\n");
        }

        return result;
    }
}
