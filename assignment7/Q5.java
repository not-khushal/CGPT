// 5. Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
// Hint =>
// a. Take user input for a number.
// b. Find the count of digits in the number.
// c. Find the digits in the number and save them in an array
// d. Create an array to store the elements of the digits array in reverse order
// e. Finally, display the elements of the array in reverse order

package assignment7;
import java.util.Scanner;
public class Q5 {
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
            digits[i] = num%10;
            num /= 10;
        }

        for(int i=0; i<digits.length; i++){
            System.out.println("Digits reversed are " + digits[i]);
        }


    }
}
