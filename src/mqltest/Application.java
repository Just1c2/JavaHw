package mqltest;

import mqltest.dao.DaoProduct;
import mqltest.entities.Product;
import mqltest.model.CrudProduct;

import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    static CrudProduct crudProduct;

    static {
        try {
            crudProduct = new CrudProduct();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static void menu() {
        System.out.println("MENU");
        System.out.println("------------------------");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Display all");
        System.out.println("4. Display one");
        System.out.println("5. Update");
        System.out.println("6. Exit");
    }
    public static void main(String[] args) throws SQLException {

        menu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice;
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    add();
                    menu();
                }
                case 2 -> {
                    delete();
                    menu();
                }
                case 3 -> {
                    displayAll();
                    menu();
                }
                case 4 -> {
                    displayOne();
                    menu();
                }
                case 5 -> {
                    update();
                    menu();
                }
                case 6 -> System.exit(0);
            }
        }
    }
    public static void add() throws SQLException {
        int id = 0;
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        System.out.println("Enter qty: ");
        int qty = sc.nextInt();
        System.out.println("Enter desc: ");
        String desc = sc.next();
        Product product = new Product(id,name,price,qty,desc);
        crudProduct.insert(product);
    }
    public static void displayAll() throws SQLException {
        crudProduct.getAll();
        System.out.println();
    }
    public static void displayOne() throws SQLException {
        int id;
        System.out.println("Enter id: ");
        id = sc.nextInt();
        crudProduct.select(id);
    }
    public static void update() throws SQLException {
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        System.out.println("Enter qty: ");
        int qty = sc.nextInt();
        System.out.println("Enter desc: ");
        String desc = sc.next();
        Product product = new Product(id,name,price,qty,desc);
        crudProduct.update(product);
    }
    public static void delete() throws SQLException {
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        crudProduct.delete(id);
    }
}
