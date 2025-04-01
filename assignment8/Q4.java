// Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. 
// Show all the numbers as well as the sum of all numbers 
// Hint => 
// Create a variable to store an array of 10 elements of type double as well as a variable to store 
// the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop 
// Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
// If the user entered a number other than 0 or a negative number inside the while loop then assign the 
// number to the array element and increment the index value
// Take another for loop to get the values of each element and add it to the total 
// Finally display the total value


package assignment8;
import java.util.Scanner;
public class Q4 {
public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);
    double[] arr = new double[10];
    double sum = 0;

    System.out.println("Enter the elements of array");
    for(int i=0; i<arr.length; i++){
        System.out.println("Enter the " + (i+1) + " element of array");
        arr[i] = myObj.nextDouble();

        sum += arr[i];
    }
    System.out.println("Sum of all positive elements of array is " + sum);

    // for(int i = 0; i<arr.length; i++){
    //     if(arr[i]<=0){
    //         System.exit(1);
    //     }
    // }


    // for(int i = 0; i < arr.length; i++){
    //     System.out.println(arr[i]);
    // }

}

}
