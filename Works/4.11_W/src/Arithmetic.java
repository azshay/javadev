public class Arithmetic {
    private int numberOne;
    private int numberTwo;

    public Arithmetic(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int sum() {
        return numberOne + numberTwo;
    }

    public int multiplication() {
        return numberOne * numberOne;
    }

    public int max() {
        return numberOne > numberTwo ? numberOne : numberTwo;
    }

    public int min() {
        return numberOne < numberTwo ? numberOne : numberTwo;
    }
}
