import java.util.Iterator;
import java.util.TreeSet;

public class ExTreeSet {

    public void exerciseTreeSet() {

        //task 1
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("cat");
        treeSet.add("dog");
        treeSet.add("turtle");
        treeSet.add("rabbit");
        System.out.println("task 1: " + treeSet.toString());

        //task 2
        System.out.println("task 2:");
        for (String animal : treeSet
        ) {
            System.out.println(animal);
        }

        //task 3
        TreeSet<String> animals = (TreeSet<String>) treeSet.clone();
        System.out.println("task 3: " + animals.toString());

        //task 4
        System.out.println("task 4:");
        Iterator iterator = animals.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //task 5
        System.out.println("task 5: first element is :" + animals.first());
        System.out.println("task 5: last element is :" + animals.last());

        //task 6
        TreeSet<String> secondList = (TreeSet<String>) animals.clone();
        System.out.println("task 6: " + treeSet.toString());

        //task 7
        System.out.println("task 7: size= " + treeSet.size());

        //task 8
        animals.add("bird");
        System.out.println("task 8: treeSet and animal are equal: " +
                treeSet.equals(animals));

        //task 9
        TreeSet<Integer> number = new TreeSet<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        TreeSet<Integer> seven = new TreeSet<>();
        seven = (TreeSet)number.headSet(7);
        System.out.println("task 9: " + seven.toString());

        //task 10
        int value = number.ceiling(6);
        System.out.println("task 10: " + value);

        //task 11
        int val = number.floor(4);
        System.out.println("task 11: " + val);

        //task 12
        int elementOne = number.higher(4);
        System.out.println("task 12: " + elementOne);

        //task 13
        int elementTwo = number.lower(4);
        System.out.println("task 13: " + elementTwo);

        //task 14
        number.pollFirst();
        System.out.println("task 14: " + number.toString());

        //task 15
        number.pollLast();
        System.out.println("task 15: " + number.toString());

        //task 16
        number.remove(3);
        System.out.println("task 16: " + number.toString());
    }
}
