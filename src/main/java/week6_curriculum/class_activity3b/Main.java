package week6_curriculum.class_activity3b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student("John Doe", 18), new Student("Michael Smith", 16), new Student("Amelia Obi", 19)));
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        students.forEach(
                (n) -> System.out.println(n)
        );
    }
}
