package numbers;

import java.util.Arrays;

/**
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 */
public class CountPrimes {
//    public static int countPrimes(int n) {
//        int counter = 0;
//        if(n<=2) return 0;
//        for(int i=2; i<n; i++){
//            if(isPrime(i)){
//                counter++;
//            }
//        }
//        return counter;
//    }
//    public static boolean isPrime(int x) {
//        if(x==2) return true;
//        for(int j=2; j<x; j++) {
//            if(x%j==0) return false;
//        }
//        return true;
//    }
    public static int countPrimes(int n) {//note the commented one to works but didn't pass time complexity
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        int result = 0;
        for (int i = 2; i < n; ++i) {
            if (primes[i]) {
                result++;
                for (int j = i + i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(24));

    }
}
