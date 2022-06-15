package exam15june.flight;

import java.util.ArrayList;
import  java.util.Scanner;

public class Flight {
    static ArrayList<Flight> list;
    static Scanner sc = new Scanner(System.in);
    public static int number = 0;
    private static String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public static int getNumber() {
        return number;
    }

    public static String getDestination() {
        return destination;
    }

    public static void display() {
        System.out.println(getNumber() + ", " + getDestination());
    }

    public static void addFlight(){
        int number = 0;
        String d ;
        System.out.println("Nhập flight number ");
        number = sc.nextInt();
        if (number <= 0 ){
            System.out.println("Flght number should be > 0");
        } else if (number >0) {
            System.out.println("Enter destination:  ");
            d = sc.next();
            Flight f = new Flight(number,d);
            list.add(f);
        }
    }


}
