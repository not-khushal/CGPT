package assignment3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = myObj.nextInt();
        System.out.println("Enter 2nd number");
        int b = myObj.nextInt();

        System.out.println("The outputs are ");
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
