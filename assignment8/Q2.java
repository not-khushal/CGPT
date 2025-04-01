// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. 
// Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array 
// and display if they equal, greater or less
// Hint => 
// Define an integer array of 5 elements and get user input to store in the array.
// Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
// If the number is negative, print negative. Else if the number is zero, print zero. 
// Finally compare the first and last element of the array and display if they equal, greater or less


package assignment8;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] num = new int[5];
        String[] category = new String[5];

        System.out.println("Enter the number");
        for (int i=0; i<num.length; i++){
            System.out.println("Enter the " + (i+1) + " number");
            num[i] = myObj.nextInt();

            if(num[i]==0){
                category[i] = "Number is Zero";
            }
            else if(num[i]<0){
                category[i] = "Number is Negative";
            }
            else{
                if(num[i]%2==0){
                    category[i] = "Number is Poitive and Even";
                }
                else{
                    category[i] = "Number is Positive and Odd";
                }
            }
        }

        System.out.println("Results");
        for(int i=0; i<num.length; i++){
            System.out.println("The number " + (i+1) + " is " + num[i] + " and is " + category[i]);
        }
    }
}
