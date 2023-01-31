package strings;

import java.util.Random;
public class Test {
    // Using the sides parameter, change this code so that it returns
// the correct range of roll values no matter the number of sides provided.
// ex. For an 8-sided dice the numbers returned should be integers between 1-8

    public static int rollDice(int sides){
        Random rand = new Random();
        // random num between 0 and (almost) 1
        double randomNumber=rand.nextDouble();

        // change range to 0 to (almost) 6
        randomNumber=randomNumber*(double)sides ;

        // shift range up one
        randomNumber=randomNumber+1;

        // cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6
        int randomInt=(int)randomNumber;

        // return statement
        return randomInt;
    }

    public static void main(String[] args) {
        System.out.println(rollDice(8));
    }
}
