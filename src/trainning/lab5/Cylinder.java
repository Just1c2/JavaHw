package trainning.lab5;

public class Cylinder extends Circle {
    public void setHeight(double height) {
        this.height = height;
    }

    private double height;
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return pi * radius * 2 * height;
    }
    public double getArea() {
        return (radius * radius * 2 * 2) + (height * radius * 2 * pi);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
