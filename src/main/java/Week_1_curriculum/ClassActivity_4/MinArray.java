package Week_1_curriculum.ClassActivity_4;

public class MinArray {


    public static int min(int[] arr) {
        //this line assumes that the array is not empty
        int min = arr[0];

        for(int i = 1; i <arr.length; i++){
            //this line checks if our current element (arr[i] being iterated
            // over in the array is less than the current minimum value.
            //if the current value is smaller, updates the value of them min to be the value of the current element
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
       int [] a = {33, 4, 7, 2};

        System.out.println(min(a));
    }

    }

