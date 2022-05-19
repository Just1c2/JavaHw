package trainning.lab4.ex1;

public class Triangle extends Shape {
    private double base;
    private double height;
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return base * height * 0.5;
    }

    @Override
    public String toString() {
        return "The area of this triangle is: " + getArea();
    }
}
