package Week_1_curriculum.class_activity_2;

public class OverloadingExample {
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b +c;
    }
    static double add(double a, double b){
        return a + b;
    }
}
