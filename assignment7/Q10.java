// 10. Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint =>
// a. Take the input for a number
// b. Find the count of digits in the number
// c. Find the digits in the number and save them in an array
// d. Find the frequency of each digit in the number. For this define a frequency array of size
// 10, Loop through the digits array, and increase the frequency of each digit
// e. Display the frequency of each digit in the number

package assignment7;

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
        for(int i=0; i<count; i++){
            digits[i] = num % 10;
            num /= 10;
        }

        for(int i=0; i<digits.length; i++){
            System.out.println("digits are " + digits[i]);
        }

        int[] freq = new int[10];
        for(int i=0; i<digits.length; i++){
            freq[digits[i]]++;
        }
        
        for(int i=0; i<10; i++) {
            if(freq[i] > 0) {
                System.out.println("Frequency of " + i + " is " + freq[i]);
            }
        }
    }}
