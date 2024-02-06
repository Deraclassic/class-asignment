package Week_1_curriculum.class_activity_3.exercise1;

import Week_1_curriculum.class_activity_3.exercise1.ex2.Teachable;

public class Teacher implements Teachable {
    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching " + course);
    }
}
