package week6_curriculum.class_activity3a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUsingLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");

        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}
