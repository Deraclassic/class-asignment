package Week_1_curriculum.class_activity_1.class_exercise_1;

public class Parent {
    private String color;

    public Parent(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    void displayColor(){
        System.out.println("Color is: " + color);
    }
}
