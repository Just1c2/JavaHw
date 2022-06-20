package grassignment;

import grassignment.entity.Product;
import grassignment.model.ProductList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static grassignment.model.ProductList.*;
import static mqltest.ConnectionExample.deleteProduct;

public class ProductApplication {
    private static Scanner input = new Scanner(System.in);


    public static void menu() {
        System.out.println("1. Add a new product");
        System.out.println("2. Update a product");
        System.out.println("3. Delete product");
        System.out.println("4. View all product");
        System.out.println("5. Search product by id");
        System.out.println("6. Search product by name");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) throws SQLException {
        menu();
        while (true) {
            int choice;
            System.out.println("#: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    menu();
                    break;
                case 2:
                    ProductList.updateProduct();
                    menu();
                    break;
                case 3:
                    deleteProduct();
                    menu();
                    break;
                case 4:
                    showListProduct();
                    menu();
                    break;
                case 5:
                    findProductById();
                    menu();
                    break;
                case 6:
                    findProductByName();
                    menu();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
