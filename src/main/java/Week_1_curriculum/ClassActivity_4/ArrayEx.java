package Week_1_curriculum.ClassActivity_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        //int[] num = {1,2,3,4,5};

        //System.out.println(Arrays.toString(num));

        //for(int i = 0; i < num.length; i++);

        //for(Integer i : num){
        //  System.out.println(i);
        // }
        int[] num = new int[6];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        num[5] = 6;


        for (int j = 0; j < num.length; j++) {
            System.out.println("j : " + j);
        }
    }
}