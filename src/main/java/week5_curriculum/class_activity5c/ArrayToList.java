package week5_curriculum.class_activity5c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] stack = {"Java", ".Net", "Node"};
        System.out.println("Array: " + Arrays.toString(stack));
        System.out.println("*********************************");

//        List<String> stack2 = new ArrayList<>(Arrays.asList(stack));
//        System.out.println(stack2);
//        System.out.println("*****************************");



        List<String> lang = new ArrayList<>();
        for(String s : stack){
            lang.add(s);
        }
        System.out.println(lang);
    }
}
