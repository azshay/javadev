public class Display {

    private final double diagonal;
    private final DisplayType type;
    private final double weight;

    public Display(double diagonal, DisplayType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public DisplayType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "[Diagonal: " + diagonal + ", Type: " + type
                + ", Weight: " + weight + "]";
    }
}
