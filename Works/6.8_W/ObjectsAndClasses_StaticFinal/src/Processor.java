public class Processor {

    private final int frequency;
    private final int core;
    private final String manufacturer;
    private final double weight;

    public Processor(int frequency, int core, String manufacturer, double weight) {
        this.frequency = frequency;
        this.core = core;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int core() {
        return core;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "[Frequency: " + frequency + ", Cores: " + core +
                ", Manufacturer: " + manufacturer + ", Weight: " + weight + "]";
    }
}
