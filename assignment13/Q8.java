package assignment13;

import java.util.Random;
import java.util.Scanner;

public class Q8 {
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Generate random age between 10-99
        }
        return ages;
    }
    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else {
                result[i][1] = ages[i] >= 18 ? "true" : "false";
            }
        }
        return result;
    }
    
    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students (max 10): ");
        int n = Math.min(scanner.nextInt(), 10);
        
        int[] ages = generateRandomAges(n);
        String[][] votingResults = checkVotingEligibility(ages);
        displayResults(votingResults);
        
        scanner.close();
    }
}
