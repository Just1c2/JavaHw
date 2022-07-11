package exam11thjuly;

import exam11thjuly.entity.Book;
import exam11thjuly.model.BookList;

import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);
    public static void menu() {
        System.out.println("MENU");
        System.out.println("---------------------");
        System.out.println("1. Add book records");
        System.out.println("2. Save");
        System.out.println("3. Display book records");
        System.out.println("4. Exit");
    }
    public static void main(String[] args) throws SQLException {
        Book book = new Book();
        BookList bookList = new BookList();
        System.out.println("Your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                bookList.add(book);
                menu();
                break;
            case 2:
                bookList.insert(book);
                menu();
                break;
            case 3:
                bookList.getAll();
                menu();
                break;
            case 4:
                System.exit(0);
        }
    }
}
