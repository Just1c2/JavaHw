package trainning.studentmangement.entity;

import java.util.Scanner;

public class Student1 {
    private int id;
    private String firstName;
    private String lastName;
    private double mark;

    public Student1() {
    }

    public Student1(int id, String firstName, String lastName, double mark) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void scanInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        this.id = scanner.nextInt();
        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter mark: ");
        this.mark = scanner.nextDouble();
    }

    public void printInfo() {
        System.out.printf("%3d|%10s%10s|%5f\n", getId(), getFirstName(), getLastName(), getMark());
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMark() {
        return mark;
    }
}
