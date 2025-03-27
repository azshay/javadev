import java.util.TreeSet;

public class EmailList {
    private TreeSet<String> emails;

    public EmailList() {
        emails = new TreeSet<>();
    }

    private boolean checkEmail(String email) {
        String regex = "[a-zA-Z-_.0-9]+@[a-zA-Z-_.0-9]+\\.[a-zA-Z]+";

        return email.matches(regex);
    }

    public boolean addEmail(String email) {
        return checkEmail(email) ? emails.add(email) : false;
    }

    public String getEmails() {
        String result = "";

        for (String email : emails) {
            result = result.concat(email + "\n");
        }

        return result;
    }
}
