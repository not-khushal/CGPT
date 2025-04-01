// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint =>
// a. Take input for a number of persons
// b. Create arrays to store the weight, height, BMI, and weight status of the persons
// c. Take input for the weight and height of the persons
// d. Calculate the BMI of all the persons and store them in an array and also find the weight
// status of the persons
// e. Display the height, weight, BMI, and weight status of each person
// f. Use the table to determine the weight status of the person


package assignment7;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of persons");
        int numPerson = myObj.nextInt();
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

        for(int i=0; i<bmi.length; i++){
            bmi[i] = weight[i]/(height[i]*height[i]);
            System.out.println("BMI of is " + bmi[i]);
            if(bmi[i]<=18.4){
                System.out.println("Status - Under Weight");
            }
            else if(bmi[i]>18.5 && bmi[i]<24.9){
                System.out.println("Status - Normal");
            }
            else{
                System.out.println("Status - Over Weight");
            }
        }
}
}