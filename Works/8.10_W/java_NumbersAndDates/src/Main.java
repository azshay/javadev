public class Main {
    public static void main(String[] args) {
        TrucksAndContainers trucksAndContainers = new TrucksAndContainers(325);

        System.out.println(trucksAndContainers);

        Birthdays birthdays = new Birthdays("17/02/2000");
        System.out.println(birthdays.collectBirthdays());
    }
}