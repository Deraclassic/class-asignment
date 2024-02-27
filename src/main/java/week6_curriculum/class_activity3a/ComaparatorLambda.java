package week6_curriculum.class_activity3a;

import java.util.*;

public class ComaparatorLambda {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Pear","Apple","Pineapple","Grape"));
        Collections.sort(fruits, (f1, f2) -> Integer.compare(f1.length(), f2.length()));
        fruits.forEach(
                (n) -> System.out.println(n)
        );
    }
}
























//Collections.sort(people, new PersonComparator());
//        for (Person person : people) {
//        library.borrowBook(person, "The Great Gatsby");
//        }


//public class PersonComparator implements Comparator<Person> {
//    public int compare(Person p1, Person p2){
//        if(p1.getRole().getPriority()>p2.getRole().getPriority()){
//            return 1;
//        } else if (p1.getRole().getPriority()<p2.getRole().getPriority()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }