package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DuplicateElements {
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>(List.of(2, 3, 2, 4, 1,3, 6, 5, 6, 7));
            System.out.println(arr);
            for (int i = 0; i < arr.size(); i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (Objects.equals(arr.get(i), arr.get(j))) {
                        arr.remove(arr.get(j));
                    }
                }
            }
            System.out.println(arr);
        }
}
