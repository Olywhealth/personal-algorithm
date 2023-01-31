package numbers;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int N){
        BigInteger result =BigInteger.ONE;
        if(N<3) return BigInteger.valueOf(N);

        while (N>0){
            result = result.multiply(BigInteger.valueOf(N));
            N--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(25));
    }
}
