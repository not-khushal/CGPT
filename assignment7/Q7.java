// 7. Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
// Hint =>
// a. Take input for a number of persons
// b. Create a multi-dimensional array to store weight, height and BMI. Also create an to store
// the weight status of the persons
//        double[][] personData = new double[number][3];
//        String[] weightStatus = new String[number];
// c. Take input for weight and height of the persons and for negative values, ask the user to enter positive values
// d. Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
// e. Display the height, weight, BMI and status of each person

package assignment7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of persons");
        int numPerson = myObj.nextInt();

        double[][] personData = new double[numPerson][3];
        String[] weightStatus = new String[numPerson];

        System.out.println("Enter the weight and height for each person:");
        for(int i = 0; i < numPerson; i++) {
            System.out.println("Person " + (i+1));
            System.out.print("Weight (kg): ");
            personData[i][0] = myObj.nextDouble();
            while(personData[i][0] < 0) {
                System.out.print("Please enter positive weight: ");
                personData[i][0] = myObj.nextDouble();
            }
            
            System.out.print("Height (m): ");
            personData[i][1] = myObj.nextDouble();
            while(personData[i][1] < 0) {
                System.out.print("Please enter positive height: ");
                personData[i][1] = myObj.nextDouble();
            }
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if(personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if(personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if(personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nResults:");
        for(int i = 0; i < numPerson; i++) {
            System.out.printf("Person %d - Weight: %.1f kg, Height: %.2f m, BMI: %.1f, Status: %s%n", 
                            i+1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }}