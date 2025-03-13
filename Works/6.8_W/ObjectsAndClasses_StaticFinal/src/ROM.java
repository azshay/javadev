public class ROM {

    private final ROMType type;
    private final int volume;
    private final int weight;

    public ROM(ROMType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public ROMType getType() {
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
