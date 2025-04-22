package assignment16;
import java.util.Scanner;

public class Q8 {
    public static double covertFah(double cel){
        double fah = (cel*1.8)+32;
        return fah;
    }
    public static double covertCel(double fah){
        double cel = (fah-32)/1.8;
        return cel;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1 for Cel to Fah or 2 for Fah to Cel");
        int number = myObj.nextInt();

        if(number==1){
            System.out.println("Enter the temp in Cel");
            double cel = myObj.nextInt();
            System.out.println("Temp in Fah will be " + covertFah(cel));
        }
        else{
            System.out.println("Enter the temp in Fah");
            double fah = myObj.nextInt();
            System.out.println("Temp in Cel will be " + covertFah(fah));
        }
    }
}
