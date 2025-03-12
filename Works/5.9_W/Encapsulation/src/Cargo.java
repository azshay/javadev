public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean canBeTurnedOver;
    private final int regNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress,
                 boolean canBeTurnedOver, int regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canBeTurnedOver = canBeTurnedOver;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isCanBeTurnedOver() {
        return canBeTurnedOver;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress,
                canBeTurnedOver, regNumber, isFragile);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress,
                canBeTurnedOver, regNumber, isFragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress,
                canBeTurnedOver, regNumber, isFragile);
    }
}
