package trainning.studentmangement.model;

import trainning.studentmangement.entity.Student1;

import java.util.*;

public class StudentListWithLinkedList {
    LinkedList<Student1> list = new LinkedList<>();
    private int length;

    public StudentListWithLinkedList() {
        list.add(new Student1(1, "Hieu", "Vu", 9));
        list.add(new Student1(2, "Huy", "Vu", 8));
        list.add(new Student1(3, "Quan", "Cao", 8));
        list.add(new Student1(4, "Thanh", "Minh", 9));
        list.add(new Student1(5, "Hung", "Nguyen", 6));
        list.add(new Student1(6, "Khanh", "Bui", 5));
        list.add(new Student1(7, "Huy", "Tran", 7));
        list.add(new Student1(21, "Minh", "Tran", 4));
        list.add(new Student1(22, "Duc", "Nguyen", 7));
        list.add(new Student1(10, "Duy", "Nguyen", 8));
        list.add(new Student1(11, "Manh", "Nguyen", 9));
        list.add(new Student1(12, "Hong", "Vu", 6));
        list.add(new Student1(13, "Tung", "Tran", 4));
        list.add(new Student1(14, "Thuong", "Tran", 5));
        list.add(new Student1(15, "Thao", "Nguyen", 7));
        list.add(new Student1(16, "Nga", "Nguyen", 8));
        list.add(new Student1(17, "Manh", "Vu", 8));
        list.add(new Student1(18, "Hung", "Tran", 9));
        list.add(new Student1(19, "Trung", "Vu", 9));
        list.add(new Student1(20, "Hien", "Vu", 9));

    }

    public ArrayList<Student1> findByName(String name) {
        boolean found = false;
        ArrayList<Student1> matches = new ArrayList<>();
        for (Student1 s: list) {
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
    public Student1 findById(int id) {
        for (Student1 s: list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void add(Student1 s) {list.add(s);}

    public void remove(int id) {
        boolean found = false;
        for (Student1 s: list) {
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
        Collections.sort(list, new Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {return new Double(s2.getMark()).compareTo(s1.getMark());}
        });
    }

    public void showList() {
        for (Student1 s: list) {
            s.printInfo();
        }
    }

    public void showList(ArrayList<Student1> slist) {
        for (Student1 s: slist) {
            s.printInfo();
        }
    }
    public void sortByName() {
        list.sort(((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())));
    }
}
