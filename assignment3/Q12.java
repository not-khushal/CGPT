package assignment3;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the weight in pounds");
        double pound = myObj.nextDouble();

        double kg = pound*2.2;
        System.out.println("The weight in kgs is " + kg);
    }    
}
