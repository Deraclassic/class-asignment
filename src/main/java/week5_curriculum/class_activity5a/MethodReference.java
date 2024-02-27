package week5_curriculum.class_activity5a;

public class MethodReference {
    public void doSound(){
        System.out.println("I am shouting");
    }
    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        Doable doable = methodReference :: doSound;
        doable.doThings();
    }
}
