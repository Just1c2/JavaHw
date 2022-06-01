package trainning.studentmangement.model;

import trainning.studentmangement.entity.Student;

import java.util.*;

public class StudentList {
    ArrayList<Student> list = new ArrayList<>();
    private int length;

    public StudentList() {
        list.add(new Student(01, "Hieu", "Vu", 9));
        list.add(new Student(02, "Huy", "Vu", 8));
        list.add(new Student(03, "Quan", "Cao", 8));
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

    public void sortByMarks() {
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
    public void sortByName() {
        list.sort(((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())));
    }
}
