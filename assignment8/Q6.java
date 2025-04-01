// Create a program to find the mean height of players present in a football team.
// Hint => 
// The formula to calculate the mean is: mean = sum of all elements / number of elements
// Create a double array named heights of size 11 and get input values from the user.
// Find the sum of all the elements present in the array.
// Divide the sum by 11 to find the mean height and print the mean height of the football team


package assignment8;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] players = new int[11];
        double sum = 0;
        double mean = 0;

        System.out.println("Enter the height of players");
        for(int i=0; i<players.length; i++){
            System.out.println("Enter the height of " + (i+1) + " player. ");
            players[i] = myObj.nextInt();
        }

        for(int i=0; i<players.length; i++){
            sum += players[i];
            mean = sum/11;
        }
        System.out.println("Mean is " + mean);


        // for(int i = 0; i < players.length; i++){
        //     System.out.println(players[i]);
        // }
    }
}
