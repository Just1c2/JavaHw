package generic.diy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericCar {
    LinkedList<Car> carList = new LinkedList<Car>();
    Scanner sc = new Scanner(System.in);
    public void addCar() {
        String name;
        int price;
        String production;
        System.out.println("Enter the car name: ");
        name = sc.next();
        if (!name.matches(".*[a-zA-Z].*")) {
            System.out.println("Please reenter the car name: ");
            name = sc.next();
        }
        System.out.println("Enter the car price: ");
        price = sc.nextInt();
        System.out.println("Enter the car production: ");
        production = sc.next();
        Car s = new Car(name, price, production);
        carList.add(s);
    }

    public void deleteCar() {
        String name;
        System.out.println("Enter car's name you want to delete: ");
        name = sc.next();
        Iterator iterator = carList.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            if (str.equals(name)) {
                iterator.remove();
                System.out.println("Delete successfully!");
            } else {
                System.out.println("Can't find any car has that name!");
            }
        }
    }

    public void display() {
        for (Car s : carList
             ) {
            s.printList();
        }
    }

    public void getSize() {
        if (carList.size() == 1) {
            System.out.println("There is only 1 car at the moment!");
        } else {
            System.out.println("There is " + carList.size() + " at the moment!");
        }
    }
    public void checkEmpty () {
        if (carList.size() == 0) {
            System.out.println("There is no car at the moment!");
        } else {
            System.out.println("There are maybe some cars at the moment!");
        }
    }

}
