// int num1 = 0, num2 = 1;

// for (int i = 0; i < N; i++) {
//     // Print the number
//     System.out.print(num1 + " ");

//     // Swap
//     int num3 = num2 + num1;
//     num1 = num2;
//     num2 = num3;
// }

package assignment16;
import java.util.Scanner;
public class Q4 {

    public static int fiboSeq(int number){
        int num1 = 0;
        int num2 = 1;
        for(int i=0; i<=number; i++){
            System.out.println(num1);
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series");
        int number = myObj.nextInt();

        System.out.println(fiboSeq(number));
    }
}
