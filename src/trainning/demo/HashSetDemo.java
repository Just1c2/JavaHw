package trainning.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void hashSetDemo() {
        HashSet<String> hashSet = new HashSet<>();

        //them phan tu vao ds
        hashSet.add("Hanoi");
        hashSet.add("Vinh");
        hashSet.add("Nghe An");
        hashSet.add("Ba Vi");
        hashSet.add("Sa Pa");

        System.out.println(hashSet);

        hashSet.add("Mexico");
        hashSet.add("London");

        System.out.println(hashSet);

        System.out.println("\nDose it contains Ho Chi Minh city: " + hashSet.contains("Ho Chi Minh city"));

        hashSet.remove("Sa Pa");

        //use for each
        System.out.println("\nUse for each: ");
        for (String s: hashSet) {
            System.out.println(s + ", ");
        }
        //iterator over hashset items
        System.out.println("\nUse iterator");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }
    }
    public static void main(String[] args) {
        hashSetDemo();
    }
}
