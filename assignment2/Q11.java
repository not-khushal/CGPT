package assignment2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter First Number");
        float num1 = myObj.nextFloat();
        System.out.println("Enter Second Number");
        float num2 = myObj.nextFloat();

        System.out.println("Addidtion of the two numbers is " + (num1+num2));
        System.out.println("Subtraction of the two numbers is " + (num1-num2));
        System.out.println("Multiplication of the two numbers is " + (num1*num2));
        System.out.println("Division of the two numbers is " + (num1/num2));
    }
}
