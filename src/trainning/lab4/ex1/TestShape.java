package trainning.lab4.ex1;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(3.5);
        rectangle.setWidth(2);
        System.out.println(rectangle.toString());
        Triangle triangle = new Triangle();
        triangle.setBase(3.5);
        triangle.setHeight(5.2);
        System.out.println(triangle.toString());
    }
}
