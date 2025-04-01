// Write a program to take user input for the age of all 10 students in a class and check whether the student 
// can vote depending on his/her age is greater or equal to 18.
// Hint => 
// Define an array of 10 integer elements and take user input for the student's age. 
// Loop through the array using the length property and for the element of the array check 
// If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. 
// Otherwise, print The student with the age ___ cannot vote. 



package assignment8;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] studAge = new int[10];
        String[] eligible = new String[10];
        
        System.out.println("Enter the age of students");
        for(int i=0; i<studAge.length; i++){
            System.out.println("Enter the age of student " + (i+1));
            studAge[i] = myObj.nextInt();
            if(studAge[i]<18){
                eligible[i] = "Not eligible";
            }
            else{
                eligible[i] = "Eligible";
            }
        }

        System.out.println("Results");
        for(int i = 0; i<studAge.length; i++){
            System.out.println("The student " + (i+1) + " of age " + studAge[i] + " is " + eligible[i]);
        }
    }
}
