public class RAM {

    private final String type;
    private final int volume;
    private final int weight;

    public RAM(String type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "[Type: " + type + ", Volume: " + volume +
                ", Weight: " + weight + "]";
    }
}
