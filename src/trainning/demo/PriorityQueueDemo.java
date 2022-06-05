package trainning.demo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void demoPriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(54);
        priorityQueue.add(76);
        priorityQueue.add(34);
        priorityQueue.add(53);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.poll());
    }

    public static void main(String[] args) {
        demoPriorityQueue();
    }
}
