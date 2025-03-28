package assignment6;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        int counter = 0;
        while(counter<num){
            counter++;
            System.out.println(counter);
        }
    }
}
