package arrays;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    static Map<Integer, Integer> result = new HashMap<>();

    //first method
    public static Map<Integer, Integer> checkFrequency(int[] arr) {
        //Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (result.containsKey(arr[i])) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            result.put(arr[i], count);
        }
        return result;
    }

    //optimized solution
    public static Map<Integer, Integer> checkFrequency1(int[] arr) {
//        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if (result.containsKey(n)) {
                result.put(n, result.get(n) + 1);
            } else {
                result.put(n, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1, 3};
        System.out.println(checkFrequency(arr));
        System.out.println("Elements   |" + "  Frequency");
        for (int key : result.keySet()){
            System.out.println('\t'+""+key +"   |"+"  "+result.get(key));
        }
    }
}
