import java.util.*;

public class ExQueue {

    public void exerciseTreeSet(){

        PriorityQueue<String> queue = new PriorityQueue<>();

        //task 1
        queue.add("blue");
        queue.add("white");
        queue.add("red");
        queue.add("yellow");
        System.out.println("task 1: " + queue.toString());

        //task 2
        System.out.println("task 2:");
        for (String q:queue) {
            System.out.println(q);
        }

        //task 3
        PriorityQueue<String> firstQueue = new PriorityQueue();
        firstQueue.addAll(queue);
        System.out.println("task 3: " + firstQueue.toString());

        //task 4
        firstQueue.offer("green");
        System.out.println("task 4: " + firstQueue.toString());

        //task 5
        queue.removeAll(queue);
        System.out.println("task 5: " + queue.toString());

        //task 6
        System.out.println("task 6" + firstQueue.size());

        //task 7
        System.out.println("task 7:");
        PriorityQueue<String> secondQueue = new PriorityQueue<>();
        secondQueue.add("green");
        secondQueue.add("black");
        secondQueue.add("red");

        for (String element:firstQueue) {
            if (secondQueue.contains(element)){
                System.out.println(element + ": Yes");
            }
            else {
                System.out.println(element + ": No");
            }
        }

        //task 8
        System.out.println("task 8:" + firstQueue.peek());

        //task 9
        System.out.println("task 9:" + firstQueue.poll());

        //task 10
        int i = 0;
        String[] array = new String[firstQueue.size()];
        for (String color:firstQueue) {
            array[i] = color;
            i++;
        }
        System.out.println("task 10: " + array.toString());

        //task 11
        System.out.println("task 11: " + firstQueue.toString());

        //task 12
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());
        numbers.add(19);
        numbers.add(100);
        numbers.add(884);
        numbers.add(323);
        System.out.println("task 12: " + numbers.peek());
    }
}
