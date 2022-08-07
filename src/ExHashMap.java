import java.util.Collections;
import java.util.HashMap;

public class ExHashMap {

    public void exerciseHashMap(){

        //task 1
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("cat", "Vasya");
        hashMap.put("dog", "Patron");
        hashMap.put("dog2", "Rex");
        hashMap.put("cat2", "Mishka");

        System.out.println("task 1: " + hashMap.toString());

        //task 2
        System.out.println("task 2: " + hashMap.size());

        //task 3
        HashMap<String, String> secondHashMap = new HashMap<>();
        secondHashMap.put("bear", "Chocolate");
        secondHashMap.put("fox", "Alisa");
        secondHashMap.putAll(hashMap);
        System.out.println("task 3: " + secondHashMap.toString());

        //task 4
        hashMap.clear();
        System.out.println("task 4: " + hashMap.toString());

        //task 5
        System.out.println("task 5: hashMap is empty : " + hashMap.isEmpty());

        //task 6
        HashMap<String, String> thirdHashMap = (HashMap<String, String>) secondHashMap.clone();
        System.out.println("task 6: thirdHashMap " + thirdHashMap.toString());

        //task 7
        System.out.println("task 7: secondHashMap contains key bear : " + secondHashMap.containsKey("bear"));

        //task 8
        System.out.println("task 8: secondHashMap contains value Mars : " +
                secondHashMap.containsValue("Mars"));

        //task 9
        System.out.println("task 9: " + secondHashMap.entrySet());

        //task 10
        System.out.println("task 10: value of key cat2 is " + secondHashMap.get("cat2"));

        //task 11
        System.out.println("task 11: " + secondHashMap.toString());

        //task 12
        HashMap<Integer, String> animals = new HashMap<Integer, String>();
        animals.put(1, "cat");
        animals.put(2, "dog");
        animals.put(3, "bird");
        animals.put(4, "rabbit");
        System.out.println("task 12: " + animals.values());
    }
}
