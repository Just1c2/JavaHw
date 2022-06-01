package trainning.demo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void sortedSetDemo() {
        TreeSet<String> treeSet = new TreeSet<>();
        SortedSet<String> sortedSet = new TreeSet<>();

        //them phan tu
        sortedSet.add("Ba Vi");
        sortedSet.add("Hai Phong");
        sortedSet.add("Nam Dinh");
        sortedSet.add("Nghe An");

        System.out.println(sortedSet);

        //check ton tai
        System.out.println("\nCo thanh pho viet tri ko: " + sortedSet.contains("Viet Tri"));

        System.out.println("PT dau tien " + sortedSet.first());
        System.out.println("PT cuoi cung " + sortedSet.last());

    }
}
