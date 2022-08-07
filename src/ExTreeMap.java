import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class ExTreeMap{

    public void exerciseTreeMap(){

        //task 1
        TreeMap<Integer, String> animals = new TreeMap<>();
        animals.put(1, "cat");
        animals.put(2, "dog");
        animals.put(3, "mouse");
        animals.put(4, "rabbit");

        System.out.println("task 1: " + animals.values());

        //task 2
        TreeMap<Integer, String> houseanimals = new TreeMap<>(animals);
        System.out.println("task 2: " + houseanimals.toString());

        //task 3
        System.out.println("task 3: animals contains key 5 : " + animals.containsKey(5));

        //task 4
        System.out.println("task 4: animals contains value cat : " + animals.containsValue("cat"));

        //task 5
        System.out.println("task 5: " + animals.keySet());

        //task 6
        houseanimals.clear();
        System.out.println("task 6: " + houseanimals.toString());

        //task 7
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        TreeMap<Integer, String> producers = new TreeMap<>(comparator);
        producers.put(1, "Bosch");
        producers.put(4, "Samsung");
        producers.put(3, "Philips");
        producers.put(2, "Lenovo");
        System.out.println("task 7: "+ producers);

        //task 8
        System.out.println("task 8: greatest - " + animals.lastEntry() +
                " least - " + animals.firstEntry());

        //task 9
        System.out.println("task 9: the lovest - " + animals.firstKey() +
                " highest - " + animals.lastKey());

        //task 10
        System.out.println("task 10: " + animals.descendingKeySet());

        //task 11
        System.out.println("task 11: " + animals.floorEntry(2));

        //task 12
        System.out.println("task 12: " + animals.floorKey(3));

        //task 13
        System.out.println("task 13: " + animals.headMap(2));

        //task 14
        System.out.println("task 14: " + animals.headMap(3, true));

        //task 15
        System.out.println("task 15: " + animals.higherEntry(10));

        //task 16
        System.out.println("task 16: " + animals.lowerEntry(3));

        //task 17
        System.out.println("task 17: " + animals.lowerKey(3));

        //task 18
        System.out.println("task 18: " + animals.navigableKeySet());

        //task 19
        System.out.println("task 19: " + animals.pollFirstEntry());

        //task 20
        System.out.println("task 20: " + animals.pollLastEntry());

        //task 21
        System.out.println("task 21: " + animals.subMap(0,2));

        //task 22
        System.out.println("task 22: " + animals.subMap(0,true,2,true));

        //task 23
        System.out.println("task 23: " + animals.tailMap(2));

        //task 24
        System.out.println("task 24: " + animals.tailMap(2,false));

        //task 25
        System.out.println("task 25: " + animals.ceilingEntry(2));

        //task 26
        System.out.println("task 26: " + animals.ceilingKey(1));
    }
}
