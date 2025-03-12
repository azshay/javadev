public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public String getCurrentFloorToString() {
        return "Текущий этаж: " + currentFloor;
    }

    private void moveDown() {
        currentFloor -= currentFloor > minFloor ? 1 : 0;
        System.out.println(getCurrentFloorToString());
    }

    private void moveUp() {
        currentFloor += currentFloor < maxFloor ? 1 : 0;
        System.out.println(getCurrentFloorToString());
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Такого этажа не существует! " +
                    "Проверьте корректность ввода.");
            return;
        }

        while (currentFloor < floor) {
            moveUp();
        }

        while (currentFloor > floor) {
            moveDown();
        }
    }
}
