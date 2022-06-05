package trainning.demo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void demoLinkedHashSet() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        //them pt
        linkedHashSet.add("Hanoi");
        linkedHashSet.add("Viet Tri");
        linkedHashSet.add("Ba Vi");
        linkedHashSet.add("Sapa");
        linkedHashSet.add("Quang Ninh");

        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        System.out.println("Co Quang Ninh ko: " + linkedHashSet.contains("Quang Ninh"));
        linkedHashSet.remove("Viet Tri");
    }
    
    public static void main(String[] args) {
        demoLinkedHashSet();;
    }
}
