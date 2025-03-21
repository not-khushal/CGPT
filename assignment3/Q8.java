// Rewrite the Sample Program 2 with user inputs
// Hint => 
// Create variables and take user inputs for name, fromCity, viaCity, toCity
// Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
// Create Variables and take time taken 
// Finally, print the result and try to understand operator precedence.
// I/P => fee, discountPrecent
// O/P => The results of Int Operations are ___, ___, and ___



package assignment3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = myObj.next();
        System.out.println("Enter the first city");
        String fromCity = myObj.next();
        System.out.println("Enter the second city");
        String viaCity = myObj.next();
        System.out.println("Enter the third city");
        String toCity = myObj.next();

        System.out.println("Enter distance from first city to second city");
        double fromToVia = myObj.nextDouble();
        System.out.println("Enter distance from second city to third city");
        double viaToFinalCity = myObj.nextDouble();

        System.out.println("Enter time from first city to second city");
        double fromToViaTime = myObj.nextDouble();
        System.out.println("Enter time from second city to third city");
        double viaToFinalCityTime = myObj.nextDouble();

        double totalDistance = fromToVia+viaToFinalCity;
        double totalTime = fromToViaTime+viaToFinalCityTime;

        System.out.println("Total distance" + totalDistance);
        System.out.println("Total time to cover the distance" + totalTime);
    }
}
