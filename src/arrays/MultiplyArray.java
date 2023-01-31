package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyArray {
    public static int[] multiplyArray(int[] arr){
        int len = arr.length;
        for(int i=0; i< arr.length; i++){
            arr[i] = arr[i]*len;
            len--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};//5,8,9,8,5
        System.out.println(Arrays.toString(multiplyArray(arr)));

        List<Integer> evenElements = new ArrayList<>();
        for(int i=1; i<10; i++) {
            evenElements.add(i);
        }
        List<Integer> result = evenElements.stream().filter(integer -> integer %2 ==0).toList();
        System.out.println(result);
    }
}
