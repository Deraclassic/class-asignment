package week5_curriculum.class_activity5b;

import java.util.HashMap;
public class GradeTracker {
    HashMap<Integer, Double> gradeTracker;

    public GradeTracker() {
        gradeTracker= new HashMap<>();
    }
    public void addGrade(int studentId, double grade){
        gradeTracker.put(studentId,grade);
    }
    public double getGrade(int studentId){
        if(gradeTracker.containsKey(studentId)){
            return gradeTracker.get(studentId);
        }
        else return -1;
    }

}
