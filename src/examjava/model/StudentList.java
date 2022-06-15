package examjava.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import examjava.entity.Student;

import java.util.Scanner;

import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//import static examjava.model.StudentListLinkedList.writeStudent;

public class StudentList {
    static ArrayList<Student> students = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void writeStudent() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Writer writer = Files.newBufferedWriter(Paths.get("StudentList.json"));

        gson.toJson(students, writer);

        writer.close();
    }

    public static void readStudent() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("StudentList.json");
        students = gson.fromJson(reader, new TypeToken<List<Student>>(){}.getType());

        reader.close();
    }

    public static void addStudent() throws IOException {
        int id = 0;
        String fn;
        int age;
        double mark;
        System.out.println("Enter student roll number: ");
        id = input.nextInt();
        System.out.println("Enter student's name: ");
        fn = input.next();
        System.out.println("Enter student's age: ");
        age = input.nextInt();
        System.out.println("Enter student's mark: ");
        mark = input.nextDouble();
        Student s = new Student(id, fn, age, mark);
        students.add(s);
        writeStudent();
    }

    public void remove(int rollNumber) throws IOException {
        boolean b = false;
        for (Student s: students) {
            if (s.getRollNumber() == rollNumber) {
                int choice;
                System.out.println("Are you sure about deleting this student? (1.Yes 2.No)");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1)
                    students.remove(s);
                b = true;
            }
        }
        if (b == false) {
            System.out.println("Cannot find student with roll number " + rollNumber);
        }
    }



    public static Student findByRollNumber(int rollNumber) throws IOException {
        readStudent();
        for (Student s: students) {
            if (s.getRollNumber() == rollNumber) {
                return s;
            }
        }
        return null;
    }

    public static void showList() {
        for (Student s: students) {
            s.printInfo();
        }
    }

    public static void updateStudent() {
        String name;
        int age;
        double mark;
        System.out.println("Enter student id: ");
        int rollNumber = input.nextInt();
        for (Student a : students) {
            if (a.getRollNumber() == rollNumber) {
                System.out.println("Student roll number: " + rollNumber);
                System.out.println("Name : " + a.getName());
                System.out.println("Enter new name: ");
                name = input.next();
                a.setName(name);
                System.out.println("Enter new age: ");
                age = input.nextInt();
                a.setAge(age);
                System.out.println("Enter new mark: ");
                mark = input.nextDouble();
                a.setMark(mark);
            }
        }
    }

}
