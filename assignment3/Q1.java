package assignment3;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = myObj.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = myObj.nextInt();

        float quotient = num1/num2;
        float remainder = num1%num2;

        System.out.println("The quotient is " + quotient);
        System.out.println("The remainder is " + remainder);
    }
}
