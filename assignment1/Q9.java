package assignment2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter total");
        double total = myObj.nextDouble();
        System.out.println("Enter discount");
        double discount = myObj.nextDouble();
        double fees = (total*(discount/100));
        System.out.println("discounted price is " + (fees));
        System.out.println("the amount to be paid is " + (total-fees));
    }
}
