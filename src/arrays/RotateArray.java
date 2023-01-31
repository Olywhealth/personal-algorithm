package arrays;


import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArrayLeft(int[] array, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            int k, first;
            first = array[0];
            for (k = 0; k < array.length - 1; k++) {
                array[k] = array[k + 1];
            }
            array[k] = first;
        }
        System.out.println(System.nanoTime() - startTime);
        return array;

    }

    public static int[] rotateRight(int[] nums, int k) {
        long startTime = System.nanoTime();
        k %= nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
        System.out.println(System.nanoTime() - startTime);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArrayLeft(new int[]{1, 2, 3, 4,5}, 3)));
        System.out.println(Arrays.toString(rotateRight(new int[]{1, 2, 3, 4, 5}, 3)));
    }
}
