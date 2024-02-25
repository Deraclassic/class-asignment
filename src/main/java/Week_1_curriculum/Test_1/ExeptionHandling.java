package Week_1_curriculum.Test_1;

public class ExeptionHandling {
    public static void main(String[] args) {
        //int num = 299/0;

        try {
            int num = 299/0;
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Run other code");
    }
}
