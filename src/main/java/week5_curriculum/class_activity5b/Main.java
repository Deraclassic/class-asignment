package week5_curriculum.class_activity5b;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();
        tracker.addGrade(10,80);
        tracker.addGrade(11,90);
        tracker.addGrade(12,100);

        System.out.println("Student 1: " + tracker.getGrade(10));
        System.out.println("Student 2: " + tracker.getGrade(11));
        System.out.println("Student 3: " + tracker.getGrade(12));
    }
}
