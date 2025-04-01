// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint =>
// a. Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
// b. Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
// c. Finally display the youngest and tallest of the 3 friends

package assignment7;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];

        System.out.println("Enter the age of Amar, Akbar and Antony");
        for(int i=0; i<age.length; i++){
            age[i] = myObj.nextInt();
        }
        System.out.println("Enter the height of Amar, Akbar and Antony");
        for(int i=0; i<height.length; i++){
            height[i] = myObj.nextInt();
        }

        for(int i=0; i<age.length; i++){
            if(age[0]>age[1] && age[0]>age[2]){
                System.out.println("Amar is oldest");
                break;
            }
            else if(age[1]>age[2]){
                System.out.println("Akbar is oldest");
                break;
            }
            else{
                System.out.println("Antony is oldest");
                break;
            }
        }

        for(int i=0; i<height.length; i++){
            if(height[0]>height[1] && height[0]>height[2]){
                System.out.println("Amar is tallet");
                break;
            }
            else if(height[1]>height[2]){
                System.out.println("Akbar is tallest");
                break;
            }
            else{
                System.out.println("Antony is tallest");
                break;
            }
        }
    }}
