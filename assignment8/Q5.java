// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
// Hint => 
// Take integer input and store it in the variable number as well as define an integer array to store 
// the multiplication result in the variable multiplicationResult
// Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
// Finally, display the result from the array in the format number * i = ___



package assignment8;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number between 6 to 9");
        int num = myObj.nextInt();
        int[] mul = new int[10];

        if(num>=6&&num<=9){
            System.out.println("Multiplication table is ");
            for(int i=0; i<mul.length; i++){
                System.out.println(num + " x " + (i+1) + " = " + (num*(i+1)));
            }
        }
        else{
            System.out.println("Error - TRY AGAIN");
        }
    }
}
