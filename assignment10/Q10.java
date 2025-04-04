package assignment10;
import java.util.Scanner;
public class Q10 {

    public static double bmiCalculate(double weight, double height){
        double bmi = weight/(height*height);
        return bmi;
    }

    public static String checkStatus(double bmi){
        if(bmi<=18.4){
            return "Underweight";
        }
        else if(bmi>18.5 && bmi<=24.9){
            return "Normal";
        }
        else{
            return "Overweight";
        }

    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Data for 10 people");
        int numPerson = 10;
        double[] weight = new double[numPerson];
        double[] height = new double[numPerson];
        double[] bmi = new double[numPerson];

        System.out.println("Enter weight of each person");
        for(int i=0; i<numPerson; i++){
            weight[i] = myObj.nextDouble();
        }

        System.out.println("Enter height of each person");
        for(int i=0; i<numPerson; i++){
            height[i] = myObj.nextDouble();
        }

        System.out.println("BMI for each person");
        for(int i=0; i<numPerson; i++){
            bmi[i] = bmiCalculate(weight[i], height[i]);
        }

        for(int i=0; i<numPerson; i++){
            String status = checkStatus(bmi[i]);
            System.out.println("BMI of person " + (i+1) + " is " + bmi[i] + " is " + status);
        }
    }}
