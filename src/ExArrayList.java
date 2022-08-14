import java.util.Collections;
import java.util.List;

public class ExArrayList {

    public void exerciseArrayList() {

        //ArrayList
        List<String> colors = new java.util.ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("orange");
        colors.add("white");
        colors.add("black");

        //task 1
        System.out.println("task 1: " + colors.toString());

        //task 2
        System.out.println("task 2: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        //task 3
        colors.add(0, "pink");
        System.out.println("task 3: " + colors.toString());

        //task 4
        System.out.println("task 4: " + colors.get(3));

        //task 5
        colors.set(2, "yellow");
        System.out.println("task 5: " + colors.toString());

        //task 6
        colors.remove(2);
        System.out.println("task 6: " + colors.toString());

        //task 7
        if (colors.contains("red")) {
            System.out.println("task 7: This array contains red.");
        } else
            System.out.println("task 7: This array doesn't contains red");

        //task 8
        Collections.sort(colors);
        System.out.println("task 8: " + colors.toString());

        //task 9
        List<String> newArray = new java.util.ArrayList<String>();
        newArray.addAll(colors);
        System.out.println("task 9: " + newArray.toString());

        //task 10
        Collections.shuffle(colors);
        System.out.println("task 10: " + colors.toString());

        //task 11
        Collections.reverse(colors);
        System.out.println("task 11: " + colors.toString());

        //task 12
        List<String> arrayTwelve = new java.util.ArrayList<>();
        arrayTwelve = colors.subList(2, 4);
        System.out.println("task 12: " + arrayTwelve.toString());

        //task 13
        List<String> firstList = new java.util.ArrayList<>();
        List<String> secondList = new java.util.ArrayList<>();
        List<String> answers = new java.util.ArrayList<>();

        if (colors.size() > arrayTwelve.size()) {
            firstList.addAll(colors);
            secondList.addAll(arrayTwelve);
        } else {
            firstList.addAll(arrayTwelve);
            secondList.addAll(colors);
        }
        for (int i = 0; i < firstList.size(); i++) {
            if (secondList.contains(firstList.get(i))) {
                answers.add("Yes");
            } else {
                answers.add("No");
            }
        }
        System.out.println("task 13: ");
        System.out.println("firstList: " + firstList.toString());
        System.out.println("secondList: " + secondList.toString());
        System.out.println("answers: " + answers.toString());

        // task 14
        Collections.swap(colors, 1, 3);
        System.out.println("task 14: " + colors.toString());

        // task 15
        List<String> thirdList = new java.util.ArrayList<String>();
        thirdList.addAll(firstList);
        thirdList.addAll(secondList);
        System.out.println("task 15: " + thirdList.toString());

        // task 16
        java.util.ArrayList<String> fourthList = new java.util.ArrayList<>();
        fourthList.add("cat");
        fourthList.add("dog");
        fourthList.add("rabbit");
        java.util.ArrayList<String> fifthList = (java.util.ArrayList<String>) fourthList.clone();
        System.out.println("task 16: " + fifthList.toString());

        // task 17
        fourthList.removeAll(fourthList);
        System.out.println("task 17: " + fourthList.toString());

        // task 18
        System.out.println("task 18: fifthList is empty: " + fifthList.isEmpty() +
                "; fourthList is empty: " + fourthList.isEmpty());

        // task 19
        fifthList.trimToSize();

        // task 20
        fifthList.ensureCapacity(30);

        // task 21
        thirdList.set(3, "violet");
        System.out.println("task 21: " + thirdList.toString());

        // task 22
        System.out.println("task 22: ");
        for (int i = 0; i < thirdList.size(); i++) {
            System.out.println(thirdList.get(i));
        }
    }
}

