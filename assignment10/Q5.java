package assignment10;
import java.util.Scanner;
public class Q5 {
    
    public static double convertYards2Feets(double yards){
        double feet = yards*3;
        return feet;
    }
    public static double convertFeet2Yards(double feet){
        double yards = feet*0.333333;
        return yards;
    }
    public static double convertMeters2Inches(double meters){
        double inches = meters*39.3701;
        return inches;
    }
    public static double convertInches2Meters(double inches){
        double meters = inches*0.0254;
        return meters;
    }
    public static double convertInches2Cms(double inches){
        double cms = inches*2.54;
        return cms;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of yards");
        double yards = myObj.nextDouble();
        System.out.println("Enter the number of feet");
        double feet = myObj.nextDouble();
        System.out.println("Enter the number of meters");
        double meters = myObj.nextDouble();
        System.out.println("Enter the number of inches");
        double inches = myObj.nextDouble();
        System.out.println("Enter the number of inches");
        double inches2 = myObj.nextDouble();

        System.out.println("Conversion of " + yards + " yards will be " + convertYards2Feets(yards) + " feet ");
        System.out.println("Conversion of " + feet + " feet will be " + convertFeet2Yards(feet) + " yards ");
        System.out.println("Conversion of " + meters + " meters will be " + convertMeters2Inches(meters) + " inches ");
        System.out.println("Conversion of " + inches + " inches will be " + convertInches2Meters(meters) + " meters ");
        System.out.println("Conversion of " + inches2 + " inches will be " + convertInches2Cms(inches) + " cms ");
    }

}
