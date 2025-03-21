package assignment3;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius");
        double cel = myObj.nextDouble();

        double fah = (cel*(9/5))+32;
        System.out.println("The temperature in fahrenhiet is " + fah);
    }
}
