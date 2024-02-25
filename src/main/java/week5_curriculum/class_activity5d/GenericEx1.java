package week5_curriculum.class_activity5d;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        //list.add("2");  throws an error;
        System.out.println(list);
    }
}
