package generic.diy;

import java.util.Scanner;

public class Application {
    public static void menu() {
        System.out.println("Menu");
        System.out.println("------------------------------");
        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. Get Size");
        System.out.println("4. Check Empty");
        System.out.println("5. Delete");
        System.out.println("6. Exit");
    }
    public static void main(String[] args) {
        GenericCar genericCar = new GenericCar();
        Scanner sc = new Scanner(System.in);
        menu();
        while (true) {
            int choice;
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    genericCar.addCar();
                    menu();
                    break;
                case 2:
                    genericCar.display();
                    menu();
                    break;
                case 3:
                    genericCar.getSize();
                    menu();
                    break;
                case 4:
                    genericCar.checkEmpty();
                    menu();
                    break;
                case 5:
                    genericCar.deleteCar();
                    menu();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
