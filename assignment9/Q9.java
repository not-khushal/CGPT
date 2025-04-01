package assignment9;
import java.util.Scanner;
public class Q9 {
    
    public static String solution(int number1, int number2){
        int quotient = number1/number2;
        int remainder = number1%number2;

        return quotient + ", " + remainder;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = myObj.nextInt();
        System.out.println("Enter the second number");
        int num2 = myObj.nextInt();
        System.out.println("the quotient and remainder are " + solution(num1, num2));
    }}
