package week5_curriculum.class_activity5d;

public class GenericsWIthMethods {

    public static <E> void printArray(E[] elements){
        for(E e: elements){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50};
        Character[] charArr = {'A', 'B', 'C','D', 'E'};

        System.out.println("Print integer array: ");
        printArray(intArray);

        System.out.println("Print character array: ");
        printArray(charArr);

    }
}
