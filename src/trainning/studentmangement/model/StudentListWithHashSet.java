package trainning.studentmangement.model;

import trainning.studentmangement.entity.Student;

import java.util.*;

public class StudentListWithHashSet {
    HashSet<Student> list = new HashSet<>();
    private int length;

    public StudentListWithHashSet() {
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

    public ArrayList<Student> findByName(String name) {
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
    public Student findById(int id) {
        for (Student s: list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void add(Student s) {list.add(s);}

    public void remove(int id) {
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
}
