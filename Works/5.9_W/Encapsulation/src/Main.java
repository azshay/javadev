import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }

        Cargo firstCargo = new Cargo(new Dimensions(100.23, 203.34, 203.404), 22.4,
                "Башкортостан, Уфа, ул. Рихарда Зорге 19/5", true, 1, true);

        Cargo secondCargo = firstCargo.setDeliveryAddress("Башкортостан, Уфа, ул. Рихарда Зорге 19/4");
        secondCargo = secondCargo.setDimensions(new Dimensions(2,5,6));
        secondCargo = secondCargo.setWeight(404);


        System.out.println("Адрес до изменения: " + firstCargo.getDeliveryAddress()
                + ". После изменения: " + secondCargo.getDeliveryAddress());
        System.out.println(secondCargo.getDimensions().height() + " " + secondCargo.getWeight());

    }
}