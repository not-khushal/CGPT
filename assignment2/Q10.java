package assignment2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter cms");
        double cms = myObj.nextDouble();

        System.out.println("height in inches is " + (cms*0.393701));
        System.out.println("height in meters is " + (cms*0.01));
    }
}
