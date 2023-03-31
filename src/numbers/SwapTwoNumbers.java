package numbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        x = x+y;
        y = x - y;
        x = x - y;
        System.out.println("x = "+x+'\n'+"y = "+y);
    }
}
