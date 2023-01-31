//package arrays;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
///*
//
//Given an array of buildings and a direction that all of the buildings face, return an array of the indices of the buildings that can see the sunset.
//
//A building can see the sunset if it's strictly taller than all of the buildings that come after it in the direction that it faces.
//
//The input array named buildings contains positive, non-zero integers representing the heights of the buildings. A building at index i thus has a height denoted by buildings[i]. All of the buildings face the same direction, and this direction is either east or west, denoted by the input string named direction, which will always be equal to either "EAST" or "WEST". In relation to the input array, you can interpret these directions as right for east and left for west.
//
//Important note: the indices in the output array should be sorted in ascending order.
//Aim for a Linear Time solution
//
//public class ProgramTest {public void TestCase1() {int[] buildings = new int[] {3, 5, 4, 4, 3, 1, 3, 2};
//String direction = "EAST";
//ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 7));
//
// var actual = new Program().sunsetViews(buildings, direction);
// assertTrue(expected.equals(actual));
//
// public void TestCase2() {int[] buildings = new int[] {3, 5, 4, 4, 3, 1, 3, 2};
// String direction = "WEST";
// ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase3() {    int[] buildings = new int[] {10, 11};    String direction = "EAST";    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase4() {    int[] buildings = new int[] {2, 4};    String direction = "WEST";    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase5() {    int[] buildings = new int[] {1};    String direction = "EAST";    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase6() {    int[] buildings = new int[] {1};    String direction = "WEST";    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase7() {    int[] buildings = new int[] {};    String direction = "EAST";    ArrayList<Integer> expected = new ArrayList<Integer>();
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase8() {    int[] buildings = new int[] {};    String direction = "WEST";    ArrayList<Integer> expected = new ArrayList<Integer>();
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase9() {    int[] buildings = new int[] {7, 1, 7, 8, 9, 8, 7, 6, 5, 4, 2, 5};    String direction = "EAST";    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 11));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase10() {    int[] buildings = new int[] {1, 2, 3, 4, 5, 6};    String direction = "EAST";    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(5));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
//  @Test  public void TestCase11() {    int[] buildings = new int[] {1, 2, 3, 4, 5, 6};    String direction = "WEST";    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
//
//    var actual = new Program().sunsetViews(buildings, direction);    assertTrue(expected.equals(actual));  }
//
// public void TestCase12() {int[] buildings = new int[] {1, 2, 3, 1, 5, 6, 9, 1, 9, 9, 11, 10, 9, 12, 8};
// String direction = "WEST";
// ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 4, 5, 6, 10, 13));
//
// var actual = new Program().sunsetViews(buildings, direction);
// assertTrue(expected.equals(actual));
//
// public void TestCase13() {int[] buildings = new int[] {20, 2, 3, 1, 5, 6, 9, 1, 9, 9, 11, 10, 9, 12, 8};
// String direction = "EAST";
// ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 13, 14));
//
// var actual = new Program().sunsetViews(buildings, direction);
// assertTrue(expected.equals(actual));
//}
//
//*/
//public class SunSet {
//    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
//        // Write your code here.
////         int max = 0;
////         ArrayList<Integer> res = new ArrayList<>();
////         if (Objects.equals(direction, "WEST")) {
////             for (int i = 0; i < buildings.length; i++) {
////                 if (max < buildings[i]) {
////                     max = buildings[i];
////                     res.add(i);
////                 }
////             }
////         } else {
////             for (int i = buildings.length - 1; i >= 0; i--) {
////                 if (max < buildings[i]) {
////                     max = buildings[i];
////                     res.add(i);
////                 }
////             }
////         }
////         if (Objects.equals(direction, "EAST")) {
////             int i = 0;
////             int j = res.size() - 1;
////             while (i < j) {
////                 int temp = res.get(i);
////                 res.set(i, res.get(j));
////                 res.set(j, temp);
////                 i++;
////                 j--;
////             }
////         }
////         return res;
//
//        int len = buildings.length;
//        int pos = Objects.equals(direction, "EAST") ? len - 1 : 0;
//        int index = Objects.equals(direction, "EAST") ? -1 : 1;
//        int max = 0;
//        ArrayList<Integer> res = new ArrayList<>();
//
//
//
//        while (pos >= 0 && pos < len) {
//            if (max < buildings[pos]) {
//                max = buildings[pos];
//                res.add(pos);
//            }
//            pos += index;
//        }
//        int i = 0;
//        int j = res.size() - 1;
//        while (i < j && res.get(i) > res.get(j)) {
//            int temp = res.get(i);
//            res.set(i, res.get(j));
//            res.set(j, temp);
//            i++;
//            j--;
//        }
//        return res;
//    }
//}
//}
