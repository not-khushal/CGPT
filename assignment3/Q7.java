package assignment3;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = myObj.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = myObj.nextInt();

        int temp;
        num1 = temp;
        temp = num2;
        num2 = num1;

        System.out.println("After swapping " + num1 + "is the first number and " + num2 + "is the second number.");
    }
}