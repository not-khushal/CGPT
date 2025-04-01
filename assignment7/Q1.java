// 1. Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
// Hint =>
// a. Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// b. Define a double array to save salary and years of service for each of the 10 employees
// c. Also define a double array to save the new salary and the bonus amount as well as
// variables to save the total bonus, total old salary, and new salary
// d. Define a loop to take input from the user. If salary or year of service is an invalid number
// then ask the use to enter again. Note in this case you will have to decrement the index
// counter
// e. Define another loop to calculate the bonus of 10 employees based on their years of
// service. Save the bonus in the array, compute the new salary, and save in the array.
// Also, the total bonus and total old and new salary can be calculated in the loop
// f. Print the total bonus payout as well as the total old and new salary of all the employees

package assignment7;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;  

        System.out.println("Enter the salary of ten employees");
        for(int i=0; i<salary.length; i++) {
            salary[i] = myObj.nextDouble();
        }

        System.out.println("Enter the years of service");
        for(int i=0; i<yearsOfService.length; i++) {
            yearsOfService[i] = myObj.nextDouble();
        }

        for(int i=0; i<salary.length; i++) {
            if(yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        for(int i=0; i<salary.length; ++i){
            System.out.println("Old Salary of each employee "+salary[i]);
        }
        for(int i=0; i<bonus.length; ++i){
            System.out.println("Bonus amount for each employee "+bonus[i]);
        }
        for(int i=0; i<newSalary.length; ++i){
            System.out.println("New Salary of each employee "+newSalary[i]);
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }}