package week5_curriculum.class_activity5c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listToArray {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("grape");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("pawpaw");

        String[] fruitArray = new String[5];
        fruitArray = fruits.toArray(fruitArray);
        System.out.println(Arrays.toString(fruitArray));
    }
}
