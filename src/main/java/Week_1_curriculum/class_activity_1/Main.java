package Week_1_curriculum.class_activity_1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Internship_Form obj1 = new Internship_Form("Chidera Uzoigwe",24,"Female");
        Internship_Form obj2 = new Internship_Form("James Lang", 25,"male");
        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age);
        System.out.println("gender: " + obj1.gender);
        System.out.println("Name: " + obj2.name);
        System.out.println("Age: " + obj2.age);
        System.out.println("gender: " + obj2.gender);
    }
}
