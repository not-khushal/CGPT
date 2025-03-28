package assignment6;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        
        for(int i=1; i<=num; i++){
            if(i%2==0){
                System.out.println("Even number are " + i);
            }
        }
        for(int i=1; i<=num; i++){
            if(i%2!=0){
                System.out.println("Odd number are " + i);
            }
        }
    }
}
