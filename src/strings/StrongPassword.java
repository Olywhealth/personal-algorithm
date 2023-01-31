package strings;

class StrongPassword {
    /* A password is said to be strong if it satisfies all the following criteria:

     It has at least 8 characters.
     It contains at least one lowercase letter.
     It contains at least one uppercase letter.
     It contains at least one digit.
     It contains at least one special character.
     The special characters are the characters in the following string: "!@#$%^&*()-+".
     It does not contain 2 of the same character in adjacent positions
      (i.e., "aab" violates this condition, but "aba" does not).
     Given a string password, return true if it is a strong password. Otherwise, return false.*/
    public static boolean strongPasswordCheckerII(String password) {
        if(password.length()<8 ) return false;
        boolean isUpper = false, isLower=false, checkDigit=false, isSpecial=false, uniqueAdjacent=false;

        for(int i=0; i<password.length(); i++){
            if(i>0){
                if(String.valueOf(password.charAt(i)).equals(String.valueOf(password.charAt(i-1)))) uniqueAdjacent = true;
            }
            if(Character.isUpperCase(password.charAt(i))) isUpper = true;
            if(Character.isLowerCase(password.charAt(i))) isLower = true;
            if(Character.isDigit(password.charAt(i))) checkDigit = true;
            if(!Character.isAlphabetic(password.charAt(i)) && !Character.isDigit(password.charAt(i))) isSpecial = true;
        }

        return (isUpper && !uniqueAdjacent && checkDigit && isLower && isSpecial);
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
        System.out.println(strongPasswordCheckerII("devOlaoye11B"));
        System.out.println(strongPasswordCheckerII("dev12B@"));//false because length() is less than 8
        System.out.println(strongPasswordCheckerII("devOlaoye11B?"));//false because two 1s followed consecutively
    }
}