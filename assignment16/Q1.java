
package assignment16;

import java.util.Random;
import java.util.Scanner;

public class Q1 {


    public static String numGuess(int numKey) {
        String result = "";
        Scanner myObj = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(101);
        
        System.out.println("Think of a number between 1 and 100");
        System.out.println("Computer guesses: " + number);
        System.out.println("Enter 1 if guess is too high, -1 if too low, 0 if correct");
        
        while (true) {
            int feedback = myObj.nextInt();
            if (feedback == 0) {
                result = "Computer has won! The number was " + number;
                break;
            } else if (feedback == 1) {
                number = rand.nextInt(number);
                System.out.println("Computer guesses: " + number);
            } else if (feedback == -1) {
                number = rand.nextInt(101 - number) + number;
                System.out.println("Computer guesses: " + number);
            }
        }
        myObj.close();
        return result;
    }    
    public static void main(String[] args) {
        int numKey = 0;
        System.out.println(numGuess(numKey));
    }

}