//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= katyaAge) {
            if (vasyaAge >= mishaAge) {
                max = vasyaAge;
                if (mishaAge >= katyaAge) {
                    middle = mishaAge;
                    min = katyaAge;
                } else {
                    middle = katyaAge;
                    min = mishaAge;
                }
            } else if (katyaAge >= mishaAge) {
                max = katyaAge;
                if (vasyaAge >= mishaAge) {
                    middle = vasyaAge;
                    min = mishaAge;
                } else {
                    middle = mishaAge;
                    min = vasyaAge;
                }
            } else {
                max = mishaAge;
                if (vasyaAge >= katyaAge) {
                    middle = vasyaAge;
                    min = katyaAge;
                } else {
                    middle = katyaAge;
                    min = vasyaAge;
                }
            }
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}