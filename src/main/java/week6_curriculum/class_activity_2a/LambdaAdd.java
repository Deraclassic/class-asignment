package week6_curriculum.class_activity_2a;

public class LambdaAdd {
    public static void main(String[] args) {
        Addable addable = ((a, b) -> {
            return a + b;
        });
        System.out.println("sum is: "+ addable.add(1,2));
    }
}
