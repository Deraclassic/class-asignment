package week6_curriculum.class_activity_2a;

public class LambdaExpressionEx {
    public static void main(String[] args) {
        SayName sayName = (name)-> "Hello, " + name;
        System.out.println(sayName.say("John"));
    }
}
