package week5_curriculum.class_activity5b;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> vegetables = new LinkedList<>();
        vegetables.add("carrot");
        vegetables.add("green leaves");
        vegetables.add("okra");
        vegetables.add("pumpkin");
        vegetables.add("water leaf");

        for(String v : vegetables){
            System.out.println(v);
        }

    }
}
