//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Fuel cost calculate system");

        int fuelType = 95;
        int amount = 50;
        boolean hasDiscount = amount > 10;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double discount = 0.1;

        String wrongFuelTypeMessage = "Too little fuel indicated!";
        String fuelPriceMessage;

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println("Incorrect fuel type!");
        }

        if (hasDiscount) {
            fuelPrice = fuelPrice - discount * fuelPrice;
        }

        if (amount < 1) {
            System.out.println(wrongFuelTypeMessage);
            amount = 0;
        }

        fuelPriceMessage = "Price of the selected fuel: " + fuelPrice + " rub.";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Total cost: " + totalPrice);
    }
}