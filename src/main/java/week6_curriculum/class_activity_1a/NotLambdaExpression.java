package week6_curriculum.class_activity_1a;

public class NotLambdaExpression {
    public static void main(String[] args) {
        //without Lambda. Implementing Drawable using an anonymous class
        int width = 10;
//        Drawable drawable = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("drawing " + width);
//            }
//        };
//        drawable.draw();

        Drawable drawable2 =()->{
            System.out.println("Drawing " + width);
        };
        drawable2.draw();
    }
}
