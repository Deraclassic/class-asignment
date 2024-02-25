package Week_1_curriculum.class_activity_3.exercise1.Abstract;

public class Developers {
    int id;
    String name;
    static String institute = "Decagon";

    public Developers(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + " " +" "+ name + " "+ institute);
    }
}
