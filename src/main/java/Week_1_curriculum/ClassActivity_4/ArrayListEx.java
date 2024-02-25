package Week_1_curriculum.ClassActivity_4;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");

        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        for(String i: list1){
            System.out.println(i);
        }

        Collections.sort(list1.reversed());
        System.out.println(list1);

        for(String i: list1){
            System.out.println(i);
        }
    }
}
