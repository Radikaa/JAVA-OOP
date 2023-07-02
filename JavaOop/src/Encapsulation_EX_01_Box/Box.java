package Encapsulation_EX_01_Box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        chechForNegativeArgument(length, "Lenght");
        this.length = length;
    }

    private void setWidth(double width) {
        chechForNegativeArgument(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        chechForNegativeArgument(height, "Height");
        this.height = height;
    }

    public void chechForNegativeArgument(double argument, String argumentType) {
        if (argument <= 0) {
            throw new IllegalArgumentException(argumentType + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        return 2 * (length * height + width * height + length * width);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume() {
        return width * height * length;
    }
}