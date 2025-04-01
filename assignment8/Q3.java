// Create a program to print a multiplication table of a number.
// Hint => 
// Get an integer input and store it in the number variable. Also, define a integer array to store 
// the results of multiplication from 1 to 10
// Run a loop from 1 to 10 and store the results in the multiplication table array
// Finally, display the result from the array in the format number * i = ___


package assignment8;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = myObj.nextInt();

        int[] mul = new int[10];

        System.out.println("The multiplication of " + num + " is as follows ");
        for(int i=0; i<mul.length; i++){
            System.out.println(num + " x " + (i+1) + " = " + (num*(i+1)));
        }
    }
}
