package assignment9;
import java.util.Scanner;
public class Q11 {
    public static double windChill(double windSpeed, double temperature){
        double windchill = 35.74 + (0.6215*temperature) + ((0.4275*temperature)-35.75) * Math.pow(windSpeed, 0.16);
        return windchill;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the wind speed");
        double wspeed = myObj.nextDouble();
        System.out.println("Enter the temperature");
        double temp = myObj.nextDouble();

        System.out.println("the wind wind chill for wind speed " + wspeed + " and temperature " + temp + " is " + windChill(wspeed, temp));

    }
}
