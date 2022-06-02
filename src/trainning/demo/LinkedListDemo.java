package trainning.demo;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList<String> students = new LinkedList<>();

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);

        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers,(a,b)->(b-a));
        System.out.println(numbers);

        students.add("Hieu");
        students.add("Huy");
        students.add("Hoang");
        students.add(2, "Hung");
        students.addFirst("Hang");
        students.addLast("Hoan");
        System.out.println(students.get(3));
        System.out.println(students.getFirst());
        System.out.println(students.pollLast());
        displayStudent(students);
        traversalList();
    }
    public static void displayStudent(LinkedList linkedList) {
        for (Object arr: linkedList) {
            System.out.println(arr);
        }
    }

    public static void traversalList() {

        List<String> employees = new LinkedList<>();
        employees.add("Huy");
        employees.add("Hoang");
        employees.add("Hieu");

        Iterator<String> stringIterator = employees.iterator();
        while (stringIterator.hasNext()) {
            String emp1 = stringIterator.next();
            System.out.println(emp1);
        }
        Collections.sort(employees);
        System.out.println(employees);
        Collections.sort(employees,Collections.reverseOrder());
        System.out.println(employees);
    }
}
