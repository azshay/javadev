//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer computer_1 = new Computer(new Processor(3800, 4, "Intel", 600),
                new RAM("DDR5", 128, 100),
                new ROM(ROMType.SSD, 294, 200),
                new Display(21, DisplayType.IPS, 300.5),
                new Keyboard("MECHANICAL", true, 2000),
                "APPLE", "MAGIC PC FROM CUPERTINO");

        Computer computer_2 = new Computer(new Processor(2600, 6, "AMD", 900),
                new RAM("DDR4", 64, 400),
                new ROM(ROMType.HDD, 449, 100),
                new Display(19, DisplayType.TN, 400.9),
                new Keyboard("MEMBRANE", false, 1500),
                "HUAWEI", "MAGIC PC FROM CHINA 2.0");

        System.out.println(computer_1.toString() + "\n");
        System.out.println(computer_2.toString() + "\n");
        System.out.println(computer_1.getTotalWeight() + "\n");
        System.out.println(computer_2.getTotalWeight() + "\n");

    }
}