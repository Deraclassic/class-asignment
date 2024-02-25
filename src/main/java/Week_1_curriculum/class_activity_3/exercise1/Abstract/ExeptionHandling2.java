package Week_1_curriculum.class_activity_3.exercise1.Abstract;

public class ExeptionHandling2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;
        int num3;
        try {

            num3 = num1 / num2;

        } catch (Exception e) {
            System.out.println(e);
            System.out.println(num1 / (num2 + 2));
        }

    }
}