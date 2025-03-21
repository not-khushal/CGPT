package assignment3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenhiet");
        double fah = myObj.nextDouble();

        double cel = (fah - 32) * 5/9;
        System.out.println("The temperature in celcius is " + cel);
        myObj.close();
}
}