public class TrucksAndContainers {
    // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
    // пример вывода при вводе 2
    // для отступа используйте табуляцию - \t


        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

    public final static int TRUCK_LOAD_CAPACITY = 12; // CONTAINERS
    public final static int NUMBER_OF_BOXES = 27; // IN A CONTAINER
    private int countBoxes = 0;

    public TrucksAndContainers(int countBoxes) {
        this.countBoxes = countBoxes;
    }

    public int getCountBoxes() {
        return countBoxes;
    }

    private int calcContainerCount() {
        return countBoxes % NUMBER_OF_BOXES == 0 ?
                countBoxes / NUMBER_OF_BOXES :
                (countBoxes / NUMBER_OF_BOXES) + 1;
    }

    private int calcTrucksCount() {
        return calcContainerCount() % TRUCK_LOAD_CAPACITY == 0 ?
                (calcContainerCount() / TRUCK_LOAD_CAPACITY):
                (calcContainerCount() / TRUCK_LOAD_CAPACITY) + 1;
    }

    @Override
    public String toString() {
        String result = "";
        int trucksNeed = calcTrucksCount();
        int boxesNeed = calcContainerCount();

        for (int i = 0; i < trucksNeed; i++) {
            result = result.concat("Truck: " + (i + 1) + "\n");

            for (int j = i * TRUCK_LOAD_CAPACITY; j < boxesNeed && j < (i + 1) * TRUCK_LOAD_CAPACITY; j++) {
                result = result.concat("\tContainer: " + (j + 1) + "\n");

                for (int k = j * NUMBER_OF_BOXES; k < countBoxes && k < (j + 1) * NUMBER_OF_BOXES; k++) {
                    result = result.concat("\t\tBox: " + (k + 1) + "\n");
                }
            }
        }

        return result;
    }
}
