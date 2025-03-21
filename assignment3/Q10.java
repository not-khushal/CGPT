package assignment3;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of chocolates");
        int chocolates = myObj.nextInt();
        System.out.println("Enter the number of children");
        int children = myObj.nextInt();

        int perHead = chocolates/children;
        int remaining = chocolates%children;

        System.out.println("The number of chocolate per child is " + perHead);
        System.out.println("The number of remaining chocolate is " + remaining);
    }
}
