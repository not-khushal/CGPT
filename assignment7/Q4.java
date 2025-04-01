// Rework the program 3, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number
// Hint =>
// a. In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements.
// b. To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
// c. Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number


package assignment7;

import java.util.Scanner;

public class Q4 {
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
        
        for(int i=0; i<digits.length; i++){
            if(digits[0] != -1){
                int[] newArray = new int[10];
                System.arraycopy(digits, 0 , newArray, 0, count);
            }
        }
        
        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);
    }}

