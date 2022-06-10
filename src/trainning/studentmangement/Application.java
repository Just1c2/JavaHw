package trainning.studentmangement;

import trainning.studentmangement.model.StudentList;
import trainning.studentmangement.entity.Student;

import java.io.IOException;
import java.util.*;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static StudentList list;

    public static void menu() {
        System.out.println("1. Add a new student to the list");
        System.out.println("2. Delete a student from the list");
        System.out.println("3. Search by name");
        System.out.println("4. Search by id");
        System.out.println("5. Print student info in descending order of mark");
        System.out.println("6. Print student info in order of name");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) throws IOException, ConcurrentModificationException {
        list = new StudentList();
        menu();

        while (true) {
            int choice;
            System.out.println("#: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    menu();
                    break;
                case 2:
                    deleteStudent();
                    menu();
                    StudentList.writeStudent();
                    break;
                case 3:
                    searchByName();
                    menu();
                    break;
                case 4:
                    searchById();
                    menu();
                    break;
                case 5:
                    printSorted();
                    menu();
                    break;
                case 6:
                    printSortedByName();
                    menu();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

    public static void addStudent() throws IOException {
        int id = 0;
        String fn;
        String ln;
        double mark;
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        System.out.println("Enter first name: ");
        fn = input.next();
        System.out.println("Enter last name: ");
        ln = input.next();
        System.out.println("Enter mark: ");
        mark = input.nextDouble();
        Student s = new Student(id, fn, ln, mark);
        list.add(s);
        StudentList.writeStudent();
    }

    public static void deleteStudent() throws IOException {
        int id;
        System.out.println("Enter student id: ");
        id = input.nextInt();
        list.remove(id);
    }
    public static void searchByName() throws IOException {
        String name;
        System.out.println("Enter a name: ");
        name = input.next();
        ArrayList<Student> found = list.findByName(name);
        list.showList(found);
    }

    public static void searchById() throws IOException {
        int id;
        System.out.println("Enter an ID: ");
        id = input.nextInt();
        Student s = list.findById(id);
        if (s == null) {
            System.out.println("Not found");
        } else {s.printInfo();}
    }

    public static void printSorted() throws IOException {
        list.sortByMarks();
        list.showList();
    }
    public static void printSortedByName() throws IOException {
        list.sortByName();
        list.showList();
    }
}
