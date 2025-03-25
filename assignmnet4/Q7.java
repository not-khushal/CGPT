package assignment4;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the weight");
        float weight = myObj.nextFloat();
        System.out.println("Enter the height");
        float height = myObj.nextFloat();

        float bmi = (weight/(height*height));

        if(bmi<=18.4){
            System.out.println("Under Weight");
        }
        else if (bmi>18.4 && bmi<24.9) {
            System.out.println("Normal");
        }
        else if (bmi>24.9 && bmi<=39.9) {
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
