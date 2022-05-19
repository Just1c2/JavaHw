package trainning.lab4.ex1;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public double getLength() {
        return this.length;
    }
    public void setLength( double value) {
        this.length = value;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double value) {
        this.width = value;
    }
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "The area of this rectangle is: " + getArea();
    }
}
