package trainning.lab5;

public class Circle {
    public double radius;
    private String color;
    public double pi = 3.14;
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius * radius * pi;
    }
    public String toString() {
        return "The value is ";
    }
}
