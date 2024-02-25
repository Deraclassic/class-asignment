package Week_1_curriculum.class_activity_2.class_exercise3.new_1;

import Week_1_curriculum.class_activity_3.exercise1.Abstract.Developers;

public class Student {
    int matricNo;
    String studentName;
    static String institution = "UniBen";

    public Student(int matricNo, String studentName) {
        this.matricNo = matricNo;
        this.studentName = studentName;
    }
    static void changeUniversity(){

        Student.institution="Covenant University";
    }
    void display(){
        System.out.println("Student name: " + studentName + " matric no: "+ matricNo + " institution: " + institution);
    }
}
