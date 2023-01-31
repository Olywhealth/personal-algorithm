package numbers;

public class ReverseInt {
    public static int reverse(int x) {
        int y = Math.abs(x);
        int result=0;
        while(y>0){
            if (result>214748364)return 0;//this is to cater for integer overflow
            result = result*10 + y%10;
            y= y/10;
        }
        if(x<0)return -result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
