package week5_curriculum.class_activity4a;

public class MethodReference {
    static void saySomething(){
        System.out.println("Hello, this is a static method.");
    }
    public static void main(String[] args) {
        Sayable sayable = MethodReference :: saySomething;
        sayable.say();

    }
}
