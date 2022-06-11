package trainning.studentmangement.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import trainning.filedemo.Customer;
import trainning.studentmangement.entity.Student;

import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StudentList {
    static ArrayList<Student> list = new ArrayList<>();
    private int length;

    public StudentList() {
        list.add(new Student(1, "Hieu", "Vu", 9));
        list.add(new Student(2, "Huy", "Vu", 8));
        list.add(new Student(3, "Quan", "Cao", 8));
        list.add(new Student(4, "Thanh", "Minh", 9));
        list.add(new Student(5, "Hung", "Nguyen", 6));
        list.add(new Student(6, "Khanh", "Bui", 5));
        list.add(new Student(7, "Huy", "Tran", 7));
        list.add(new Student(21, "Minh", "Tran", 4));
        list.add(new Student(22, "Duc", "Nguyen", 7));
        list.add(new Student(10, "Duy", "Nguyen", 8));
        list.add(new Student(11, "Manh", "Nguyen", 9));
        list.add(new Student(12, "Hong", "Vu", 6));
        list.add(new Student(13, "Tung", "Tran", 4));
        list.add(new Student(14, "Thuong", "Tran", 5));
        list.add(new Student(15, "Thao", "Nguyen", 7));
        list.add(new Student(16, "Nga", "Nguyen", 8));
        list.add(new Student(17, "Manh", "Vu", 8));
        list.add(new Student(18, "Hung", "Tran", 9));
        list.add(new Student(19, "Trung", "Vu", 9));
        list.add(new Student(20, "Hien", "Vu", 9));

    }

    public static void writeStudent() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Writer writer = Files.newBufferedWriter(Paths.get("StudentList.json"));

        gson.toJson(list, writer);

        writer.close();
    }

    public static void readStudent() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("StudentList.json");
        list = gson.fromJson(reader, new TypeToken<List<Student>>(){}.getType());

        reader.close();
    }
    public ArrayList<Student> findByName(String name) throws IOException {
        readStudent();
        boolean found = false;
        ArrayList<Student> matches = new ArrayList<>();
        for (Student s: list) {
            String fullName = new String(s.getFirstName() + " " + s.getLastName()).toLowerCase();
            if (fullName.matches("(.*)" + name.toLowerCase() + "(.*)")) {
                matches.add(s);
                found = true;
            }
        }
        if (found = false) {
            System.out.println("Not found");
        }
        return matches;
    }
    public Student findById(int id) throws IOException {
        readStudent();
        for (Student s: list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void add(Student s) {list.add(s);}

    public void remove(int id) throws IOException {
        readStudent();
        boolean found = false;
        for (Student s: list) {
            if (s.getId() == id) {
                int choice;
                System.out.println("Are you sure about deleting this student? (1.Yes 2.No)");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1)
                    list.remove(s);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Cannot find student with id " + id);
        }
    }

    public void sortByMarks() throws IOException {
        readStudent();
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {return new Double(s2.getMark()).compareTo(s1.getMark());}
        });
    }

    public void showList() {
        for (Student s: list) {
            s.printInfo();
        }
    }

    public void showList(ArrayList<Student> slist) {
            for (Student s: slist) {
                s.printInfo();
        }
    }
    public void sortByName() throws IOException {
        readStudent();
        list.sort(((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())));
    }
}
