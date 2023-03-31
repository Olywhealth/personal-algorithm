package strings;

public class Palindrome1 {
    public static boolean isPalindrome(String str) {
        int length = str.length()-1;
        int i =0;
        while (length > i) {
            System.out.println(i +"  "+length);
            if (str.charAt(length) != str.charAt(i)){
                return false;
            }
            length--;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("mada"));
    }
}
