package assignment4;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = myObj.nextFloat();
        System.out.println("Enter the second number");
        float num2 = myObj.nextFloat();
        System.out.println("Choose Operator -> +, -, *, /");
        myObj.nextLine(); // Clear buffer
        char operator = myObj.nextLine().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition " + (num1+num2));
                break;
            case '-':
            System.out.println("Subtraction " + (num1-num2));
            break;
            case '*':
            System.out.println("Multiplication " + (num1*num2));
            break;
            case '/':
            System.out.println("Division " + (num1/num2));
            break;
            default:
                throw new AssertionError();
        }
    }}
