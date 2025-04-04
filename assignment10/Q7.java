package assignment10;
import java.util.Scanner;
public class Q7 {
    
    public static String voteStatus(int[] num) {
        String result = "Eligible for Voting";
        for(int i=0; i<10; i++) {
            if(num[i]<18) {
                result = "Not Eligible for Voting";
                break;
            }
        }
        for(int i=0; i<10; i++) {
            return "results are " + result;
        }
        return result;
    }
        
    

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] number = new int[10];
        System.out.println("Enter the ages of studnets");
        for(int i=0; i<number.length; i++) {
            System.out.println("Enter the age of students " + (i+1));
            number[i] = myObj.nextInt();
        }

        System.out.println("Results ");
        System.out.println(voteStatus(number));
    }
}

