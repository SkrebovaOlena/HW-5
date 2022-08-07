import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ExHashSet {

    public void exerciseHashSet(){

        //HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("Audi");
        hashSet.add("Skoda");
        hashSet.add("Opel");
        System.out.println(hashSet.toString());

        //task 1
        hashSet.add("Citroen");
        System.out.println("task 1: " + hashSet.toString());

        //task 2
        System.out.println("task 2:");
        for (String element: hashSet
             ) {
            System.out.println("element: " + element);
        }

        //task 3
        System.out.println("task 3: hashset contains " + hashSet.size() + " elements");

        //task 4
        hashSet.removeAll(hashSet);
        System.out.println("task 4: " + hashSet.toString());

        //task 5
        System.out.println("task 5: hashSet is empty - " + hashSet.isEmpty());

        //task 6
        System.out.println("task 6");
        HashSet<String> producers = new HashSet<>();
        producers.add("Samsung");
        producers.add("LG");
        producers.add("Whirlpool");
        producers.add("Bosch");
        System.out.println("producers: " + producers.toString());

        HashSet<String> owners = (HashSet<String>) producers.clone();
        System.out.println("owners: " + owners.toString());

        //task 7
        System.out.println("task 7:");
        String [] arrayOwners = new String[owners.size()];
        int i =0;
        for (String owner: owners
             ) {
            arrayOwners[i] = owner;
            System.out.println(arrayOwners[i]);
            i++;
        }

        //task 8
        TreeSet<String> treeSet = new TreeSet<>(producers);
        System.out.println("task 8: "+ treeSet.toString());

        //task 9
        List<String> list = new ArrayList<>(producers);
        System.out.println("task 8: "+ list.toString());

        //task 10
        System.out.println("task 10: producers and owners are equal - " +
                producers.equals(owners));

        //task 11
        System.out.println("task 11:");
        owners.add("Beko");
        owners.add("Zanussi");
        for (String owner:owners
             ) {
            if (producers.contains(owner)){
                System.out.println(owner);
            }
        }

        //task 12
        owners.removeAll(owners);
        System.out.println("task 12: hashset owner: " + owners.toString());
    }
}
