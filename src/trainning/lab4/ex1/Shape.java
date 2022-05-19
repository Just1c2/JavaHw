package trainning.lab4.ex1;

public abstract class Shape {
    private String color;
    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public String toString(){
        return "The area of this shape is " + getArea();
    }
}
