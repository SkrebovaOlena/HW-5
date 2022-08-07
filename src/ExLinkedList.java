import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExLinkedList {

    public void exerciseLinkedList(){

        //LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("mouse");
        linkedList.add("rabbit");
        System.out.println("LinkedList: " + linkedList.toString());

        //task 1
        linkedList.add(0, "hamster");
        System.out.println("task 1: " + linkedList.toString());

        //task 2
        System.out.println("task 2: ");
        for (String i :linkedList
             ) {
            System.out.println(i.toString());
        }

        //task 3
        System.out.println("task 3:");
        for (int i = 2; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //task 4
        System.out.println("task 4:");
        for (int i = linkedList.size() - 1; i >= 0 ; i--) {
            System.out.println(linkedList.get(i));
        }

        //task 5
        linkedList.add(3, "fish");
        System.out.println("task 5: " + linkedList.toString());

        //task 6
        linkedList.addFirst("bear");
        linkedList.addLast("bird");
        System.out.println("task 6: " + linkedList.toString());

        //task 7
        linkedList.addFirst("fox");
        System.out.println("task 7: " + linkedList.toString());

        //task 8
        linkedList.addLast("elephant");
        System.out.println("task 8: " + linkedList.toString());

        //task 9
        LinkedList<String> plants = new LinkedList<>();
        plants.add("grass");
        plants.add("flower");
        linkedList.addAll(3, plants);
        System.out.println("task 9: " + linkedList.toString());

        //task 10
        System.out.println("task 10: first element - " + linkedList.getFirst() +
                " last element - " + linkedList.getLast());

        //task 11
        System.out.println("task 11:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("element " + i + "- " + linkedList.get(i));
        }

        //task 12
        linkedList.remove(3);
        System.out.println("task 12:" + linkedList.toString());

        //task 13
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("task 13:" + linkedList.toString());

        //task 14
        plants.removeAll(plants);
        System.out.println("task 14:" + plants.toString());

        //task 15
        Collections.swap(linkedList, 0,2);
        System.out.println("task 15:" + linkedList.toString());

        //task 16
        Collections.shuffle(linkedList);
        System.out.println("task 16:" + linkedList.toString());

        //task 17
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("peach");

        linkedList.addAll(fruits);
        System.out.println("task 17:" + linkedList.toString());

        //task 18
        LinkedList<String> animals = (LinkedList<String>) linkedList.clone();
        System.out.println("task 18:" + animals.toString());

        //task 19
        System.out.println("task 19:" + linkedList.pop().toString());

        //task 20
        System.out.println("task 20:" + linkedList.peekFirst());

        //task 21
        System.out.println("task 21:" + linkedList.peekLast());

        //task 22
        if (linkedList.contains("cat")){
            System.out.println("task 22: this list contains value cat");
        }
        else {
            System.out.println("task 22: this list doesn't contain value cat");
        }

        //task 23
        List<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("task 23: arrayList: " + arrayList.toString());

        //task 24
        System.out.println("task 24: linkedList equals animals - " + linkedList.equals(animals));

        //task 25
        System.out.println("task 25: linkedList is empty - " + linkedList.isEmpty());

        //task 26
        linkedList.set(8, "grape");
        System.out.println("task 26: " + linkedList.toString());
    }
}
