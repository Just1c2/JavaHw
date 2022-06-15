package examjava;

import examjava.entity.Student;
import examjava.model.StudentList;
//import examjava.model.StudentListHashMap;
//import examjava.model.StudentListHashSet;
//import examjava.model.StudentListLinkedList;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

import static examjava.model.StudentList.addStudent;

//import static examjava.model.StudentList.*;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static StudentList list;

    public static void menu() {
        System.out.println("1. Add a new student to the list");
        System.out.println("2. Update a student");
        System.out.println("3. Delete a student from the list");
        System.out.println("4. Search student");
        System.out.println("5. Display all student");
        System.out.println("6. Save to file");
        System.out.println("7. Load from file");
        System.out.println("8. Exit");
    }

    public static void main(String[] args) throws IOException {
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
                    StudentList.updateStudent();
                    menu();
                    break;
                case 3:
                    deleteStudent();
                    menu();
                    break;
                case 4:
                    searchByRollNumber();
                    menu();
                    break;
                case 5:
                    StudentList.showList();
                    menu();
                    break;
                case 6:
                    StudentList.writeStudent();
                    menu();
                    break;
                case 7:
                    StudentList.readStudent();
                    menu();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
    public static void searchByRollNumber() throws IOException {
        int rollNumber;
        System.out.println("Enter student roll number: ");
        rollNumber = input.nextInt();
        Student s = StudentList.findByRollNumber(rollNumber);
        if (s == null) {
            System.out.println("Not found");
        } else {s.printInfo();}
    }

    public static void deleteStudent() throws IOException {
        int rollNumber;
        System.out.println("Enter the student's roll number which you want to delete: ");
        rollNumber = input.nextInt();
        list.remove(rollNumber);
    }
}
