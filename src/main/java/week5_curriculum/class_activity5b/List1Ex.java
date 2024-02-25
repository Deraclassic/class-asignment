package week5_curriculum.class_activity5b;

import java.util.ArrayList;
import java.util.List;

public class List1Ex {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("mango");
        fruits.add("grape");
        fruits.add("pear");

        System.out.println(fruits.indexOf("mango"));
        System.out.println(fruits.size());

        for(String f : fruits){
            System.out.println(f);
        }
        System.out.println(fruits.get(0));
        System.out.println(fruits.isEmpty());
    }
}
