// 3. Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
// Hint =>
// a. Create a number variable and Take user input.
// b. Define an array to store the digits. Set the size of the array to maxDigit variable initially
// set to 10
// c. Create an integer variable index with the value 0 to reflect the array index.
// d. Use a loop to iterate until the number is not equal to 0.
// e. Remove the last digit from the number in each iteration and add it to the array.
// f. Increment the index by 1 in each iteration and if the index count equals maxDigit then
// break out of the loop and the remaining digits are not added to the array
// g. Define variable to store largest and second largest digit and initialize it to zero
// h. Loop through the array and use conditional statements to find the largest and second
// largest number in the array
// i. Finally display the largest and second-largest number

package assignment7;

import java.util.Scanner;

public class Q3 {
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
        for (int i = 0; i < count; i++) {
              digits[i] = num % 10;
              num /= 10;
        }
        for(int i=0; i<digits.length; ++i){
            System.out.println("Digits in the number are "+digits[i]);
        }

        int largest = digits[0];
        int secondLargest = -1;
        
        for(int i=1; i<digits.length; i++){
            if(digits[i] > largest){
                secondLargest = largest;
                largest = digits[i];
            }
            else if(digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);
    }}
