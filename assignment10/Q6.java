package assignment10;
import java.util.Scanner;
public class Q6 {
    
    public static double convertFah2Cel(double fah){
        double cel = ((fah - 32) * 5 )/ 9;
        return cel;
    }
    public static double convertCel2Fah(double cel){
        double fah = (cel * (9 / 5)) + 32;
        return fah;
    }
    public static double convertPound2Kgs(double pound){
        double kgs = pound*0.453592;
        return kgs;
    }
    public static double convertKgs2Pound(double kgs){
        double pound = kgs*2.20462;
        return pound;
    }
    public static double convertGallon2Litre(double gallon){
        double litre = gallon* 3.78541;
        return litre;
    }
    public static double convertLitre2Gallon(double litre){
        double gallon = litre* 3.78541;
        return gallon;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenhiet");
        double fah = myObj.nextDouble();
        System.out.println("Enter the temperature in Celcius");
        double cel = myObj.nextDouble();
        System.out.println("Enter the weight in Pounds");
        double pound = myObj.nextDouble();
        System.out.println("Enter the weight in Kilograms");
        double kgs = myObj.nextDouble();
        System.out.println("Enter the amount in Gallons");
        double gallon = myObj.nextDouble();
        System.out.println("Enter the amount in Litres");
        double litre = myObj.nextDouble();

        System.out.println("Fahrenhiet to Celcius is " + convertFah2Cel(fah));
        System.out.println("Celcius to Fahrenhiet is " + convertCel2Fah(cel));
        System.out.println("Pound to Kilogram is " + convertPound2Kgs(pound));
        System.out.println("Kilogram to Pound is " + convertPound2Kgs(kgs));
        System.out.println("Gallon to Litre is " + convertGallon2Litre(gallon));
        System.out.println("Litre to Gallon is " + convertLitre2Gallon(litre));
    }
}
