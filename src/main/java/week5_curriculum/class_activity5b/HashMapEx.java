package week5_curriculum.class_activity5b;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "orange");
        fruits.put(2, "mango");
        fruits.put(3, "apple");
        fruits.put(4, "grape");
        fruits.put(5, "pineapple");

        fruits.remove(2);
        fruits.replace(2, "date");
        for(Map.Entry f : fruits.entrySet()){
            System.out.println(f.getKey() + " " + f.getValue());
        }

        System.out.println(fruits.containsKey(1));



    }
}
