public record Dimensions(double width,
                         double height, double length) {

    public double calculateVolume() {
        return width * height * length;
    }

}
