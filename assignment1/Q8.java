package assignment2;

import java.util.Scanner;



public class Q8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter kms");
        double kms = myObj.nextDouble();

        System.out.println("miles are: " + (kms*0.621371));
    }
}
