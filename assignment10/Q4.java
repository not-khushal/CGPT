package assignment10;
import java.util.Scanner;
public class Q4 {
    
    public static double convertKms2Miles(double kms){
        double miles = kms*0.621371;
        return miles;
    }
    public static double convertMiles2Kms(double miles){
        double kms = miles*1.60934;
        return kms;
    }
    public static double convertMeters2Feet(double meters){
        double feet = meters*3.28084;
        return feet;
    }
    public static double convertFeet2Meters(double feet){
        double meters = feet*0.3048;
        return meters;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of kilometers");
        double kms = myObj.nextDouble();
        System.out.println("Enter the number of miles");
        double miles = myObj.nextDouble();
        System.out.println("Enter the number of meters");
        double feet = myObj.nextDouble();
        System.out.println("Enter the number of feet");
        double meters = myObj.nextDouble();

        System.out.println("Conversion of " + kms + " kilometers will be " + convertKms2Miles(kms) + " miles ");
        System.out.println("Conversion of " + miles + " miles will be " + convertMiles2Kms(miles) + " kilometers ");
        System.out.println("Conversion of " + meters + " meters will be " + convertMeters2Feet(meters) + " feet ");
        System.out.println("Conversion of " + feet + " feet will be " + convertFeet2Meters(feet) + " meters ");
    }
}
