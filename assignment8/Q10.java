// Write a program FizzBuzz, take a number as user input and 
// if it is a positive integer loop from 0 to the number and save the number, 
// but for multiples of 3 save "Fizz" instead of the number, 
// for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
// Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
// Hint => 
// Create a String Array to save the results and 
// Finally, loop again to show the results of the array based on the index position


package assignment8;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();


        int count = 0;
        int temp = num;

        while(temp>0){
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for(int i = 0; i<count; i++){
            digits[i] = num%10;
            num /= 10;
        }

        String[] status = new String[count];

        for(int i=0; i<digits.length; i++){
            if(digits[i]%3==0 && digits[i]%5==0){
                status[i] = "FizzBuzz";
            }
            else if(digits[i]%3==0 && digits[i]%5!=0){
                status[i] = "Fizz";
            }
            else if(digits[i]%3!=0 && digits[i]%5==0){
                status[i] = "Buzz";
            }
            else{
                status[i] = "None";
            }
        }
        System.out.println("Results");
        for(int i=0; i<digits.length; i++){
            System.out.println("Position " + (i+1) + " for " + digits[i] + " is " + status[i]);
        }
    }}
